package com.sandul.plantshandbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.GridLayoutAnimationController
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.GridLayoutManager
import com.sandul.plantshandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = PlantAdapter()
    private var editLauncher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        editLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if(it.resultCode == RESULT_OK){
                adapter.addPlant(it.data?.getSerializableExtra("plant") as Plant)
            }
        }
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
//                adapter.addPlant(Plant(R.drawable.plant1, "Cactus"))
//                adapter.addPlant(Plant(R.drawable.plant2, "Flower tree"))
//                adapter.addPlant(Plant(R.drawable.plant3, "Gras tree"))
//                adapter.addPlant(Plant(R.drawable.plant4, "Palm 1"))
//                adapter.addPlant(Plant(R.drawable.plant5, "Palm 2 pot"))

//                if (index > 4) index = 0
//                val plant = Plant(imageIdList[index], "Plant $index")
//                adapter.addPlant(plant)
//                index++

                editLauncher?.launch(Intent(this@MainActivity, EditActivity::class.java))
            }
        }
    }
}