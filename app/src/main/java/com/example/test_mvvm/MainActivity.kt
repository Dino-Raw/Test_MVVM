package com.example.test_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.test_mvvm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var vm: MainViewModel
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vm = ViewModelProvider(this)[MainViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.setFullNameBtn.setOnClickListener {
            vm.setFullName(binding.firstNameTxt.text.toString(), binding.lastNameTxt.text.toString())
        }

        vm.fullNameLive.observe(this) { fullName ->
            binding.fullName.text = fullName
        }

        setContentView(binding.root)
    }
}