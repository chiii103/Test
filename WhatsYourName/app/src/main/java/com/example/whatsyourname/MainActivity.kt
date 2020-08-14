package com.example.whatsyourname

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {//画面が開いたときに最初にやることを書く場所

        //おまじない
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 「押してね」ボタンを押したら
        button.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {//ボタンが押されたときにやることを書く場所

        //Todo 1.「〇〇（入力した文字）さん、こんにちは」という文字を表示する
        personNameText = editTextTextPersonName.text.toString() + "さん、こんにちは"
        // 2．画像を出す
        imageView.setImageResource(R.drawable.hello)

    }

}