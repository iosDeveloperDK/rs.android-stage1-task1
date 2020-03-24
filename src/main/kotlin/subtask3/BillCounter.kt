package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        for ((index, value) in bill.withIndex()) {
            if (index != k) {
                sum += value
            }
        }


        if (sum/2 < b) {
            return (b - sum/2).toString()
        } else {
            return "Bon Appetit"
        }
    }
}
