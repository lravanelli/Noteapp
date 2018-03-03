package com.example.logonrm.noteapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override  fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.getItemId()) {
            R.id.mnSearch -> {

                return true
            }
            R.id.mnSave -> {
                  
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }


}
