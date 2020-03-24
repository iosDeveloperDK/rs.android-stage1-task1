package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = mutableListOf<Int>()
        for (i in sadArray) {
            happyArray.add(i)
        }

        var isHappy = false
        while (!isHappy) {
            if (happyArray.size < 3) {
                isHappy = true
                break
            }
            for (i in 1..happyArray.size-2) {
                val middle = happyArray.get(i)
                val min: Int = happyArray.get(i - 1)
                val max: Int = happyArray.get(i + 1)
                val sum = min + max
                val isBad = sum < middle
                println("$sum $middle $isBad $happyArray")

                if (isBad) {
                    happyArray.remove(middle)
                    isHappy = false
                    break
                } else {
                    isHappy = true
                }


            }
        }

        return happyArray.toIntArray()
    }
}
