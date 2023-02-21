package com.example.simplecalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.graphics.drawable.ColorDrawable

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#FF018786")))

        plus.setOnClickListener {
            add()
        }

        minus.setOnClickListener {
            subtract()
        }
    }

    fun  inputIsNotEmpty():Boolean{
        var b=true;
        if(input1.text.toString().trim().isEmpty()){
            input1.error="Required"
            input1.requestFocus()
            b=false;
        }
        if(input2.text.toString().trim().isEmpty()){
            input2.error="Required"
            input2.requestFocus()
            b=false;
        }
        return  b;
    }

    fun add(){
        if(inputIsNotEmpty()){
            var inputdata1=input1.text.toString().trim().toBigDecimal()
            var inputdata2=input2.text.toString().trim().toBigDecimal()
            result.text=inputdata1.add(inputdata2).toString()
        }
    }

    fun subtract(){
        if(inputIsNotEmpty()){
            var inputdata1=input1.text.toString().trim().toBigDecimal()
            var inputdata2=input2.text.toString().trim().toBigDecimal()
            result.text=inputdata1.subtract(inputdata2).toString();
        }
    }






}