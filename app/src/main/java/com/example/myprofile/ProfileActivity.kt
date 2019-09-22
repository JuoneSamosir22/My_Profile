package com.example.myprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.txt_alamat
import kotlinx.android.synthetic.main.activity_profile.txt_email
import kotlinx.android.synthetic.main.activity_profile.txt_gender
import kotlinx.android.synthetic.main.activity_profile.txt_nama
import kotlinx.android.synthetic.main.activity_profile.txt_telepon

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val intent = intent.extras
        val nama = intent?.getString("nama")
        val gender = intent?.getString("gender")
        val email = intent?.getString("email")
        val telepon = intent?.getString("telepon")
        val alamat = intent?.getString("alamat")
        // ambilData()
        txt_nama.text = nama
        txt_gender.text = gender
        txt_email.text = email
        txt_telepon.text = telepon
        txt_alamat.text = alamat
    }
    // private fun ambilData() {
    // val bundle = intent.extras

    //  val nama =  bundle?.getString("nama")
    //  val gender =  bundle?.getString("gender")
    //  val email =  bundle?.getString("email")
    // val telepon =  bundle?.getString("telepon")
    //  val alamat =  bundle?.getString("alamat")
    // txt_nama.text = nama
    // txt_gender.text = gender
    // txt_email.text = email
    //txt_telepon.text = telepon
    //txt_alamat.text = alamat

}

