package com.example.chen.dingdiangdang_android_client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button pictrue_button = null;
    private Boolean loged = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pictrue_button = (Button) findViewById(R.id.picture_button);
        pictrue_button.setOnClickListener(new MyClickListener());

        if (!loged){
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            MainActivity.this.startActivityForResult(intent,0);
        }
    }


    private class MyClickListener implements Button.OnClickListener{
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"点击拍照答疑按钮",Toast.LENGTH_SHORT).show();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("ding","onActivityResult");
        switch (resultCode) {
            case RESULT_OK:
                Log.d("ding","RESULT_OK");
                break;
            default:
                Log.d("ding","not RESULT_OK");
                break;
        }
    }
}
