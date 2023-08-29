package linkedlist;

public class demo01 {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if (head ==null){
            return false;
        }
        //定义快慢指针
        ListNode slow = head;
        ListNode fast = head;
        while (head!=null&&head.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){return true;}
        }
        return false;

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
        next = null;
    }
}
