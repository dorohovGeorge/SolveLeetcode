import kotlin.math.min

fun distributeCandies(candyType: IntArray): Int {
    val recommendationDoctor = candyType.size / 2
    val set = hashSetOf<Int>()

    candyType.forEach { set.add(it) }

    return min(recommendationDoctor, set.size);
}
