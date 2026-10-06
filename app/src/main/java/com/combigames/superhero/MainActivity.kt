package com.combigames.superhero

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.combigames.superhero.feature.users.data.UserDataRepository
import com.combigames.superhero.feature.users.data.local.UserMemLocalDataSource
import com.combigames.superhero.feature.users.domain.GetUserUseCase
import com.combigames.superhero.feature.users.presentation.ListViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listViewModel =
            ListViewModel(GetUserUseCase(UserDataRepository(UserMemLocalDataSource())))
        Log.d(TAG, "onCreate: ${listViewModel.getUsers()}")

        val inputName = findViewById<TextView>(R.id.input_name)
        inputName.text = listViewModel.getUsers().first().name
    }

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }
}