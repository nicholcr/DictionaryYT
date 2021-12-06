package com.plcoding.dictionary

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val nums: IntArray = intArrayOf(2,7,11,15)
    val target: Int = 9

    @Test
    fun twoSum(): IntArray {
        var solution = intArrayOf(0,0)
        val index = 1

        for(num1 in nums.indices - 1){
            solution[0] = nums[num1]

            for(num2 in nums.indices - 1){
                solution[1] = nums[num2]

                if(num1 != num2){
                    if(solution[0] + solution[1] == target){
                        return solution
                    }
                }
            }
        }
        return solution
    }
}

