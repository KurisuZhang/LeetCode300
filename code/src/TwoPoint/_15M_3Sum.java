package TwoPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _15M_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {

//        List<List<Integer>> list = new ArrayList<>();
//        HashSet<List<Integer>> hashSet = new HashSet<>();
//        Arrays.sort(nums);
//        for (int i :
//                nums) {
//            System.out.println(i+" ");
//        }
//
//        for (int point1 = 0;point1 < nums.length - 2; point1++) {
//
//            int point2 = point1+1;
//            int point3 = nums.length-1;
//
//            while (point2<point3){
//                int sum =nums[point1]+ nums[point2] + nums[point3];
//                if (sum < 0) {
//                    point2++;
//                } else if (sum > 0) {
//                    point3--;
//                } else {
//
//                    List<Integer> result=Arrays.asList(nums[point1], nums[point2], nums[point3]);
//                    if (!hashSet.contains(result)) {
//                        hashSet.add(result);
//                        list.add(result);
//                    }
//                    point2++;
//                    point3--;
//                }
//            }
//        }
//        return list;






        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i :
                nums) {
            System.out.println(i+" ");
        }

        for (int point1 = 0;point1 < nums.length - 2; point1++) {

            // 去重操作
            if (point1 > 0 && nums[point1] == nums[point1 - 1]) {
                continue;
            }

            int point2 = point1+1;
            int point3 = nums.length-1;

            while (point2<point3){
                int sum =nums[point1]+ nums[point2] + nums[point3];
                if (sum < 0) {
                    point2++;
                } else if (sum > 0) {
                    point3--;
                } else {

                    List<Integer> result=Arrays.asList(nums[point1], nums[point2], nums[point3]);
                    list.add(result);

                    // 去重操作
                    while (point2 < point3 && nums[point2] ==nums[point2 + 1]){
                        point2++;
                    }
                    while (point2 < point3 && nums[point3] ==nums[point3 - 1]){
                        point3--;
                    }

                    point2++;
                    point3--;

                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
