fun main() {
    println(noVowels("God is Good, All the Time "))
}

fun noVowels(z: String): String {
    val re = StringBuilder()
    for (x in z) {
        if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u') {
            re.append(x)
        }
    }
    return re.toString()
}

