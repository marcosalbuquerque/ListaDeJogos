package com.albuquerque.listadejogos.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.albuquerque.listadejogos.R
import com.albuquerque.listadejogos.data.Jogo
import com.albuquerque.listadejogos.data.JogoEntity

class SobreFragment : Fragment(R.layout.fragment_sobre) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jogos = listarJogos()
        val totalJogos = jogos.size
        val totalConcluidos = jogos.count { it.concluido }
        val totalEmAndamento = totalJogos - totalConcluidos

        val tvResumo = view.findViewById<TextView>(R.id.tvResumoJogos)
        tvResumo.text = getString(
            R.string.sobre_resumo_jogos,
            totalJogos,
            totalConcluidos,
            totalEmAndamento
        )
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    private fun listarJogos(): List<Jogo> {
        val entidades = listOf(
            JogoEntity(1, "The Legend of Zelda: Breath of the Wild", "Aventura", "Nintendo Switch", 100),
            JogoEntity(2, "God of War Ragnarok", "Ação", "PlayStation 5", 70),
            JogoEntity(3, "Hades", "Roguelike", "PC", 100),
            JogoEntity(4, "EA Sports FC 26", "Esporte", "PlayStation 5", 35),
            JogoEntity(5, "Minecraft", "Sandbox", "PC", 60),
            JogoEntity(6, "Hollow Knight", "Metroidvania", "PC", 80)
        )

        return entidades.map { entidade ->
            Jogo(
                id = entidade.id,
                nome = entidade.nome,
                genero = entidade.genero,
                plataforma = entidade.plataforma,
                concluido = entidade.progresso >= 100
            )
        }
    }

    companion object {
        private const val TAG = "SobreFragmentLifecycle"
    }
}
