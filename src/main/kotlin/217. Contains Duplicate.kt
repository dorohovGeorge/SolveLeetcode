fun containsDuplicate(nums: IntArray): Boolean {
    val set = hashSetOf<Int>()
    nums.forEach {
        if (!set.add(it)) {
            return true
        }
    }
    return false
}