package com.example.layoutbeginnerthirdkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbeginnerthirdkotlin.model.Account
import java.io.Serializable

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }
     fun initView(){
        var userId  = findViewById<TextView>(R.id.tv_user_id)
        var passwordd = findViewById<TextView>(R.id.tv_password)
        var button = findViewById<Button>(R.id.bt_back)
        var account: Account = intent.getSerializableExtra("zm") as Account
        userId.setText(account.userID)
        passwordd.setText(account.password_)
         button.setOnClickListener{
             backToMainActivity()
         }
     }
    fun backToMainActivity(){
        var intentt  = Intent(this , MainActivity::class.java)
        startActivity(intentt)
    }
}