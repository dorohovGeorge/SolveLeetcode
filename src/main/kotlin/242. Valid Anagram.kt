fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val charArr = IntArray(26) { it * 0 }
    for (i in s.indices) {
        charArr[s[i] - 'a']++
        charArr[t[i] - 'a']--
    }

    charArr.forEach {
        if (it != 0) {
            return false
        }
    }
    return true
}

//fun isAnagram(s: String, t: String): Boolean {
//    if (s.length != t.length) {
//        return false
//    }
//
//    val set = hashSetOf<Char>()
//    s.forEach {
//        set.add(it)
//    }
//    t.forEach {
//        if (set.add(it)) {
//            return false
//        }
//    }
//    
//    val map = hashMapOf<Char, Int>()
//    s.forEach {
//        if(map.containsKey(it)) {
//            map[it] = map[it]!! + 1
//        } else {
//            map[it] = 1
//        }
//    }
//    val tMap = hashMapOf<Char, Int>()
//    t.forEach {
//        if(tMap.containsKey(it)) {
//            tMap[it] = tMap[it]!! + 1
//        } else {
//            tMap[it] = 1
//        }
//    }
//    
//    map.forEach {
//        if (it.value != tMap[it.key]) {
//            return false
//        }
//    }
//    return true
//}