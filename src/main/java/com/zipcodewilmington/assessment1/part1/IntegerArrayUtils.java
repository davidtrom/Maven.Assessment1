package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum = 0;
        for (int i = 0; i <= intArray.length; i++)
        {
            sum += i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        Integer product = 1;
        for (int i = 0; i <= intArray.length-1; i++)
        {
            product = product * intArray[i];
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        //Integer sum = getSum(intArray);
        Double sum = 0D;
        for (int i = 0; i <= intArray.length; i++)
        {
            sum += i;
        }

        Double average = sum / intArray.length;
        return average;
    }

}
