package com.sandul.drawerlayoutlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.sandul.drawerlayoutlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            navigationView.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.item_1 -> Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT).show()
                    R.id.item_2 -> Toast.makeText(this@MainActivity, "Item 2", Toast.LENGTH_SHORT).show()
                    R.id.item_3 -> Toast.makeText(this@MainActivity, "Item 3", Toast.LENGTH_SHORT).show()
                    R.id.item_4 -> Toast.makeText(this@MainActivity, "Item 4", Toast.LENGTH_SHORT).show()
                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }
            open.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}