package com.example.countapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countapp.databinding.ActivityMainBinding
import android.widget.Toast

private lateinit var binding: ActivityMainBinding
private var count = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // setup binding // hubungkan dengan UI
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set UI dari activity dengan binding
        setContentView(binding.root)

        // gunakan binding untuk akses UI components
        with(binding) {
            tvCount.text = count.toString()

            // ketika Button count di klik, maka count + 1
            btnCount.setOnClickListener {
                count++
                tvCount.text = count.toString()
            }

            btnToast.setOnClickListener {
                Toast
                    .makeText(
                        this@MainActivity,
                        "Counter $count",
                        Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}