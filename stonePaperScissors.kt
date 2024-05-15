//loved the way kotlin assigns value

package com.example.kotlinbasics

fun main(){
    println("Enter your choice : ")
    val user = readln().toString()
    val randomNumber : Int = (1..3).random()
    val computer = when(randomNumber){
        1 -> {
            "Rock"
        }
        2 -> {
            "Paper"
        }
        else -> "Scissors"
    }
    println("Your choice is $user and computer choose $computer")
    val winner = when{
        user==computer -> "Tie"
        user=="Scissors" && computer=="Paper" || user=="Paper" && computer=="Rock" || user=="Rock" && computer=="Scissors" -> "user"
        else -> "computer"
    }
    println("The winner is $winner")
}