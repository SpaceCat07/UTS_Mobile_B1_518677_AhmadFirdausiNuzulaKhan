package com.example.uts_khan_mobile_b1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uts_khan_mobile_b1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonSubmit.setOnClickListener {
            val nama = binding.inputText.text.toString()
            if (nama.isNotEmpty()) {
                val intentToSecondActivity = Intent(this, SecondActivity::class.java)
                intentToSecondActivity.putExtra("name", nama)
                startActivity(intentToSecondActivity)
            } else {
                Toast.makeText(this, "Enter Your name first", Toast.LENGTH_SHORT).show()
            }
        }
    }
}