package org.github.murilo20h.algafoodapi.jpa

import org.github.murilo20h.algafoodapi.AlgafoodApiApplication
import org.github.murilo20h.algafoodapi.domain.model.Cozinha
import org.springframework.boot.WebApplicationType
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ApplicationContext

fun main(args: Array<String>) {
    val applicationContext : ApplicationContext =
        SpringApplicationBuilder(AlgafoodApiApplication::class.java).web(WebApplicationType.NONE).run(*args)

    val cadastroCozinha: CadastroCozinha = applicationContext.getBean(CadastroCozinha::class.java)

    val cozinha = Cozinha()
    cozinha.setId(1L)
    cozinha.setNome("Brasileira")

    cadastroCozinha.salvar(cozinha)
}