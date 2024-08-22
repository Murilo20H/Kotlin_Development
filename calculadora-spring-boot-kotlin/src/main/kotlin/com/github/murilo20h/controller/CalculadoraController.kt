package com.github.murilo20h.controller

import com.github.murilo20h.converters.Conversor
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.math.pow

@RestController
class CalculadoraController {

    @RequestMapping(value = ["/soma/{n1}/{n2}"])
    fun somar(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return Conversor.converterParaDouble(n1) + Conversor.converterParaDouble(n2)
    }

    @RequestMapping("/subtracao/{n1}/{n2}")
    fun subtrair(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return Conversor.converterParaDouble(n1) - Conversor.converterParaDouble(n2)
    }

    @RequestMapping("/divisao/{n1}/{n2}")
    fun dividir(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return Conversor.converterParaDouble(n1) / Conversor.converterParaDouble(n2)
    }

    @RequestMapping("/multiplicacao/{n1}/{n2}")
    fun multiplicar(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return Conversor.converterParaDouble(n1) * Conversor.converterParaDouble(n2)
    }

    @RequestMapping("/media/{n1}/{n2}")
    fun media2Valores(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return (Conversor.converterParaDouble(n1) + Conversor.converterParaDouble(n2)) / 2;
    }

    @RequestMapping("/media/{n1}/{n2}/{n3}")
    fun media3Valores(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?,
                      @PathVariable(value="n3") n3: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2) || !Conversor.ehNumero(n3)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return (Conversor.converterParaDouble(n1) + Conversor.converterParaDouble(n2) +
                Conversor.converterParaDouble(n3)) / 3;
    }

    @RequestMapping("/media/{n1}/{n2}/{n3}/{n4}")
    fun media4Valores(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?,
                      @PathVariable(value="n3") n3: String?, @PathVariable(value="n4") n4: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2) || !Conversor.ehNumero(n3) ||
            !Conversor.ehNumero(n4)) throw UnsupportedOperationException("Por favor, digite somente números")
        return (Conversor.converterParaDouble(n1) + Conversor.converterParaDouble(n2) +
                Conversor.converterParaDouble(n3) + Conversor.converterParaDouble(n4)) / 4;
    }

    @RequestMapping("/raiz/{radicando}/{indice}")
    fun raiz(@PathVariable(value="radicando") radicando: String?, @PathVariable(value="indice") indice: String?): Double {
        if (!Conversor.ehNumero(radicando) || !Conversor.ehNumero(indice)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return Conversor.converterParaDouble(radicando).pow(1/Conversor.converterParaDouble(indice))
    }

    @RequestMapping("/potencia/{base}/{expoente}")
    fun potencia(@PathVariable(value="base") base: String?, @PathVariable(value="expoente") expoente: String?): Double {
        if (!Conversor.ehNumero(base) || !Conversor.ehNumero(expoente)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return Conversor.converterParaDouble(base).pow(Conversor.converterParaDouble(expoente))
    }

    @RequestMapping("/porcentagem/{n1}/{n2}")
    fun porcentagem(@PathVariable(value="n1") n1: String?, @PathVariable(value="n2") n2: String?): Double {
        if (!Conversor.ehNumero(n1) || !Conversor.ehNumero(n2)
            ) throw UnsupportedOperationException("Por favor, digite somente números")
        return Conversor.converterParaDouble(n1) * Conversor.converterParaDouble(n2) / 100
    }
}