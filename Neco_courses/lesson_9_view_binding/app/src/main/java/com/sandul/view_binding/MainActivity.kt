package com.sandul.view_binding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.sandul.view_binding.constants.Constants
import com.sandul.view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var middleName: String = "empty"
    private var lastname: String = "empty"
    private var avatarImageId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constants.REQUEST_CODE_SIGN_IN) {
            val l = data?.getStringExtra(Constants.LOGIN)
            val p = data?.getStringExtra(Constants.PASSWORD)
            if (login == l && password == p) {
                binding.imAvatar.visibility = View.VISIBLE
                binding.imAvatar.setImageResource(avatarImageId)
                val textInfo = "$name $middleName $lastname"
                binding.tvInfo.text = textInfo
                binding.btnHide.visibility = View.GONE
                binding.btnExit.text = "Exit"
            } else {
                binding.imAvatar.visibility = View.VISIBLE
                binding.imAvatar.setImageResource(R.drawable.figsign)
                binding.tvInfo.text = getString(R.string.account_does_not_exists)
            }
        } else if (requestCode == Constants.REQUEST_CODE_SIGN_UP) {
            login = data?.getStringExtra(Constants.LOGIN)!!
            password = data?.getStringExtra(Constants.PASSWORD)!!
            name = data?.getStringExtra(Constants.NAME)!!
            middleName = data?.getStringExtra(Constants.MIDDLENAME)!!
            lastname = data?.getStringExtra(Constants.LASTNAME)!!
            avatarImageId = data?.getIntExtra(Constants.AVATAR_ID, 0)!!
            binding.imAvatar.visibility = View.VISIBLE
            binding.imAvatar.setImageResource(avatarImageId)
            val textInfo = "$name $middleName $lastname"
            binding.tvInfo.text = textInfo
            binding.btnHide.visibility = View.GONE
            binding.btnExit.text = "Exit"
        }
    }

    fun onClickSignIn(view: View) {
        if (binding.imAvatar.isVisible && binding.tvInfo.text.toString() != getString(R.string.account_does_not_exists)) {
            binding.imAvatar.visibility = View.INVISIBLE
            binding.btnExit.text = ""
            binding.btnHide.visibility = View.VISIBLE
            binding.btnExit.text = getString(R.string.sign_in)
        } else {
            val intent = Intent(this, SignInUpActivity::class.java)
            intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_IN_STATE)
            startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_IN)
        }

    }

    fun onClickSignUp(view: View) {
        val intent = Intent(this, SignInUpActivity::class.java)
        intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_UP_STATE)
        startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_UP)
    }
}