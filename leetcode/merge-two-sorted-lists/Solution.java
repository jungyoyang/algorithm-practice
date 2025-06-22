/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 더미 노드를 하나 만들고, 그걸 기준으로 새로운 리스트를 만들어감
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // 두 리스트가 모두 끝날 때까지 반복
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // 남은 노드를 붙여줌 (한 쪽은 이미 끝났을 테니까)
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // 첫 번째 실제 노드 반환
    }
}
