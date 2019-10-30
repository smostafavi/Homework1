
package com.company;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6};  // declare array
        int[] numbers2 = {7, 8, 9, 10, 11, 12};  //declare the second array

        //Get Random index
        Random r = new Random();
        // Create random index

        int x1 = r.nextInt(numbers1.length);
        int x3 = r.nextInt(numbers1.length);
        int x2 = r.nextInt(numbers2.length);
        int x4 = r.nextInt(numbers2.length);

        //store it in a  third array
        int[] number3 = {numbers1[x1], numbers1[x3], numbers2[x2], numbers2[x4]};

        //print array
        // for (int i =0; i<number3.length;i++)};
//        System.out.println(number3[i]);

        for (int x: number3) {
            System.out.println(x);
        }
    }


}
