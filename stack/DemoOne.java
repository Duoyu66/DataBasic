package stack;

public class DemoOne {
    public static void main(String[] args) {

    }
}
class ArrayStack{
    private int maxSize;
    private int[]stack;
    private int top = -1;
    //构造器
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }
    //栈满
    public boolean isFull(){
        return top == maxSize-1;
    }
    //栈空
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int value){
        if (isFull()){
            System.out.println("栈满了");
            return;
        }
        top++;
        stack[top] = value;
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("栈空了");
           throw new RuntimeException("栈空，没有数据");
        }
         int value = stack[top];
        top--;
        return value;

    }
}
