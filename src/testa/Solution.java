//package testa;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Solution {
//
//    public int[] sortByBits(int[] arr) {
//        List<Integer> list = Arrays.asList(arr);
//        int[] primitive = arr.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += Integer.bitCount(arr[i]) * 10001;
//        }
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] % 10001;
//        }
//
//        return arr;
//    }
//
//}
