package com.onurhanhacimustafaoglu.viewbindingkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.onurhanhacimustafaoglu.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener{

        }
        binding.textView.text ="Test"
        binding.editText.setText("EditText Test")


        

        }
    }
