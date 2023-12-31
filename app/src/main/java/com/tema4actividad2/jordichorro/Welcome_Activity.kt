package com.tema4actividad2.jordichorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)

        // Obtiene el botón
        val btnEntrar = findViewById<Button>(R.id.btnEntrar)

        // Establece un listener para el botón
        btnEntrar.setOnClickListener {
            // Crea un Intent para abrir la actividad LoginActivity
            val intent = Intent(this, Login_Activity::class.java)
            // Inicia la actividad LoginActivity
            startActivity(intent)
        }
    }
}
