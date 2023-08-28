package Test08;

import java.util.Stack;

public class Test28 {
    //翻转链表的思路  先把链表压入栈中，在出栈*****
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("jack");
        stack.add("baoer");
        stack.add("smith");
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
//    public static void reversePrint(HeroNode head){
//        if (head.next==null){return;}
//        Stack<HeroNode> stack = new Stack<HeroNode>();
//    }
//    public class HeroNode(){
//
//    }

//单链表的弊端
    /*
    *
    *
    *先找到双向链表的最后节点
    * temp.next=new HeroNode
    * new HeroNode.pre = temp
    * 修改的操作思路和原来的单项链表思路相同
    *
    * //删除
    *因为是双向链表，我们可以实现自我删除某个节点
    * 直接找到要删除的这个节点，比如temp
    * 让temp.pre.next = temp.next
    * temp.next.pre = temp.pre
    * 老李路。【；
    * */
}
