package com.example.uts_khan_mobile_b1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_khan_mobile_b1.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private val binding by lazy { ActivityThirdBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}