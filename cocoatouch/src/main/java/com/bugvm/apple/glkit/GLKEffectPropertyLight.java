/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package com.bugvm.apple.glkit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GLKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKEffectPropertyLight/*</name>*/ 
    extends /*<extends>*/GLKEffectProperty/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKEffectPropertyLightPtr extends Ptr<GLKEffectPropertyLight, GLKEffectPropertyLightPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GLKEffectPropertyLight.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKEffectPropertyLight() {}
    protected GLKEffectPropertyLight(NSObject.SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "position")
    public native @ByVal GLKVector4 getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal GLKVector4 v);
    @Property(selector = "ambientColor")
    public native @ByVal GLKVector4 getAmbientColor();
    @Property(selector = "setAmbientColor:")
    public native void setAmbientColor(@ByVal GLKVector4 v);
    @Property(selector = "diffuseColor")
    public native @ByVal GLKVector4 getDiffuseColor();
    @Property(selector = "setDiffuseColor:")
    public native void setDiffuseColor(@ByVal GLKVector4 v);
    @Property(selector = "specularColor")
    public native @ByVal GLKVector4 getSpecularColor();
    @Property(selector = "setSpecularColor:")
    public native void setSpecularColor(@ByVal GLKVector4 v);
    @Property(selector = "spotDirection")
    public native @ByVal GLKVector3 getSpotDirection();
    @Property(selector = "setSpotDirection:")
    public native void setSpotDirection(@ByVal GLKVector3 v);
    @Property(selector = "spotExponent")
    public native float getSpotExponent();
    @Property(selector = "setSpotExponent:")
    public native void setSpotExponent(float v);
    @Property(selector = "spotCutoff")
    public native float getSpotCutoff();
    @Property(selector = "setSpotCutoff:")
    public native void setSpotCutoff(float v);
    @Property(selector = "constantAttenuation")
    public native float getConstantAttenuation();
    @Property(selector = "setConstantAttenuation:")
    public native void setConstantAttenuation(float v);
    @Property(selector = "linearAttenuation")
    public native float getLinearAttenuation();
    @Property(selector = "setLinearAttenuation:")
    public native void setLinearAttenuation(float v);
    @Property(selector = "quadraticAttenuation")
    public native float getQuadraticAttenuation();
    @Property(selector = "setQuadraticAttenuation:")
    public native void setQuadraticAttenuation(float v);
    @Property(selector = "transform")
    public native GLKEffectPropertyTransform getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(GLKEffectPropertyTransform v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}