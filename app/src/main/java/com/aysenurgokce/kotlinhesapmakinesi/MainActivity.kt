package com.aysenurgokce.kotlinhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.aysenurgokce.kotlinhesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var numberText1: EditText
    private lateinit var numberText2: EditText
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        numberText1 = findViewById(R.id.numberText1)
        numberText2 = findViewById(R.id.numberText2)
        resultText = findViewById(R.id.resultText)
    }
    //Toplama işlemini yapalım
    fun toplama(view : View){
        val number1 = binding.numberText1.text.toString().toDoubleOrNull()
        val number2 = binding.numberText2.text.toString().toDoubleOrNull()

        if(number1 ==null || number2==null){
            binding.resultText.text = "Lütfen geçerli bir sayı giriniz!"
        }else{
            val result = number1  +number2
            binding.resultText.text = "Result.${result}"
        }
    }
    fun cıkartma(view: View){
        val number1 =  binding.numberText1.text.toString().toDoubleOrNull()
        val number2 =  binding.numberText2.text.toString().toDoubleOrNull()
        if(number1 == null || number2 ==null ){
            binding.resultText.text = "Lütfen geçerli bir sayı giriniz"
        }else{
            val result = number1 - number2
            binding.resultText.text = "Result: ${result}"
        }
    }
    fun carpma(view: View) {
        val number1 = binding.numberText1.text.toString().toDoubleOrNull()
        val number2 = binding.numberText2.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Lütfen geçerli bir sayı giriniz!"
        } else {
            val result = number1 * number2
            binding.resultText.text = "RESULT: $result"
        }
    }
    fun bolme(view: View){
        val number1 = binding.numberText1.text.toString().toDoubleOrNull()
        val number2 = binding.numberText2.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Lütfen geçerli bir sayı giriniz!"
        } else if (number2 == 0.0) {
            binding.resultText.text = "Bir sayı 0'a bölünemez!"
        } else {
            val result = number1 / number2
            binding.resultText.text = "RESULT: $result"
        }
    }

}