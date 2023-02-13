package com.sandul.view_binding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.sandul.view_binding.constants.Constants
import com.sandul.view_binding.databinding.ActivitySignUpInBinding

class SignInUpActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivitySignUpInBinding
    private var signState = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignUpInBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constants.SIGN_STATE)!!
        if (signState == Constants.SIGN_IN_STATE) {
            bindingClass.edName.visibility = View.GONE
            bindingClass.edMiddleName.visibility = View.GONE
            bindingClass.edLastname.visibility = View.GONE
            bindingClass.btnAvatar.visibility = View.INVISIBLE
        }
    }

    fun onClickDone(view: View) {
        if (signState == Constants.SIGN_UP_STATE) {
            val intent = Intent()
            intent.putExtra(Constants.LOGIN, bindingClass.edLogin.text.toString())
            intent.putExtra(Constants.PASSWORD, bindingClass.edPassword.text.toString())
            intent.putExtra(Constants.NAME, bindingClass.edName.text.toString())
            intent.putExtra(Constants.MIDDLENAME, bindingClass.edMiddleName.text.toString())
            intent.putExtra(Constants.LASTNAME, bindingClass.edLastname.text.toString())
            if (bindingClass.ivAvatar.isVisible) intent.putExtra(Constants.AVATAR_ID,
                R.drawable.serg)
            setResult(RESULT_OK, intent)
            finish()
        } else if(signState == Constants.SIGN_IN_STATE) {
            val intent = Intent()
            intent.putExtra(Constants.LOGIN, bindingClass.edLogin.text.toString())
            intent.putExtra(Constants.PASSWORD, bindingClass.edPassword.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    fun onClickAvatar(view: View) {
        bindingClass.ivAvatar.visibility = View.VISIBLE
        bindingClass.ivAvatar.setImageResource(R.drawable.serg)
    }
}