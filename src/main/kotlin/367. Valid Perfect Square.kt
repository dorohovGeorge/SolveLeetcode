fun isPerfectSquare(num: Int): Boolean {
    val numb = num.toLong()
    var l = 1L;
    var r = numb + 1L

    while (l < r) {
        val m = l + (r - l) / 2

        if (m * m >= numb)
            r = m
        else
            l = m + 1
    }

    return l * l == numb
}
