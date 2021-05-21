package com.huangshi.demo05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText address;
    private EditText content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取页面中收件人地址、短信内容
        address = findViewById(R.id.address);
        content = findViewById(R.id.content);
        Button bt = findViewById(R.id.send);
        // 使用外部类的实例作为事件监听
        bt.setOnLongClickListener(new SendSmsListener(this,address.getText().toString(),content.getText().toString()));
    }
}