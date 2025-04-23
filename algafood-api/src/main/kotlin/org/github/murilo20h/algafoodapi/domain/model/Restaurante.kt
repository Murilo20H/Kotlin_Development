package org.github.murilo20h.algafoodapi.domain.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "restaurante")
data class Restaurante (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0,

    @Column
    private val nome: String = "",

    @Column(name = "taxa_frete")
    private val taxaFrete: BigDecimal = BigDecimal(0)
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Restaurante

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}