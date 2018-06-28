package nyh.study01

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    inner class SampleClass(){
        fun testFunc(){
            println("SampleClass 펑션!!")
        }

        fun callTestFunc(){
            //내부
            testFunc()
            //외부
            this@ExampleUnitTest.testFunc()
        }
    }
    fun testFunc(){
        println("ExampleUnitTest 펑션!!")
    }
    @Test
    fun addition_isCorrect() {




        println(31.max(20).toString())
        val a = 33
//
//        when (a) {
//            1,33 -> println("1 or 33")
//            33 -> println("33!!!!!")
//            in 1..10 -> println("1~10")
//            in 11..32 -> println("11~100")
//            !in 100..1000 -> println("zz?!")
//            else -> println("없떵")
//        }

        //forExample()

//        filterTest()

//        loopLabels()

    }

    fun loopLabels(){
        val list = mutableListOf(1,2,3,4,0,6,7,8,9)
        list.forEach ret@{
            if(it == 0) return@ret
            print(it)
        }//0을 제외하고 프린트!

        list.forEach{
            if(it == 0) return@forEach
            print(it)
        }//0을 제외하고 프린트!

    }
    fun isWhenUse(a : Any){
        when (a) {
            1,10 -> println("1 or 10")
            is String -> println(a)
        }
    }

    fun Int.max(x : Int) : Int = if (this>x) this else x


    fun forExample(){
        val list = mutableListOf(1,2,3,4,5,6,7,8,9,10)
        for((index, value) in list.withIndex()){
            println("[$index] = $value")
        }
        val map = mutableMapOf("key1" to "value1", "key2" to 2, 100 to "백!!!")
        for ((key, value) in map){
            println("key is $key, value is $value")
        }

        for (i in 0..9 step 3){
            println(i)
        }
    }

    fun filterTest(){
        val list = mutableListOf(1,2,3,4,5,6)
        list.filter { it > 3 }.forEach {
            println(it)
        }
        val map = list.filter { it > 4 }.map { println("index $it") }

        val array = arrayOf(1,2,3,4,5,6,7,8,9,10)

        val tempList = array.toList()
        println(tempList)

        val mapSecond = mutableMapOf("key1" to "value1", "key2" to 2, 100 to "백!!!")
        println(mapSecond["key2"])
    }
}
