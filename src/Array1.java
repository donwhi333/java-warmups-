




public class Array1 {


    /*
    java review
     */


    public static void main(String[] args) {


    }

    public int[] maxEnd3(int[] nums) {

        /*

        Given an array of ints length 3, figure
        out which is larger, the first or last
        element in the array, and set all the
        other elements to be that value. Return
        the changed array.

        maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]

         */


        int len = nums.length-1;
        int sm = nums[0], lg = nums[len];

        return nums[0] > nums[len] ? new int[] {sm,sm,sm} : new int[] {lg,lg,lg};

    }


}
