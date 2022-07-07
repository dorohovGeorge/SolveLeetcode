fun getLucky(s: String, k: Int): Int {
    var repeat = k
    val startPosOfLetter = 'a'.code - 1
    var answer = 0

    s.forEach { answer += convert(it.code - startPosOfLetter) }

    repeat--

    repeat((0 until repeat).count()) {
        answer = convert(answer)
    }

    return answer
}

fun convert(num: Int): Int {
    var output = 0
    var tmp = num
    val repeat = num.toString().length

    repeat((0..repeat).count()) {
        output += tmp % 10
        tmp /= 10
    }

    return output
}
