package com.example.game

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.timer
import kotlin.reflect.typeOf


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("MyLogMainAct", "onCreate" )
    }




    override fun onStart() {
        super.onStart()

        Log.d("MyLogMainAct", "onStart" )
    }

    override fun onResume() {
        super.onResume()

        fun main(){
            var btnStart = findViewById<Button>(R.id.button)
            btnStart.setOnClickListener {
                fun main1(){
                    val buttons = arrayOf(
                        findViewById(R.id.btn1), findViewById(R.id.btn2), findViewById(R.id.btn3), findViewById(R.id.btn4),
                        findViewById(R.id.btn5), findViewById(R.id.btn6), findViewById(R.id.btn7), findViewById(R.id.btn8),
                        findViewById(R.id.btn9), findViewById(R.id.btn10), findViewById(R.id.btn11), findViewById(R.id.btn12),
                        findViewById(R.id.btn13), findViewById(R.id.btn14), findViewById(R.id.btn15),findViewById<Button>(R.id.btn16))
                    var count = 0
                    var score = findViewById<TextView>(R.id.textView18)


                    var button = buttons.random()
                    button.setBackgroundColor(Color.BLACK)

                    button.setOnClickListener {
                        button.setBackgroundColor(Color.WHITE)
                        count++
                        score.text = count.toString()
                        button = buttons.random()
                        button.setBackgroundColor(Color.BLACK)
                        button.setOnClickListener {
                            button.setBackgroundColor(Color.WHITE)
                            count++
                            score.text = count.toString()
                            button = buttons.random()
                            button.setBackgroundColor(Color.BLACK)
                            button.setOnClickListener {
                                button.setBackgroundColor(Color.WHITE)
                                count++
                                score.text = count.toString()
                                button = buttons.random()
                                button.setBackgroundColor(Color.BLACK)
                                button.setOnClickListener {
                                    button.setBackgroundColor(Color.WHITE)
                                    count++
                                    score.text = count.toString()
                                    button = buttons.random()
                                    button.setBackgroundColor(Color.BLACK)
                                    button.setOnClickListener {
                                        button.setBackgroundColor(Color.WHITE)
                                        count++
                                        score.text = count.toString()
                                        button = buttons.random()
                                        button.setBackgroundColor(Color.BLACK)
                                        button.setOnClickListener {
                                            button.setBackgroundColor(Color.WHITE)
                                            count++
                                            score.text = count.toString()
                                            button = buttons.random()
                                            button.setBackgroundColor(Color.BLACK)
                                            button.setOnClickListener {
                                                button.setBackgroundColor(Color.WHITE)
                                                count++
                                                score.text = count.toString()
                                                button = buttons.random()
                                                button.setBackgroundColor(Color.BLACK)
                                                button.setOnClickListener {
                                                    button.setBackgroundColor(Color.WHITE)
                                                    count++
                                                    score.text = count.toString()
                                                    button = buttons.random()
                                                    button.setBackgroundColor(Color.BLACK)
                                                    button.setOnClickListener {
                                                        button.setBackgroundColor(Color.WHITE)
                                                        count++
                                                        score.text = count.toString()
                                                        button = buttons.random()
                                                        button.setBackgroundColor(Color.BLACK)
                                                        button.setOnClickListener {
                                                            button.setBackgroundColor(Color.WHITE)
                                                            count++
                                                            score.text = count.toString()
                                                            button = buttons.random()
                                                            button.setBackgroundColor(Color.BLACK)
                                                            button.setOnClickListener {
                                                                button.setBackgroundColor(Color.WHITE)
                                                                count++
                                                                score.text = count.toString()
                                                                button = buttons.random()
                                                                button.setBackgroundColor(Color.BLACK)
                                                                button.setOnClickListener {
                                                                    button.setBackgroundColor(Color.WHITE)
                                                                    count++
                                                                    score.text = count.toString()
                                                                    button = buttons.random()
                                                                    button.setBackgroundColor(Color.BLACK)
                                                                    button.setOnClickListener {
                                                                        button.setBackgroundColor(Color.WHITE)
                                                                        count++
                                                                        score.text = count.toString()
                                                                        button = buttons.random()
                                                                        button.setBackgroundColor(Color.BLACK)
                                                                        button.setOnClickListener {
                                                                            button.setBackgroundColor(Color.WHITE)
                                                                            count++
                                                                            score.text = count.toString()
                                                                            button = buttons.random()
                                                                            button.setBackgroundColor(Color.BLACK)
                                                                            button.setOnClickListener {
                                                                                button.setBackgroundColor(
                                                                                    Color.WHITE)
                                                                                count++
                                                                                score.text = count.toString()
                                                                                button = buttons.random()
                                                                                button.setBackgroundColor(
                                                                                    Color.BLACK)
                                                                                button.setOnClickListener {
                                                                                    button.setBackgroundColor(
                                                                                        Color.WHITE)
                                                                                    count++
                                                                                    score.text = count.toString()
                                                                                    button = buttons.random()
                                                                                    button.setBackgroundColor(
                                                                                        Color.BLACK)
                                                                                    button.setOnClickListener {
                                                                                        button.setBackgroundColor(
                                                                                            Color.WHITE)
                                                                                        count++
                                                                                        score.text = count.toString()
                                                                                        button = buttons.random()
                                                                                        button.setBackgroundColor(
                                                                                            Color.BLACK)

                                                                                    }

                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }
                    }

                }
                main1()

                fun main2(){
                    var timer = findViewById<TextView>(R.id.textView20)
                    object : CountDownTimer(5000, 1000) {
                        override fun onFinish() {
                            timer.text = "Time ended"

                        }
                        @SuppressLint("SetTextI18n")
                        override fun onTick(millisUntilFinished: Long) {
                            timer.text = "Time: " + millisUntilFinished / 1000

                        }
                    }.start()
                }
                main2()
            }



        }
        main()


    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMainAct", "onPause" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMainAct", "onDestroy" )
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMainAct", "onStop" )
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("MyLogMainAct", "onRestart" )
    }
}