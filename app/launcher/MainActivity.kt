package com.newcity.launcher

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Aqui nós conectaremos o design (HTML/XML) com o código Kotlin
        setContentView(R.layout.activity_main)

        // Buscando o botão de "Jogar" na tela
        val btnJogar = findViewById<Button>(R.id.btnJogar)

        // O que acontece quando o jogador aperta o botão
        btnJogar.setOnClickListener {
            if (verificarInternet()) {
                iniciarDownloadDoCache()
            } else {
                Toast.makeText(this, "Sem conexão com a internet!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun verificarInternet(): Boolean {
        // Lógica futura para checar o Wi-Fi ou 4G do jogador
        return true 
    }

    private fun iniciarDownloadDoCache() {
        Toast.makeText(this, "Iniciando download dos arquivos do Newcity...", Toast.LENGTH_SHORT).show()
        // Aqui entrará a lógica para baixar o .zip do seu servidor S3
    }
}