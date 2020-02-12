package com.example.adivinanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var contador: Int = 0
    var numAu: Int = 0
    var numAu2: Int = 100
    var num:Int = 0
    var num2:Int = 0
    var num3:Int = 100
    var num4: Int = 0
    var numUp: Int = 100
    var numDown: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val label: TextView = findViewById(R.id.etiqueta) as TextView
        val down:Button = findViewById(R.id.botonDown) as Button
        val up:Button = findViewById(R.id.botonUp) as Button
        val generate:Button = findViewById(R.id.botonGenerate) as Button
        val win:Button = findViewById(R.id.botonWin) as Button


        generate.setOnClickListener() {
            num  = Random.nextInt(0,100)
            label.setText(""+num+"")
            num4 = num
        }
        up.setOnClickListener(){
            contador += 1
                if(contador == 1){
                    numUp = Random.nextInt(num,100)
                    label.setText(""+numUp+"")
                    num2 = numUp
                    numAu=num4
            }
            else{

                numUp = Random.nextInt(num2,num3)
                label.setText(""+numUp+"")
                    num4 = num2
                    numAu=num2
                num2 = numUp
            }
        }
        down.setOnClickListener(){
            contador += 1
            if(contador == 1){
                numDown = Random.nextInt(0,num)
                label.setText(""+numDown+"")
                num2 = numDown
                num3=num4
            }
            else{
                numAu2 = num2
                numDown = Random.nextInt(numAu,num2)
                label.setText(""+numDown+"")
                num3 = num2
                num2 = numDown

            }
    }
        win.setOnClickListener(){
            label.setText("Ganaste")
        }
    }
}




