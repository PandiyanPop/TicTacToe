package com.dev.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dev.tictactoe.viewmodel.GameViewModel
import com.dev.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityGameBinding: ActivityMainBinding
    private val gameViewModel: GameViewModel by lazy { ViewModelProvider(this).get(GameViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityGameBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        gameViewModel.init("Player1", "Player2")
        activityGameBinding.gameViewModel = gameViewModel
    }
}
