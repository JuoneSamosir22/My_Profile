package com.example.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_simpan
import kotlinx.android.synthetic.main.activity_main.edit_email
import kotlinx.android.synthetic.main.activity_main.edit_nama
import kotlinx.android.synthetic.main.activity_main.edit_nomor
import kotlinx.android.synthetic.main.activity_main.edit_spiner
import kotlinx.android.synthetic.main.activity_main.multi_alamat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_simpan.setOnClickListener {
            val nama=edit_nama.text.toString()
            val gender=edit_spiner.selectedItem.toString()
            val email=edit_email.text.toString()
            val telepon=edit_nomor.text.toString()
            val alamat=multi_alamat.text.toString()

            val intent=Intent( this
                ,ProfileActivity::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("gender",gender)
            intent.putExtra("email",email)
            intent.putExtra("telepon",telepon)
            intent.putExtra("alamat",alamat)

            startActivity(intent)
        }
    }
}
