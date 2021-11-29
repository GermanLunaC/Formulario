package io.github.GermanLuna_Form

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Num1= findViewById<EditText>(R.id.num1)
        val Num2=findViewById<EditText>(R.id.num2)
        val button =
            findViewById<Button>(R.id.button)
        button.setOnClickListener { view ->
            val variable1 = Integer.parseInt(Num1.text.toString())
            val variable2 = Integer.parseInt(Num2.text.toString())
            val variable3= (variable1*variable2)

            Snackbar.make(
                view,
                "El resultado de la operación es:  $variable3.",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}