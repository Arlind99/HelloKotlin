fun main() {
    var array = mutableListOf(3,2,5,9,1,4)
    bubbleSort(array)
}

fun bubbleSort(array:MutableList<Int>?){

    if (array == null){
        println("array is null")
        return
    }

    println("as it is given")
    for (item in array){
        println(item)
    }

    var num:Int
    var fullSize = array.size
    for (i in 0 until fullSize-1){
        if (i == fullSize-1){
            break
        }
        for (j in 0 until fullSize-i){
            if (j == fullSize-1){
                break
            }
            if (array[j] > array[j+1]){
                num = array[j+1]
                array[j+1] = array[j]
                array[j] = num
            }
        }
    }
    println("sorted")
    for (item in array){
        println(item)
    }
}