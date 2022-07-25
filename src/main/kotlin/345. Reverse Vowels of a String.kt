fun reverseVowels(s: String): String {
    val arrayOfStr = mutableListOf<Char>()
    val arrayOfPos = mutableListOf<Int>()

    for (i in s.indices) {
        when (s[i]) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                arrayOfStr.add(s[i])
                arrayOfPos.add(i)
            }
        }
    }

    var sb = StringBuilder(s)

    arrayOfPos.reverse()

    for (i in arrayOfStr.indices) {
        sb = sb.also { it[arrayOfPos[i]] = arrayOfStr[i] }
    }

    return sb.toString()
}
