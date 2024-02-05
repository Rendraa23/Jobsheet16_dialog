package com.example.jobsheet16

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol = findViewById<Button>(R.id.tomboldialog)
        val nama = findViewById<Button>(R.id.tomboldialog1)

        tombol.setOnClickListener{
            AlertDialog.Builder(this)
                .setTitle("Biodata Saya")
                .setMessage("Nama : Daffa' Raihan Nabawi ,  " +
                        ",Kelas : XI PPLG 1   " +
                        ",Nis : 2233248")
                .setPositiveButton("Back",DialogInterface.OnClickListener{
                    dialogInterface, i ->
                    Toast.makeText(this, "Nama Telah Di Tampilkan", Toast.LENGTH_LONG)
                        .show()
                })
                .setNegativeButton("Oke",DialogInterface.OnClickListener{
                        dialogInterface, i ->
                    Toast.makeText(this, "Nama Telah Tertampil", Toast.LENGTH_LONG)
                        .show()
                })
                .show()
        }

        nama.setOnClickListener {
            val inflater = layoutInflater
            val dialoglayout = inflater.inflate(R.layout.activity_dialog, null)
            val editText = dialoglayout.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Lengkap")
                .setView(dialoglayout)
                // Add action buttons
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this,"Nama kamu adalah " + editText.getText().toString(), Toast.LENGTH_SHORT)
                            .show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    }) .show()
        }

        }
}