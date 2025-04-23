package org.github.murilo20h

import org.github.murilo20h.Custodia.Companion.removeZeroCustody
import org.github.murilo20h.Custodia.Companion.removeZeroCustody2

class Key (val chave : String)

data class Custodia (
    val id : Int,
    val nome : String,
    val totalQty : Long
) {
    companion object {
//        fun Map<Key, List<Custodia>>.removeZeroCustodyManual() : Map<Key, List<Custodia>> {
//            val map = this
//            for ((key, value) in map) {
//                for (custodia in value) {
//                    if (custodia.totalQty != 0L) {
////                        value.
//                    }
//                }
//            }
//        }

//        fun Map<Key, List<Custodia>>.removeZeroCustody() : Map<Key, List<Custodia>> {
//            return this.mapValues { it.value.filter { custodia -> custodia.totalQty != 0L } }
//        }

        fun Map<Key, List<Custodia>>.removeZeroCustody() =
            this.mapValues { it.value.filter { custodia -> custodia.totalQty != 0L } }

        fun Map<Key, List<Custodia>>.removeZeroCustody2() : Map<Key, List<Custodia>> {
            return this.mapValues { it.value.filter { custodia -> custodia.totalQty != 0L } }
                .filter { it.value.isNotEmpty() }
        }
    }
}



fun main() {
    var c1 = Custodia(1, "a", 0)
    var c2 = Custodia(2, "f", 0)
    var c3 = Custodia(3, "e", 1)
    var c4 = Custodia(4, "d", 1)
    var c5 = Custodia(5, "c", 1)
    var c6 = Custodia(6, "b", 0)

    var k1 = Key("a")
    var k2 = Key("b")
    var k3 = Key("c")

    var l1 = listOf(c1, c2)
    var l2 = listOf(c3, c4)
    var l3 = listOf(c5, c6)

    var m1 = mapOf(k1 to l1)
    var m2 = mapOf(k2 to l2)
    var m3 = mapOf(k3 to l3)

//    print("\n\n\n\n\n***************************   FINAL   ****************************")
//    print("========================\n")
//    print("Nenhuma: " + m1.removeZeroCustody())
//    print("\n========================\n")
//    print("Duas: " + m2.removeZeroCustody())
//    print("\n========================\n")
//    print("Uma: " + m3.removeZeroCustody())
//    print("\n========================")
//
//    print("\n\n\n\n\n***************************   FINAL VERSÃO 2   ****************************")
//    print("========================\n")
//    print("Nenhuma: " + m1.removeZeroCustody2())
//    print("\n========================\n")
//    print("Duas: " + m2.removeZeroCustody2())
//    print("\n========================\n")
//    print("Uma: " + m3.removeZeroCustody2())
//    print("\n========================")
}