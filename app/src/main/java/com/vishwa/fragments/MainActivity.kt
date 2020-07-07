package com.vishwa.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newdelhi=Newdelhi1()
        val paris=Paris()
        val tronoto=Tronoto()

        newDelhiButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flfragment,newdelhi)
                addToBackStack(null)
                commit()
            }
        }

        parisButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flfragment,paris)
                addToBackStack(null)
                commit()
            }
            torontoButton.setOnClickListener {
                supportFragmentManager.beginTransaction().apply{
                    replace(R.id.flfragment,tronoto)
                    addToBackStack(null)
                    commit()
                }
            }
        }
    }
}
