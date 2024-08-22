package com.github.murilo20h.converters

object Conversor {

    fun converterParaDouble(numeroRecebido: String?): Double {
        if (numeroRecebido.isNullOrBlank()) return 0.0
        val numero = numeroRecebido.replace(",".toRegex(), ".")
        return if (ehNumero(numero)) numero.toDouble() else 0.0
    }

    fun ehNumero(numeroRecebido: String?): Boolean {
        if (numeroRecebido.isNullOrBlank()) return false
        val numero = numeroRecebido.replace(",".toRegex(), ".")
        return numero.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}