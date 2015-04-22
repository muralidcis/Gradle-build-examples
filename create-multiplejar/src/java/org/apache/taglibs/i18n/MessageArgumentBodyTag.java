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

import java.text.MessageFormat;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 *  This class implements is used inside a MessageTag to create an ordered
 *  list of arguments to use with java.text.MessageFormat.
 *  <P>
 *  <H2>Examples</H2>
 *  <PRE>
 *  &lt;i18n:getMessage key="test"/&gt;
 *  &lt;i18n:msgArg/&gt;&lt;bean:write name="beanName" property="property"/&gt;&lt;/msgArg&gt;
 *  &lt;i18n:msgArg value="&lt;%= test %&gt;"/&gt;
 *  &lt;/i18n:getMessage&gt;
 *  etc...
 *  </PRE>
 *  <P>
 *  @see org.apache.taglibs.i18n.MessageTag
 *  @see java.text.MessageFormat
 *
 *  @author <a href="mailto:tdawson@wamnet.com">Tim Dawson</a>
 *
 */
public class MessageArgumentBodyTag extends BodyTagSupport
{
  private Object value = null;

  /**
   *  locate the parent tag and add the argument to the Message's arg list
   */
  public void setValue(Object argumentValue) throws JspException
    {
      this.value = argumentValue;

        // Get the parent MessageTag
        MessageTag messageTag = null;
        try {
            messageTag = (MessageTag)this.getParent();
        } catch (ClassCastException e) {
            ;
        }

        if ( messageTag == null ) {
            throw new JspTagException(
                "i18n:msgArg tag must be nested inside a message tag.");
        }

        // now we know we're safe to add the argument
        messageTag.addArg(argumentValue);
    }


    /**
     *  clears the argument list so that sub tags can call addArgument
     *  clears out any previous key and value in case key is not provided,
     *  or the value is null
     */
    public final void release()
    {
        super.release();
        value = null;
    }

  public final int doStartTag() throws JspException
  {
      return EVAL_BODY_BUFFERED ;
  }
  
  /**
   *  If key is not found, use the body content as a default value.
   */
  public int doAfterBody() throws JspException
  {
    // if the value is null, use the body content
    if (value == null ) {
      value = bodyContent.getString();

      // Get the parent MessageTag
      MessageTag messageTag = null;
      try {
	messageTag = (MessageTag)this.getParent();
      } catch (ClassCastException e) {
	;
      }
      
      if ( messageTag == null ) {
	throw new JspTagException(
				  "i18n:msgArg tag must be nested inside a message tag.");
      }
      
      // now we know we're safe to add the argument
      messageTag.addArg(value);
      
      value=null;
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
      // only process the body once
	//release();
      return EVAL_PAGE;
    }
}
