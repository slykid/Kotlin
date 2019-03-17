package com.example.slyki.myfirstkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 레이아웃에 button 이라는 ID 로 선언된 뷰에 클릭 이벤트 리스너를 등록함
        button1.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        button2.setOnClickListener{
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }
    }
}
