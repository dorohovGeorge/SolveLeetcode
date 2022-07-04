import kotlin.math.abs

fun findClosestNumber(nums: IntArray): Int {
    var closest = nums[0]

    for (number in nums) {
        val distance = abs(closest) - abs(number)

        when {
            distance == 0 -> closest = maxOf(closest, number)
            distance > 0 -> closest = number
        }
    }

    return closest
}
