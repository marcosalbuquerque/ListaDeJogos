package com.albuquerque.listadejogos.data

data class Jogo(
    val id: Long,
    val nome: String,
    val genero: String,
    val plataforma: String,
    val concluido: Boolean
)
