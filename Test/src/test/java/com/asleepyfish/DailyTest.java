package com.asleepyfish;

import org.junit.jupiter.api.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;
import java.util.Optional;

/**
 * @Author: com.asleepyfish
 * @Date: 2022/10/25 16:44
 * @Description: 日常测试
 */
public class DailyTest {
    @Test
    public void mainTest() {
        int[] arr = {2, 3, 1, 5, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    private boolean calculate(String expression, String operator, String target) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Object eval = engine.eval(expression + operator + target);
        return (boolean) eval;
    }

    private boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        return s.charAt(left) == s.charAt(right) && isPalindrome(s, left + 1, right - 1);
    }

    @Test
    public void binarySearch() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr, 5));
    }

    private int binarySearch(int[] arr, int tar) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] < tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    @Test
    public void quickSort() {
        int[] arr = {2, 3, 1, 5, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int partition = partition(arr, left, right);
        quickSort(arr, left, partition - 1);
        quickSort(arr, partition + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    @Test
    public void splitTwoParts() {
        int[] arr = {-9, -1, -2, 2, -3, 9, -8, -1, 2};
        splitTwoParts(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void splitTwoParts(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            while (arr[low] < 0) {
                low++;
            }
            while (arr[high] >= 0) {
                high--;
            }
            if (low < high) {
                arr[low] = arr[high] - arr[low];
                arr[high] = arr[high] - arr[low];
                arr[low] = arr[high] + arr[low];
            }
        }
    }

    @Test
    public void average() {
        ListNode root = new ListNode(2, new ListNode(3, new ListNode(4, null)));
        System.out.println(average(root, countListSize(root)));
    }

    private int countListSize(ListNode root) {
        int size = 0;
        while (root != null) {
            size++;
            root = root.next;
        }
        return size;
    }

    private double average(ListNode root, int n) {
        if (root.next == null) {
            return root.val;
        }
        return (average(root.next, n - 1) * (n - 1) + root.val) / n;
    }

    @Test
    public void nullString() {
        Integer i = null;
        System.out.println(Optional.ofNullable(i).orElse(null));
    }

}
