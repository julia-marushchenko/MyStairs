/**
 *  Task to find how many paths to get up on stairs. Allowed 1, 2, and 3 stairs at one step.
 */

package com.stairs;

/**
 *  Main class.
 */
public class Main {

    // JVM entry entry point.
    public static void main(String[] args) {

        //
        System.out.println(climbStairs(3)); // Output: 4
        System.out.println(climbStairs(6)); // Output: 24
        System.out.println(climbStairs(4)); // Output: 7
    }

    // Method to find total number of ways to get upstairs.
    public static int climbStairs(int n){

        // Basic situations.
        if(n == 1 || n == 2){
            return n;
        }

        if(n == 3){
            return 4;
        }

        // Counting steps.
        int steps1 = climbStairs(n - 1);
        int steps2  = climbStairs(n - 2);
        int steps3  = climbStairs(n - 3);

        // Return statement.
        return steps1 + steps2 + steps3;
    }
}