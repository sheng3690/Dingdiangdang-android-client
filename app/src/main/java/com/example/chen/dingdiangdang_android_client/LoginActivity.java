package com.example.chen.dingdiangdang_android_client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText et1 = null;
    private EditText et2 = null;
    private Button bt1 = null;
    private Button bt2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1 = (EditText)findViewById(R.id.phoneNumberEditText);
        et2 = (EditText)findViewById(R.id.checkNumberEditText);
        bt1 = (Button)findViewById(R.id.sendCheckButton);
        bt2 = (Button)findViewById(R.id.loginButton);

        bt1.setOnClickListener(new MyBt1ClickListener());
        bt2.setOnClickListener(new MyBt2ClickListener());
    }

    private class MyBt1ClickListener implements Button.OnClickListener{
        @Override
        public void onClick(View view) {
            Toast.makeText(LoginActivity.this,"点击发送验证码按钮",Toast.LENGTH_SHORT).show();
        }
    }

    private class MyBt2ClickListener implements Button.OnClickListener{
        @Override
        public void onClick(View view) {
            String s1 = et1.getText().toString();
            String s2 = et2.getText().toString();
            int phoneNumber = Integer.parseInt(s1);
            int checkNumber = Integer.parseInt(s2);
            String s = String.format("点击登陆按钮,手机号：%d  验证码：%d",phoneNumber,checkNumber);
            Toast.makeText(LoginActivity.this,s,Toast.LENGTH_SHORT).show();
        }
    }
}
