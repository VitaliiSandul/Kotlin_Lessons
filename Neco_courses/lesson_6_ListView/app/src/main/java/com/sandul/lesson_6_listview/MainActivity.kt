package com.sandul.lesson_6_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var listView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var NameList0 = listOf("Серега", "Степан", "Егор") //Ограниченное количество элементов 3шт
        var nameList = ArrayList<String>() //Можно добавлять сколько угодно элементов

        nameList.add("Серега")
        nameList.add("Леха")
        nameList.add("Степан")
        nameList.add("Егор")
        nameList.add("Денис")
        nameList.add("Света")

        nameList.get(1)  //достать элемент №2
        nameList.removeAt(5) // удалить элемент №6
        nameList.set(2, "Урюк") // заменить элемент №3 на новое значение

        listView = findViewById(R.id.listView)
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        listView?.adapter = adapter

        listView?.setOnItemClickListener{parent, view, position, id ->

            Toast.makeText(this, "Position: $position Name: ${nameList.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}