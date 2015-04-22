///////////////////////////////////////////////////////////////////////
// Project: Iternum Swlink
// File: $RCSfile: PropertySyncAction.java,v $
// Copyright: (C) 2006 iternum GmbH
// Author: bankkar
// Revision: $Revision: 1.11 $ 
// Last changed on $Date: 2006/04/29 15:50:47 $ by $Author: bankkar $
//
// Licensed under the Apache License, Version 2.0
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
///////////////////////////////////////////////////////////////////////

package com.iternum.swlink.action;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import com.iternum.swlink.LinkException;

/**
 * This action is used to synchronize an Property from
 * a source to a target.
 * @author Karl F. Banke
 *
 */
public class PropertySyncAction extends AbstractAction {

    /** Parameter constant.*/
    private static final String PARAM_TARGET_PROPERTY_NAME = "targetProperty";
    /** Parameter constant.*/
    private static final String PARAM_SOURCE_PROPERTY_NAME = "sourceProperty";
    
    private String  myTargetProperty;
    private String  mySourceProperty;
    
    /**
     * Default Constructor.
     *
     */
    public PropertySyncAction() {
        super();
    }
    
    /**
     * Creates a PropertySyncAction for a unidirectional
     * property change.
     * 
     * @param pSourceProperty - The name of the 
     *  source to synchronize with
     * @param pTargetProperty - The name of the 
     * source to synchronize to
     * @param pReentrant <code>true</code> if this action is reentrant
     */
    public PropertySyncAction(String pSourceProperty,
            String pTargetProperty, boolean pReentrant) {
        super();
        mySourceProperty = pSourceProperty;
        myTargetProperty = pTargetProperty;
        this.setReentrant(pReentrant);
    }

    /** 
     * Retrieves the getter and setter methods and invokes the
     * application. Note that the setter method is resolved at 
     * runtime from the actual type of the Object that has been
     * retrieved from the setter method. If the returned object 
     * of the getter method is null, the setter methods type
     * is assumed to be java.lang.Object 
     * @see com.iternum.swlink.Action#perform(
     *  java.lang.Object, java.lang.Object, java.lang.Object)
     * @param pSource - The source object to obtain the 
     *  property from
     * @param pTarget - The target object to synchronize
     *  the property to
     * @param pArgs - Additional arguments - ignored for this Activator
     */
    public void performAction(Object pSource, Object pTarget, Object pArgs) {
        Object   theValue;

        try {
            theValue = PropertyUtils.getProperty(pSource,mySourceProperty);
            //PropertyUtils.setProperty(pTarget,myTargetProperty,theValue);

	    //
	    // Patched by Hari to "clone" whole beans at a time if we want 
	    // to property-sync two complex types. 
	    //

	    if (theValue != null && !theValue.getClass().getName().startsWith("java")) {
		BeanUtils.copyProperties(pTarget, pSource);
	    } else {
		BeanUtils.copyProperty(pTarget,myTargetProperty,theValue);
	    } 

        } catch (IllegalArgumentException theExc) {
            throw new LinkException(
                "Could not get/set for "+mySourceProperty
                +"/"+myTargetProperty,theExc);
        } catch (IllegalAccessException theExc) {
            throw new LinkException(
                "Could not get/set for "+mySourceProperty
                +"/"+myTargetProperty,theExc);
        } catch (InvocationTargetException theExc) {
            throw new LinkException(
                "Could not get/set for "+mySourceProperty
                +"/"+myTargetProperty,theExc);
        } catch (NoSuchMethodException theExc) {
            throw new LinkException(
                "Could not get/set for "+mySourceProperty
                +"/"+myTargetProperty,theExc);
        }
        
        
    }
    
    /** 
     * @see com.iternum.swlink.Action#close()
     */
    public void close() {

    }

    /**
     * @param pParam A Map with the entries for the target and source
     * property name using keys as defined in the public constants
     * in this class.
     */
    public void setActionParam(Map pParam) {
        if (pParam.containsKey(PARAM_SOURCE_PROPERTY_NAME)) {
            String  theSourceProperty = (String) pParam.get(
                PARAM_SOURCE_PROPERTY_NAME);
            setSourceProperty(theSourceProperty);
        }
        if (pParam.containsKey(PARAM_TARGET_PROPERTY_NAME)) {
            String  theTargetProperty = (String) pParam.get(
                PARAM_TARGET_PROPERTY_NAME);
            setSourceProperty(theTargetProperty);
        }
        
    }

    /**
     * @return Returns the sourceProperty.
     */
    public String getSourceProperty() {
        return mySourceProperty;
    }

    /**
     * @param pSourceProperty The sourceProperty to set.
     */
    public void setSourceProperty(String pSourceProperty) {
        mySourceProperty = pSourceProperty;
    }

    /**
     * @return Returns the targetProperty.
     */
    public String getTargetProperty() {
        return myTargetProperty;
    }

    /**
     * @param pTargetProperty The targetProperty to set.
     */
    public void setTargetProperty(String pTargetProperty) {
        myTargetProperty = pTargetProperty;
    }

}
