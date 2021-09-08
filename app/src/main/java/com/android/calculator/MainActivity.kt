package com.android.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.calculator.databinding.ActivityMainBinding
import com.android.calculator.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        initListener()
    }

    private fun initListener() {
        viewModel.mainDataLiveData.observe(this, Observer {
            binding.total.text = it.finalNum
        })
    }

    fun onNumClick(view: View) {
        viewModel.onNumClick((view as Button).text.toString())
    }

    fun onCalculateClick(view: View) {
        viewModel.onCalculateClick((view as Button).text.toString())
    }

    fun onEqualClick(view: View) {
        viewModel.onEqualClick()
    }

    fun onPercentClick(view: View) {
        viewModel.onPercentClick()
    }

    fun onClean(view: View) {
        viewModel.onCleanClick()
    }

}