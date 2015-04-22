/*
 * Copyright 1999,2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.taglibs.i18n;

import java.io.IOException;

import java.text.MessageFormat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 *  This class implements a body tag that allows you to use a resource bundle
 *  to internationalize content in a web page. The "key" attribute is required,
 *  and is used to look up content in the resource bundle. The "args" attribute
 *  is optional, and if present, provides items to pass to a MessageFormat.
 *
 *  The BundleTag must first be used in order to ensure that the proper bundle
 *  is loaded.
 *  <P>
 *  <H2>Examples</H2>
 *  <PRE>
 *  &lt;i18n:bundle baseName="test"/&gt;
 *  &lt;i18n:getMessage key="test"/&gt;
 *  &lt;i18n:getMessage key="test" args="1,2,3"/&gt;
 *  etc...
 *  </PRE>
 *  <P>
 *
 *  @author <a href="mailto:tdawson@wamnet.com">Tim Dawson</a>
 *
 */
public class MessageBodyTag extends BodyTagSupport
{
    // instance variables used during processing
     private String               _key = null;
    private String               _value = null;
    private ResourceBundle       _bundle = null;
    private String               _bundleRef = null;
    private Object []		 _args = null;
    private boolean              _debug = false;

    // these are reused for each message tag; luckily tags are thread-safe
    private MessageFormat  _messageFormat = new MessageFormat("");
  //    private List           _arguments = new ArrayList();

    /**
     *  sets the key to use when looking up the value in the bundle
     */
      public final void setKey(String key)
      {
          _key = key;
      }

    /**
     *  sets the bundle based on a variable defined in the page<br>
     *  if neither bundle or bundleRef are specified, uses the first bundle
     *  defined on the page by the i18n:bundle tag
     */
    public final void setBundleRef(String varName)
    {
        _bundleRef = varName;
    }

    /**
     *  sets the bundle to an actual ResourceBundle object<br>
     *  if neither bundle or bundleRef are specified, uses the bundle most recently
     *  defined on the page by the i18n:bundle tag
     */
    public final void setBundle(ResourceBundle aBundle)
    {
        _bundle = aBundle;
    }

    /**
     *  @return the bundle to use
     */
    private ResourceBundle getBundle() throws JspException
    {
        ResourceBundle bundle = _bundle;
        if ( bundle == null ) {
            if ( _bundleRef != null ) {
                bundle = (ResourceBundle)pageContext.getAttribute(_bundleRef);
                if ( bundle == null ) {
                    throw new JspTagException(
                        "i18n:messageBody tag, could not find bundleRef=" + _bundleRef);
                }
            } else {
                BundleTag bundleTag = (BundleTag)this.findAncestorWithClass(this,BundleTag.class);
                if (bundleTag != null) {
                    return bundleTag.getBundle();
                }
                bundle = ResourceHelper.getBundle(pageContext);
            }
        }
        return bundle;
    }

    /**
     * Turn debugging log messages on or off
     */
    public final void setDebug(boolean value)
    {
        _debug = value;
    }

    /**
     *  adds to the list of arguments used when formatting the message
     */
    //protected final void addArg(Object arg)
  //    {
  //        _arguments.add(arg);
  //        if (_debug) {
  //            ServletContext sc = pageContext.getServletContext();
  //            sc.log("i18n:messageBody added arg: " + arg.toString());
  //        }
  //    }

    /**
     *  allows setting all the arguments at once
     */
  //    public final void setArgs(Object[] args)
  //    {
  //        _args = args;
  //    }

    /**
     *  clears the argument list so that sub tags can call addArgument
     *  clears out any previous key and value in case key is not provided,
     *  or the value is null
     */
    public final void release()
    {
        super.release();
	//        if (_arguments != null)
	//        {
	//            _arguments.clear();
	//        }
        _key = null;
        _value = null;
        _bundle = null;
        _bundleRef = null;
        _args = null;
        _debug = false;
        _messageFormat = null;
	//        _arguments = null;
    }

  /**
   *  locates the bundle and gets the value
   */
  public final int doStartTag() throws JspException
    {
       // Reset value for resource bundle key
       _value = null;

        // Reset the arguments
       //        if (_arguments != null) {
       //            _arguments.clear();
       //        }
       //        if ( _args != null ) {
       //            _arguments.addAll(Arrays.asList(_args));
       //        }

       return EVAL_BODY_BUFFERED;
    }

    /**
     *  If key is not found, use the body content as a default value.
     */
    public int doAfterBody() throws JspException
    {
        ResourceBundle bundle = this.getBundle();
        if ( bundle == null ) {
            throw new JspTagException(
                "i18n:messageBody tag, no bundle available for use.");
        }

        // if the value is null, set the key to body content 
	// and check for the key in the bundle if it is not found then use the body content
        if ( _value == null ) {
  
	  _key = bodyContent.getString();

	  if(_key != null) {
	    // see if the bundle has a value, if not, we default to the tag contents
	    try {
	      _value = bundle.getString(_key);
	      if (_debug) {
                ServletContext sc = pageContext.getServletContext();
                sc.log("i18n:messageBody tag: template for " + _key + " is: " + _value);
	      }
	    } catch (java.util.MissingResourceException e) {
	      ServletContext sc = pageContext.getServletContext();
	      sc.log("i18n:messageBody tag, value not found for key:" + _key);
	    }
	    //	    _value = bundle.getString(_key);
	  } else {
	    _value = bodyContent.getString();
	  }

        }
        // cleanup
        bodyContent.clearBody();
    	return SKIP_BODY;
    }

    /**
     *  Performs the proper runtime substitution. If an id attribute was
     *  specified, then it is assumed that this tag is merely defining a
     *  string variable; otherwise output is provided.
     */
    public final int doEndTag() throws JspException
    {
      try {
	// perform parameter substitutions
	if ( _value != null ) { //&& _arguments != null && _arguments.size() > 0) {
	  // reformat the value as specified
	  _messageFormat.setLocale(getBundle().getLocale());
	  _messageFormat.applyPattern(_value);
	  //	  _value = _messageFormat.format(_arguments.toArray());
	}
	
	if ( _value == null) {
	  if (_debug) {
	    ServletContext sc = pageContext.getServletContext();
	    sc.log("i18n: messageBody: skipping null value for " + _key);
	  }
	} else if (id != null) {
	  // define the variable in the page context
	  pageContext.setAttribute(id,_value);
	} else {
	  // print the value to the JspWriter
	  this.pageContext.getOut().print(_value);
	}
      } catch (java.io.IOException e) {
	throw new JspTagException("i18n:messageBody tag IO Error: " + e.getMessage());
      }
      // only process the body once
      return EVAL_PAGE;
    }

}
