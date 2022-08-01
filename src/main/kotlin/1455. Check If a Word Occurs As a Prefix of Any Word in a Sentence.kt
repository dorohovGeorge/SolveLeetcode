fun isPrefixOfWord(sentence: String, searchWord: String): Int {
    val array = sentence.split("\\s".toRegex()).toTypedArray()

    array.forEachIndexed { index, s ->
        if (s.startsWith(searchWord)) {
            return index + 1
        }
    }

    return -1
}
