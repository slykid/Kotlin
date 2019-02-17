package com.example.slyki.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 버튼이 클릭된 횟수 저장 변수
    int clickCount = 0;

    /**
     * MainActivity 가 최소 실행될 때 시작한다.
     * 자바독 주석을 확인하려면 F1 키를 누르자
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Activity 의 UI를 R.layout.activity_main 으로 지정한다
        Toast.makeText(getApplicationContext(), "프로그래밍을 실행해보자!", Toast.LENGTH_LONG).show();

        //레이아웃 button이라는 ID로 선언된 뷰에 클릭 이벤트 리스너 생성
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                // 버튼 클릭 시  count 1 증가
                clickCount = clickCount + 1;
                
                // 버튼 클릭 시 count 증가후 해당 count 를 토스트 메세지로 
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
