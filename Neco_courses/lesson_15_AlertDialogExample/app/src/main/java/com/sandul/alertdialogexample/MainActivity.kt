package com.sandul.alertdialogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        createSimpleDialog()
        createSimpleMultiChoiseDialog()
    }

    private fun createSimpleDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog")
        builder.setMessage("This is not my first Alert Dialog")
        builder.setNeutralButton("Info"){dialogInterface, i ->

        }
        builder.setNegativeButton("No"){dialog, i ->

        }
        builder.setPositiveButton("Yes"){dialog, i ->

        }
        builder.show()
    }

    private fun createSimpleMultiChoiseDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("What language do you want to learn?")
        builder.setMultiChoiceItems(R.array.multi_item, null){dialog, position, isSelected ->
            Log.d("MyLog", "My choise is: $position" + "/ Is: $isSelected")
        }
        builder.setNeutralButton("Info"){dialogInterface, i ->

        }
        builder.setNegativeButton("No"){dialog, i ->

        }
        builder.setPositiveButton("Yes"){dialog, i ->

        }
        builder.show()
    }
}