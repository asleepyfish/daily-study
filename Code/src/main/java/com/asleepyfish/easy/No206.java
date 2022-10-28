package com.asleepyfish.easy;

import com.asleepyfish.ListNode;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/28 13:41
 * @Description: 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class No206 {
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2));
        System.out.println(reverseList(listNode));
    }
}
