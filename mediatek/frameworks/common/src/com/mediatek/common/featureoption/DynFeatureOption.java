/* generated by mediatek */

package com.mediatek.common.featureoption;

import java.util.ArrayList;

public final class DynFeatureOption
{
    static {
        System.loadLibrary("dfo_jni");
    }
    
    public native static boolean getBoolean(String featureName);
    public native static int getInt(String featureName);
}