package com.example.slyki.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Car car1 = new Car(3, 100, 4);
    Car car2 = new Car(10, 50, 8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Activity 의 UI를 R.layout.activity_main 으로 지정함
        setContentView(R.layout.activity_second);

        // "프로그래밍을 실행해보자!" 메세지 잠시 출력
        Toast.makeText(getApplicationContext(), "프로그래밍을 실행해보자!", Toast.LENGTH_LONG).show();

        //레이아웃 button이라는 ID로 선언된 뷰에 클릭 이벤트 리스너 생성
        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                car1.accelerationPedal();
                car2.accelerationPedal();

                String info = "car1: " + car1.getCurrentSpeedText() + ", car2: " + car2.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                car1.brakePedal();
                car2.brakePedal();
                String info = "car1: " + car1.getCurrentSpeedText() + ", car2: " + car2.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
