package com.jacky.jni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        JniTest jniTest = new JniTest();
        Toast.makeText(this,jniTest.getJniString(),Toast.LENGTH_LONG).show();
        ((TextView)findViewById(R.id.tv)).setText(jniTest.getJniString());
    }
}
