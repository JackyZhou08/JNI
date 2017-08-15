package com.jacky.jni;

/**
 * Created by Jacky-PC on 2017/8/15.
 */

public class JniTest {
    static {
        System.loadLibrary("JackyChou");
    }

    public native String getJniString();
}
