package com.dev.tictactoe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
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
        gameViewModel.init(getString(R.string.player_one), getString(R.string.player_two))
        activityGameBinding.gameViewModel = gameViewModel
        invalidateGameBoard()
    }

    private fun invalidateGameBoard() {
        activityGameBinding.gameViewModel = gameViewModel
        setUpOnGameEndListener()
    }

    private fun setUpOnGameEndListener() {
        gameViewModel.getWinner().observe(this, Observer { playerName ->
            showGameResult("${getString(R.string.winner_is)} $playerName!")
        })
        gameViewModel.getNoWinner().observe(this, Observer{ message ->
            showGameResult(message)
        })
    }

    private fun resetGame() {
        Handler().postDelayed(Runnable {
            gameViewModel.resetGame()
            invalidateGameBoard() }, 500)
    }

    private fun showGameResult(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        resetGame()
    }
}