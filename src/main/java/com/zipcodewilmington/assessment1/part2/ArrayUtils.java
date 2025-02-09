package com.zipcodewilmington.assessment1.part2;


//import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter=0;

        for (int i= 0; i < objectArray.length; i++)
            if(objectArray[i].equals(objectToCount))
            {
                counter++;
            }
        return counter;
    }


    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

       //ArrayUtils.removeValue(objectArray, objectToRemove);
      //return objectArray;



        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < objectArray.length; i++ )
        {
            if(!objectArray[i].equals(objectToRemove))
            {
                list.add(objectArray[i]);
            }
        }

        Integer[] resultArray = new Integer[list.size()];
        list.toArray(resultArray);
        return resultArray;

}

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Integer, Integer> myMap = new HashMap<>();
        Integer counter=0;
        Integer placeHolder=0;
        Arrays.sort((objectArray));
        for (int i = 0; i < objectArray.length; i++)
        {
         if (objectArray[i]==objectArray[i+1])
         {
             counter++;
         }
        }
            return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Integer[] result = new Integer[objectArray.length + objectArrayToAdd.length];
        System.arraycopy(objectArray, 0, result, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, result, objectArray.length, objectArrayToAdd.length);

        return result;
    }
}
