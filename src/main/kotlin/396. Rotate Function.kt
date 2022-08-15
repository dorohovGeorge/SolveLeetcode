fun maxRotateFunction(nums: IntArray): Int {
    // Idea: For every sum after rotation,
    // the new rotated sum is just the previous rotated sum - (n - 1) * [(lastNum in previous rotation) because it's being rotated from (n - 1) * num to 0 * num, so it's the same as minus]
    // and then add the sum of the rest of the nums, because every other num went from 1 * num to 2 * num and 2 * num to 3 * num and so on,
    // so it's like adding one of each of the rest of the num, which is just the sum of the rest of the num
    // We can write that as
    // f(n) = f(n - 1) - ((n - 1) * lastNum in previous rotation) + (sum of num - lastNum in previous rotation)
    val n = nums.size
    var sum = 0
    var fSum = 0

    for (i in 0 until n) {
        sum += nums[i]
        fSum += i * nums[i]
    }

    var result = fSum

    for (i in 0 until n) {
        // last index in the rotated array is n - 1 - i
        // (n - 1) * lastNum in previous rotation
        fSum -= (n - 1) * nums[n - 1 - i]
        // sum of num - lastNum in previous rotation
        fSum += sum - nums[n - 1 - i]
        result = maxOf(result, fSum)
    }

    return result
}
