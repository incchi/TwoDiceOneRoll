package com.example.twodiceoneroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val rollButton = findViewById<Button>(R.id.button)
        rollButton.setOnClickListener {
            //val toast = Toast.makeText(this,"clicked",Toast.LENGTH_SHORT)
            rollDiceOne()
            rollDiceTwo()

        }

    }

    private fun rollDiceTwo() {
        val diceRoll = Dice(6)
        val roll = diceRoll.roll2()
        val diceImage :ImageView = findViewById(R.id.imageView2)
        val drawableResult = when (roll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResult)
        diceImage.contentDescription = roll.toString()

    }

    private fun rollDiceOne() {
        val diceRoll = Dice(6)
        val roll = diceRoll.roll()
        val diceImage :ImageView = findViewById(R.id.imageView1)
        val drawableResult = when (roll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResult)
        diceImage.contentDescription = roll.toString()
    }
}


class Dice (private val numberSides :Int) {
    fun roll():Int {
        return (1..numberSides).random()
    }

    fun roll2():Int {
        return (1..numberSides).random()
    }
}