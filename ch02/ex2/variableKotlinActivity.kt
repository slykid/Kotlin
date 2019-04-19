package com.example.slyki.myfirstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class variableKotlinActivity : AppCompatActivity()
{
    var clickCount = 0
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        // UI 로 사용할 레이아웃 XML 파일 지정
        setContentView(R.layout.layout_variable)

        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)

        startTimeLabel.text = "Activity 시작시간: ${timeText}"
        clickCountLabel.text = "버튼이 클릭된 횟수: ${clickCount}"
        button.setOnClickListener{
            clickCount = clickCount + 1
            clickCountLabel.text = "버튼이 클릭된 횟수: ${clickCount}"
        }
    }
}
