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
        // Activity 의 UI 를 R.layout.activity_main 으로 지정함
        setContentView(R.layout.activity_main);
        
        // "프로그래밍을 시작해보자!" 메세지를 잠시 출력함
        Toast.makeText(getApplicationContext(), "프로그래밍을 실행해보자!", Toast.LENGTH_LONG).show();

        //레이아웃 button이라는 ID로 선언된 뷰에 클릭 이벤트 리스너 생성
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                // 클릭 카운트 1 증가
                clickCount = clickCount + 1;
                
                // 버튼이 클릭되면 클릭된 횟수를 증가하면서 토스트 메세지를 
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
