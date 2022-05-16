package com.example.calculatorr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumber: EditText
    lateinit var etSecond: EditText
    lateinit var btnAddition: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiplication: Button
    lateinit var btnModulus: Button
    lateinit var tvStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber=findViewById(R.id.etNumber)
        etSecond=findViewById(R.id.etSecond)
        btnAddition=findViewById(R.id.btnAddition)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiplication=findViewById(R.id.btnMultiplication)
        btnModulus=findViewById(R.id.btnModulus)
        tvStatus=findViewById(R.id.tvStatus)

        btnAddition.setOnClickListener {

            val num1=etNumber.text.toString().toDouble()
            val num2=etSecond.text.toString().toDouble()
            plus(num1,num2)
        }
        btnSubtract.setOnClickListener {
            val num1=etNumber.text.toString().toDouble()
            val num2=etSecond.text.toString().toDouble()
            minus(num1,num2)
        }
        btnMultiplication.setOnClickListener {
            val num1=etNumber.text.toString().toDouble()
            val num2=etSecond.text.toString().toDouble()
            multiply(num1,num2)
        }
        btnModulus.setOnClickListener {
            val num1=etNumber.text.toString().toDouble()
            val num2=etSecond.text.toString().toDouble()
            modulus(num1,num2)
        }

        }
        fun plus (num1:Double,num2:Double){
            val total=num1+num2
            tvStatus.text=total.toString()
        }
        fun minus (num1:Double,num2:Double){
            val total=num1-num2
            tvStatus.text=total.toString()
        }
        fun multiply (num1:Double,num2:Double){
            val total=num1*num2
            tvStatus.text=total.toString()
        }
        fun modulus (num1:Double,num2:Double){
            val total=num1%num2
            tvStatus.text=total.toString()
        }


    }
