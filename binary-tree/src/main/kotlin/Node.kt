package org.github.murilo20h

fun main() {
    createTree(arrayListOf(10, 14, 5, 3, 2, 19, 9, 6))
}

class Node(
    val value: Int
) {
    var right: Node? = null;
    var left: Node? = null;

    fun addNode(value: Int) {
        if (value > this.value) {
            if (right == null) {
                println("$value in right of the ${this.value}")
                right = Node(value)
            } else {
                right!!.addNode(value)
            }
        } else {
            if (left == null) {
                println("$value in left of the ${this.value}")
                left = Node(value)
            } else {
                left!!.addNode(value)
            }
        }
    }
}

fun createTree(values: ArrayList<Int>) {
    val node = Node(values.first())
    if (values.size <= 1) return
    values.removeFirst()
    values.forEach {
        node.addNode(it)
    }
}
