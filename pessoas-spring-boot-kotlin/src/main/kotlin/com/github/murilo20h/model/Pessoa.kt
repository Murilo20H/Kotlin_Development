package com.github.murilo20h.model

data class Pessoa (
    var id: Long = 0,
    var primeiroNome: String = "",
    var ultimoNome: String = "",
    var endereco: String = "",
    var genero: String = ""
)