package com.example.slyki.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    // testButton1의 클릭 횟수
    int clickCount1 = 0;

    // testButton2의 클릭 횟수
    int clickCount2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // "프로그래밍을 시작해보자 메세지를 잠시 출력
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        // 레이아웃에 testButton1 ID로 선언된 뷰에 클릭 이벤트 리스너를 넣어준다.
        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 클릭카운트 1 증가
                clickCount1 += 1;

                // 클릭 횟수만큼 반복하면서 반복 횟수 메세지를 출력
                showMessage(clickCount1);
            }
        });

        // 레이아웃에 testButton2 ID로 선언된 뷰에 클릭 이벤트 리스너를 넣어준다.
        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 클릭 카운트 1 증가
                clickCount2 += 1;

                // 클릭 횟수만큼 반복하면서 반복 횟수 메세지를 출력
                showMessage(clickCount2);
            }
        });
    }

    void showMessage(int clickCount){
        // 클릭 횟수만큼 반복하면서 반복 횟수 메세지를 출력
        if(clickCount % 2 == 0)
            Toast.makeText(getApplicationContext(), "클릭횟수: " + clickCount, Toast.LENGTH_LONG).show();
        else if(clickCount % 3 == 0)
            Toast.makeText(getApplicationContext(), "Hello, World", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
    }

}
