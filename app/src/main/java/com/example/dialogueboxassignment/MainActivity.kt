package com.example.dialogueboxassignment

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dialogueboxassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tv1.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Which of the following is used to terminate a loop in C?")
            val choices = arrayOf("A.) break","B.) continue","C.) goto","D.) exit")
            var selectedOptionIndex = 0
            val correctAnswerIndex = 0
            builder1.setSingleChoiceItems(choices,0,DialogInterface.OnClickListener{dialog, which ->
                selectedOptionIndex = which
                Toast.makeText(this, "You have chosen option - ${choices[which]}  ", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",DialogInterface.OnClickListener{dialogInterface, i ->
               if(selectedOptionIndex == correctAnswerIndex){
                   Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
               }
                else{
                   Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show()
               }
            })
            builder1.setNegativeButton("Cancel",DialogInterface.OnClickListener{dialogInterface, i ->
                //
            })
            builder1.show()
        }
        binding.tv2.setOnClickListener{
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which of the following is a valid variable name in C Programming?")
            val choices = arrayOf("A.) 2ndValue","B.) _   a  thmvalue","C.) .class","D.) &myVar")
            var selectedOptionIndex = 0
            val correctAnswerIndex = 1
            builder2.setSingleChoiceItems(choices,0,DialogInterface.OnClickListener{dialog, which ->
                selectedOptionIndex = which
                Toast.makeText(this, "You have chosen option - ${choices[which]}  ", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener{dialogInterface, i ->
                if(selectedOptionIndex == correctAnswerIndex){
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show()
                }
            })
            builder2.setNegativeButton("Cancel",DialogInterface.OnClickListener{dialogInterface, i ->
                //
            })
            builder2.show()
        }
        binding.tv3.setOnClickListener{
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which of the following are valid data types in C?")
            val choices = arrayOf("A.) int ","B.) float ","C.) bool ","D.) double")
            val selectedAnswers = booleanArrayOf(false,false,false,false)
            val correctAnswers = booleanArrayOf(true,true,false,true)
            builder3.setMultiChoiceItems(choices,selectedAnswers,DialogInterface.OnMultiChoiceClickListener{dialog, which, isChecked ->

            })
            builder3.setPositiveButton("Accept",DialogInterface.OnClickListener{dialog, which ->
                if(correctAnswers.contentEquals(selectedAnswers)){
                    Toast.makeText(this, "Correct! Well done", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Incorrect answer! Please try again.", Toast.LENGTH_SHORT).show()
                }
            })
            builder3.setNegativeButton("Cancel",DialogInterface.OnClickListener{dialogInterface, i ->
                //
            })
            builder3.show()
        }

        binding.tv4.setOnClickListener{
            val builder4 = AlertDialog.Builder(this)
            builder4.setTitle("Which of the following are valid preprocessor directives in C?")
            val choices = arrayOf("A.) #include ","B.) #define ","C.) #import ","D.) #ifdef")
            val selectedAnswers = booleanArrayOf(false,false,false,false)
            val correctAnswers = booleanArrayOf(true,true,false,true)
            builder4.setMultiChoiceItems(choices,selectedAnswers,DialogInterface.OnMultiChoiceClickListener{dialog, which, isChecked ->

            })
            builder4.setPositiveButton("Accept",DialogInterface.OnClickListener{dialog, which ->
                if(correctAnswers.contentEquals(selectedAnswers)){
                    Toast.makeText(this, "Correct! Well done", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Incorrect answer! Please try again.", Toast.LENGTH_SHORT).show()
                }
            })
            builder4.setNegativeButton("Cancel",DialogInterface.OnClickListener{dialogInterface, i ->
                //
            })
            builder4.show()
        }
        binding.btn.setOnClickListener{
            val builder5 = AlertDialog.Builder(this)
            builder5.setTitle("Are you sure you want to exit?")
            builder5.setIcon(R.drawable.baseline_exit_to_app_24)
            builder5.setPositiveButton("Yes",DialogInterface.OnClickListener{dialog, which ->
                finish()
            })
            builder5.setNegativeButton("No",DialogInterface.OnClickListener{dialog, which ->
                //
            })
            builder5.show()

        }


    }
    }




