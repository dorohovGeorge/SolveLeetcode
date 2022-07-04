fun checkRecord(s: String): Boolean {
    var counterAbsent = 0
    var counterLate = 0

    s.forEach {
        when (it) {
            'A' -> {
                counterAbsent++
                counterLate = 0
            }
            'L' -> {
                counterLate++
                if (counterLate >= 3) return false
            }
            'P' -> counterLate = 0
        }
    }

    if (counterAbsent < 1) return false

    return true
}
