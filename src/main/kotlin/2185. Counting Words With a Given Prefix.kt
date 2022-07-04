fun prefixCount(words: Array<String>, pref: String): Int {
    var counter = 0
    words.forEach { it ->
        if (it.startsWith(pref)) {
            counter++
        }
    }
    return counter;
}
