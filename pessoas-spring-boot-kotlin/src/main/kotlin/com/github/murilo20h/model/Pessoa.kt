package com.github.murilo20h.model

import jakarta.persistence.*

@Entity
@Table(name = "pessoa")
data class Pessoa (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "primeiro_nome", nullable = false, length = 80)
    var primeiroNome: String = "",

    @Column(name = "ultimo_nome", nullable = false, length = 80)
    var ultimoNome: String = "",

    @Column(nullable = false, length = 120)
    var endereco: String = "",

    @Column(nullable = false, length = 9)
    var genero: String = ""
)