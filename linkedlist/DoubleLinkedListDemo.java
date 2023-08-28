package linkedlist;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode head = new HeroNode(0,"","");
        System.out.println(        head.toString());
    }
}
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;
    public HeroNode pre;
    public HeroNode(int no,String name,String nickname){
        this.no=no;
        this.name=name;
        this.nickname=nickname;
    }

    @Override
    public String toString() {
        return "HeroNode [no"+no+",name"+name+",nickname"+nickname+"]";
    }
}
