package com.example.jogoforca04kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvLayout: TextView
    private lateinit var tvDica: TextView
    private lateinit var banco: Banco
    private lateinit var jogo: JogoForca04

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.banco = Banco()
        this.jogo = JogoForca04(this.banco.palavra(),this.banco.dica())
        this.jogo.iniciar()

        this.tvLayout = findViewById(R.id.tvLayout)
        this.tvDica = findViewById(R.id.tvDica)

        this.tvLayout.text = this.jogo.getPalavra().toList().toString().replace("[","").replace("]","").replace(",", " ")
        this.tvDica.text= this.jogo.getDica()


    }
}