fun letterCombinations(digits: String): List<String> {
    if (digits.isEmpty()) return mutableListOf()

    val alphabet = mutableMapOf<String, List<String>>()
    alphabet["2"] = listOf("a", "b", "c")
    alphabet["3"] = listOf("d", "e", "f")
    alphabet["4"] = listOf("g", "h", "i")
    alphabet["5"] = listOf("j", "k", "l")
    alphabet["6"] = listOf("m", "n", "o")
    alphabet["7"] = listOf("p", "q", "r", "s")
    alphabet["8"] = listOf("t", "u", "v")
    alphabet["9"] = listOf("w", "x", "y", "z")

    if (digits.length == 1) return alphabet[digits]!!

    val combinations = mutableListOf<String>()

    if (digits.length == 2) {
        val digit1 = digits.substring(0, 1)
        val digit2 = digits.substring(1, 2)
        for (i in 0 until alphabet[digit1]!!.size) {
            for (j in 0 until alphabet[digit2]!!.size) {
                combinations.add(alphabet[digit1]!![i] + alphabet[digit2]!![j])
            }
        }
    }

    if (digits.length == 3) {
        val digit1 = digits.substring(0, 1)
        val digit2 = digits.substring(1, 2)
        val digit3 = digits.substring(2, 3)
        for (i in 0 until alphabet[digit1]!!.size) {
            for (j in 0 until alphabet[digit2]!!.size) {
                for (k in 0 until alphabet[digit3]!!.size) {
                    combinations.add(alphabet[digit1]!![i] + alphabet[digit2]!![j] + alphabet[digit3]!![k])
                }
            }
        }
    }

    if (digits.length == 4) {
        val digit1 = digits.substring(0, 1)
        val digit2 = digits.substring(1, 2)
        val digit3 = digits.substring(2, 3)
        val digit4 = digits.substring(3, 4)
        for (i in 0 until alphabet[digit1]!!.size) {
            for (j in 0 until alphabet[digit2]!!.size) {
                for (k in 0 until alphabet[digit3]!!.size) {
                    for (h in 0 until alphabet[digit4]!!.size) {
                        combinations.add(alphabet[digit1]!![i] + alphabet[digit2]!![j] + alphabet[digit3]!![k] + alphabet[digit4]!![h])
                    }
                }
            }
        }
    }

    return combinations
}
