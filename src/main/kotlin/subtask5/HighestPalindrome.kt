package subtask5

import kotlin.math.max

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val palin: CharArray = digitString.toCharArray()
        var ans = ""
        var maxChar = '0'

        for (char in palin) {
            if (maxChar.toInt() < char.toInt()) {
                maxChar = char
            }
        }

        var l = 0
        var r: Int = digitString.length - 1
        var k = k

        while (l < r) {
            if (digitString[l] !== digitString[r]) {
                palin[r] = max(digitString[l].toInt(), digitString[r].toInt()).toChar()
                palin[l] = palin[r]
                k--
            }
            l++
            r--
        }

        if (k < 0) {
            return "-1"
        }

        l = 0
        r = digitString.length - 1

        while (l <= r) {
            if (l == r) {
                if (k > 0) {
                    palin[l] = maxChar
                }
            }

            if (palin[l] < maxChar) {
                if (k >= 2 && palin[l] == digitString[l] && palin[r] == digitString[r]
                ) {
                    k -= 2
                    palin[r] = maxChar
                    palin[l] = palin[r]
                } else if (k >= 1 && (palin[l] != digitString[l])
                    || palin[r] != digitString[r])
                {
                    k--
                    palin[r] = maxChar
                    palin[l] = palin[r]
                }
            }
            l++
            r--
        }
        for (i in palin.indices) ans += palin[i]
        return ans
    }
}
