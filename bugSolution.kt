fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val removed = list.removeIf { it % 2 == 0 }
    println("Original list after removeIf: $list")
    println("Removed elements: $removed")

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val removed2 = list2.removeAll { it % 2 == 0 }
    println("Original list after removeAll: $list2")
    println("Removed elements: $removed2")

    // Handling the case when all elements are removed
    val list3 = mutableListOf(2, 4, 6)
    val removed3 = list3.removeIf { it % 2 == 0 }
    println("Original list after removeIf (all removed): $list3")
    println("Removed elements: $removed3")

    val list4 = mutableListOf(2, 4, 6)
    val removed4 = list4.removeAll { it % 2 == 0 }
    println("Original list after removeAll (all removed): $list4")
    println("Removed elements: $removed4")
}