package com.example.layoutbeginnerthirdkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.layoutbeginnerthirdkotlin.model.Account

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }



    fun initView(){
        var loginButton = findViewById<Button>(R.id.bt_login)
        loginButton.setOnClickListener{
            var userIDedit = findViewById<EditText>(R.id.et_user_id)
            var passwordEdit = findViewById<EditText>(R.id.et_password)
            var account = Account(userIDedit.text.toString(),passwordEdit.text.toString())
            openSecondActivity(account)
        }

     }
    fun openSecondActivity( account: Account){
        var intern = Intent(this ,SecondActivity::class.java)
        intern.putExtra("zm" , account)
        startActivity(intern)

    }
}