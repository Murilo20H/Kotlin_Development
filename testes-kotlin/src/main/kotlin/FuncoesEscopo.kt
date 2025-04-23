package org.github.murilo20h

data class Pessoa (var nome:String, var idade:Int = 0, var telefone:String = "") {
    fun setName(nome:String) {
        this.nome = nome
    }
    fun printInfo(caller : String) {
        println("Caller: $caller Nome: ${this.nome} Idade: ${this.idade}")
    }
}

fun main() {
    var numero : Int? = 10

    var y = numero?.let {
        var x = it * 2
        x
        ""
    }

    var a = numero.also {
        var x = 2*2
        ""

    }

    var b = Pessoa("Murilo").apply {
        idade = 10
        telefone = "11987654321"
    }

    var c = Pessoa("Murilo").run {
        idade = 18
        telefone = "123456"
        setName("Murilo")
        printInfo("Run")
    }

    println(b)

    var d = with(Pessoa("Jorge")) {
        idade = 40
        telefone = "7891011"
        setName("Fabio")
        printInfo("With")
    }
}
