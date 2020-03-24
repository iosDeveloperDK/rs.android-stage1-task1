package subtask2

class MiniMaxSum {

    //    val input = intArrayOf(1, 2, 3, 4, 5)
//    val result = intArrayOf(10, 14)
    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var min = 0
        var max = 0

        for (i in 0..input.size-1) {
            var sum = 0
            for (j in input) {
                if (input[i] != j) {
                    sum += j
                }
            }
            if (sum > max) {
                max = sum
            } else if (sum < min || min == 0) {
                min = sum
            }
        }

        return arrayListOf<Int>(min,max).toIntArray()
    }
}
