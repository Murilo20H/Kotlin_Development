package org.github.murilo20h

class Produto (var nome:String, var preco:Double) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        } else if (other == null) {
            return false
        } else if (javaClass != other.javaClass) {
            return false
        }

        val obj = other as Produto
        if (nome != obj.nome) return false
        else if (preco != obj.preco) return false

        return true
    }

    override fun toString(): String {
        return "Produto é (nome=$nome, preço=$preco)"
    }
}

data class Produto2 (var nome:String, var preco:Double) {

}

fun main() {
    var iPhone = Produto("Iphone", 2000.0)
    var iPhone2 = Produto("Iphone", 2000.0)
    println(iPhone)
    println(iPhone2)
    println(iPhone == iPhone2)
    println(iPhone.equals(iPhone2))

//    Não consegue por não ser data class
//    val (nome, preco) = iPhone
//    println(nome)
//    println(preco)

    println("=============================")

    var iPhone3 = Produto2("Iphone", 2000.0)
    var iPhone4 = Produto2("Iphone", 2000.0)
    println(iPhone3)
    println(iPhone4)
    println(iPhone3 == iPhone4)
    println(iPhone3.equals(iPhone4))

    val (nome, preco) = iPhone3
    println(nome)
    println(preco)
}