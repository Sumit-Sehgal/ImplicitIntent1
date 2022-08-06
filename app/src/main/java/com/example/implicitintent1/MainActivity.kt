package com.example.implictintent

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.implicitintent1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var tv1:TextView
    lateinit var tv2:TextView
    lateinit var tv3:TextView
    lateinit var tv4:TextView
    lateinit var tv5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tv1.setOnClickListener {
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:1234567890")
            startActivity(intent)
        }
        binding.tv2.setOnClickListener {
            val intent=Intent(Intent.ACTION_SEND)
            intent.data=Uri.parse("sms:1234567890")
            startActivity(intent)
        }
        binding.tv3.setOnClickListener {
            val intent=Intent(Intent.ACTION_SENDTO)
            intent.data=Uri.parse("mailto:abc@gmail.com")
            startActivity(intent)
        }
        binding.tv4.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://play.google.com/store/apps")
            startActivity(intent)
        }
        binding.tv5.setOnClickListener {
            val intent2=Intent(Intent.ACTION_SEND)
            intent2.data= Uri.parse("")
//            startActivity(intent2.createChooser())
        }

    }
}