package com.albuquerque.listadejogos.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.albuquerque.listadejogos.R
import com.albuquerque.listadejogos.data.Jogo

class JogoAdapter(private val jogos: List<Jogo>) :
    RecyclerView.Adapter<JogoAdapter.JogoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_jogo, parent, false)
        return JogoViewHolder(view)
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        holder.bind(jogos[position])
    }

    override fun getItemCount(): Int = jogos.size

    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvNome: TextView = itemView.findViewById(R.id.tvNomeJogo)
        private val tvGenero: TextView = itemView.findViewById(R.id.tvGeneroJogo)
        private val tvPlataforma: TextView = itemView.findViewById(R.id.tvPlataformaJogo)
        private val tvStatus: TextView = itemView.findViewById(R.id.tvStatusJogo)

        fun bind(jogo: Jogo) {
            tvNome.text = jogo.nome
            tvGenero.text = itemView.context.getString(R.string.item_genero, jogo.genero)
            tvPlataforma.text = itemView.context.getString(R.string.item_plataforma, jogo.plataforma)
            val statusTexto = if (jogo.concluido) {
                itemView.context.getString(R.string.status_concluido)
            } else {
                itemView.context.getString(R.string.status_em_andamento)
            }
            tvStatus.text = itemView.context.getString(R.string.item_status, statusTexto)
        }
    }
}
