package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var findStr = mutableMapOf<Int,String>()
        var findStrings = mutableListOf<String>()

        var str = inputString.toString()
        val brackets = arrayListOf<String>("[","]","<",">","(",")")
        for ((index, value) in  str.withIndex()) {
            if (brackets.contains(value.toString())) {
                findStr.set( index, value.toString())
            }
        }

        var finded = mutableListOf<Int>()
        var hasCopy = false
        loop@ for ((indexI, i) in findStr) {
            hasCopy = false
            for ((indexJ, j) in findStr) {

                if (indexI < indexJ) {
                    if (indexI != indexJ && i == j) {
                        hasCopy = true
                        continue
                    }
                    if (i == "<" && j == ">") {
                        if (hasCopy) {
                            hasCopy = false
                        } else {
                            finded.add(indexI)
                            findStrings.add(str.substring(indexI+1,indexJ))
                            continue@loop
                        }
                    } else if (i == "[" && j == "]") {
                        if (hasCopy) {
                            hasCopy = false
                        } else {
                            finded.add(indexI)
                            findStrings.add(str.substring(indexI+1,indexJ))
                            continue@loop
                        }
                    } else if (i == "(" && j == ")") {
                        if (hasCopy) {
                            hasCopy = false
                        } else {
                            finded.add(indexI)
                            findStrings.add(str.substring(indexI+1,indexJ))
                            continue@loop
                        }
                    }
                }

            }
        }


        return findStrings.toTypedArray()
    }

    fun indexes(input:String, char: String): Array<Int> {
        var findIndex = mutableListOf<Int>()
        var index: Int = input.indexOf(char)

        while (index >= 0) {
            findIndex.add(index)
            index = input.indexOf(char, index + 1)
        }
        println(findIndex)
        return findIndex.toTypedArray()
    }
}
