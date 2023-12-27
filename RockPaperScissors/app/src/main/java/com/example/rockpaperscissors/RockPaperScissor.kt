package com.example.rockpaperscissors

import android.media.MediaDrm.PlaybackComponent

fun main(){
    var coumputerChoice = ""
    var playerChoice = ""
    var user = 0
    while (user == 0) {
        println("Rock, Paper and Scissor? ENTER YOUR CHOICE")
        playerChoice = readln()

        if (playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissor") {

            val randomNumber = (1..3).random()

            when (randomNumber) {
                1 -> {
                    coumputerChoice = "Rock"
                }

                2 -> {
                    coumputerChoice = "Paper"
                }

                3 -> {
                    coumputerChoice = "Scissor"
                }
            }
            println(coumputerChoice)

            val winner = when {
                playerChoice == coumputerChoice -> "Tie"
                playerChoice == "Rock" && coumputerChoice == "Scissor" -> "You Won"
                playerChoice == "Paper" && coumputerChoice == "Rock" -> "You Won"
                playerChoice == "Scissor" && coumputerChoice == "Paper" -> "You Won"
                else -> "You Lost"
            }

            println(winner)
            if (winner == "You Won") {
                user = 1
            }
        }else{
            println("Please enter given keywords only")
        }
    }
}