package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class PracticalTest01Var06MainActivity : AppCompatActivity() {

    private lateinit var number1: EditText
    private lateinit var number2: EditText
    private lateinit var number3: EditText
    private lateinit var checkbox1: CheckBox
    private lateinit var checkbox2: CheckBox
    private lateinit var checkbox3: CheckBox
    private lateinit var playButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var06_main)

        // Initialize UI components
        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        number3 = findViewById(R.id.number3)
        checkbox1 = findViewById(R.id.checkbox1)
        checkbox2 = findViewById(R.id.checkbox2)
        checkbox3 = findViewById(R.id.checkbox3)
        playButton = findViewById(R.id.play_button)

        // Set onClickListener for the Play button
        playButton.setOnClickListener {
            // Generate a new random number between 1 and 3 if the checkbox is NOT checked (Hold is unchecked)
            if (!checkbox1.isChecked) {
                number1.setText((Random.nextInt(3) + 1).toString())
            }

            if (!checkbox2.isChecked) {
                number2.setText((Random.nextInt(3) + 1).toString())
            }

            if (!checkbox3.isChecked) {
                number3.setText((Random.nextInt(3) + 1).toString())
            }

            // Show a Toast message confirming the action
            Toast.makeText(this, "Numbers updated where Hold is not selected!", Toast.LENGTH_SHORT).show()
        }
    }
}
