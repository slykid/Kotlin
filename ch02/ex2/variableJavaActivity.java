package com.example.slyki.myfirstkotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class variableJavaActivity extends AppCompatActivity
{
    // 버튼이 클릭된 횟수 저장 변수
    int clickCount = 0;

    // Activity의 시작시간을 저장하는 변수
    long startTime = System.currentTimeMillis();

    // Activity 시작 시간을 보여주는 Text View
    TextView startTimeLabel;
    TextView clickCountLabel;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // UI 로 사용할 레이아웃 XML 파일 지정
        setContentView(R.layout.layout_variable);

        startTimeLabel = findViewById(R.id.startTimeLabel);

        clickCountLabel = findViewById(R.id.clickCountLabel);

        button = findViewById(R.id.button);

        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);

        startTimeLabel.setText("Activity 시작시간: " + timeText);
        clickCountLabel.setText("버튼이 클릭된 횟수: " + clickCount);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                clickCount = clickCount + 1;
                clickCountLabel.setText("버튼이 클릭된 횟수: " + clickCount);
            }
        });
    }
}
