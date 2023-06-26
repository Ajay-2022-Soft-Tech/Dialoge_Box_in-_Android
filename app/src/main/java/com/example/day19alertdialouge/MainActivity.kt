package com.example.day19alertdialouge

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.day19alertdialouge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
                            // class in kotlin // where to show alert
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to close the app?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i->

                // What action should be performed when yes is clicked
                finish() //for closing
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
//                do anything
            })

            builder1.show()

        }

        binding.btn2.setOnClickListener {

            val options = arrayOf("SCAM 1992","ALL OF US DEAD","MONEY HIEST")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is your Favourite WebSeries?")
            builder2.setSingleChoiceItems(options,0, DialogInterface.OnClickListener { dialog, which ->

                //what action should be performed when user clicked
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i->

                // What action should be performed when yes is clicked

            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
//                do anything
            })

            builder2.show()

        }

        binding.btn3.setOnClickListener {
            val options = arrayOf("SCAM 1992","ALL OF US DEAD","MONEY HIEST")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("What is your Favourite WebSeries?")

            builder3.setMultiChoiceItems(options,null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()

            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i->

                // What action should be performed when yes is clicked

            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
//                do anything
            })

        builder3.show()
        }

    }
}