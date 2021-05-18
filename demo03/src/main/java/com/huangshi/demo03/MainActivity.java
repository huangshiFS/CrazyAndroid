package com.huangshi.demo03;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取布局文件中的LinearLayout容器
        LinearLayout root = findViewById(R.id.root);
        // 创建DrawView组件
        DrawView draw = new DrawView(this);
        // 设置自定义组件最小宽度、最小高度
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        root.addView(draw);
        // 定义一个文本框
//        TextView hello = new TextView(this);
//        hello.setText("Hello Android");
    }
}