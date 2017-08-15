
#include "com_jacky_jni_JniTest.h"

JNIEXPORT jstring JNICALL Java_com_jacky_jni_JniTest_getJniString
        (JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "hello jni");
}
