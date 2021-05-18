package com.huangshi.demo04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    // 定义飞机的移动速度
    private int speed = 10;
    private PlaneView planeView;
    DisplayMetrics metrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 创建PlaneView组件
        planeView = new PlaneView(this);
        setContentView(planeView);
        planeView.setBackgroundResource(R.drawable.bg);
        // 获取窗口管理器
        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        metrics = new DisplayMetrics();
        // 设置飞机的初始位置
        planeView.currentX = (metrics.widthPixels / 2);
        planeView.currentY = (metrics.heightPixels - 200);
        planeView.setOnTouchListener(new MyTouchListner());
    }
    class MyTouchListner implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getX() < metrics.widthPixels / 8){
                planeView.currentX -= speed;
            }
            if(event.getX() > metrics.widthPixels * 7 / 8){
                planeView.currentX += speed;
            }
            if(event.getY() < metrics.heightPixels / 8){
                planeView.currentY -= speed;
            }
            if(event.getY() < metrics.heightPixels * 7 / 8){
                planeView.currentY += speed;
            }
            return true;
        }
    }
}