package com.asleepyfish.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: asleepyfish
 * @Date: 2022-03-08 19:25
 * @Description: 删除有序数组中的重复项
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么nums的前 k 个元素应该保存最终结果。
 * 将最终结果插入nums 的前 k 个位置后返回 k 。
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 判题标准:
 * 系统会用下面的代码来测试你的题解:
 * int[] nums = [...]; // 输入数组
 * int[] expectedNums = [...]; // 长度正确的期望答案
 * int k = removeDuplicates(nums); // 调用
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * 如果所有断言都通过，那么您的题解将被 通过。
 * 示例 1：
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2,_]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 * 提示：
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums 已按 升序 排列
 */
public class No26 {
    /**
     * 每个数字和前一个数字比较，如果相等则继续，不相等插入到一个已经记录不同个数的位置上
     * 使用方法4，原地修改
     */
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(removeDuplicates4(nums));
    }

    public static int removeDuplicates(int[] nums) {
        return (int) Arrays.stream(nums).distinct().count();
    }

    public static int removeDuplicates2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }

    private static int removeDuplicates3(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        int ans = 0;
        res[0] = nums[0];
        for (int num : nums) {
            if (num != res[ans]) {
                res[++ans] = num;
            }
        }
        nums = res;
        return ans + 1;
    }

    private static int removeDuplicates4(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res++] = nums[i];
            }
        }
        return res;
    }

}
