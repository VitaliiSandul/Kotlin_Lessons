package com.sandul.fragmentlesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.sandul.fragmentlesson.databinding.Fragment2Binding

class BlankFragment2 : Fragment() {

    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = Fragment2Binding.inflate(inflater)
        return binding.root
//        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messageForFrag2.observe(activity as LifecycleOwner, {
            binding.tvMessage.text = it
        })

        binding.btnSendToFrag1.setOnClickListener {
            dataModel.messageForFrag1.value = "Hello from Fragment 2"
        }
        binding.btnSendToActivity.setOnClickListener {
            dataModel.messageForActivity.value = "Hello from Fragment 2 to Activity"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment2()
    }
}