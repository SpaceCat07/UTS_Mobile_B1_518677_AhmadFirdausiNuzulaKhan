package com.example.uts_khan_mobile_b1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uts_khan_mobile_b1.databinding.ActivitySecondBinding
import com.example.uts_khan_mobile_b1.databinding.ActivityThirdBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.nama.text = intent.getStringExtra("name")

        binding.buttonClose.setOnClickListener {
            val intentToThirdActivity = Intent(this, ThirdActivity::class.java)
            startActivity(intentToThirdActivity)
            Toast.makeText(this, "You've successfuly logout", Toast.LENGTH_SHORT).show()
        }
    }
}