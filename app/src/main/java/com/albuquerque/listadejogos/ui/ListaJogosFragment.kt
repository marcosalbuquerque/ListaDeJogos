package com.albuquerque.listadejogos.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.albuquerque.listadejogos.R
import com.albuquerque.listadejogos.data.Jogo
import com.albuquerque.listadejogos.data.JogoEntity

class ListaJogosFragment : Fragment(R.layout.fragment_lista_jogos) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewJogos)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = JogoAdapter(listarJogos())
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
        private const val TAG = "ListaJogosLifecycle"
    }
}
