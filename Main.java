import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        System.out.println("HEllo woeld");
        Main main = new Main();
        System.out.println(main.isValid("()[]{}"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char []ch = s.toCharArray();
        int recerseCount = -1;
//        System.out.println("ch是"+ Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='('||ch[i]=='['||ch[i]=='{'){
                stack.push(ch[i]);
            }
            if(ch[i]==')'||ch[i]==']'||ch[i]=='}'){
             if (stack.isEmpty()){
                 return false;
             }
             recerseCount++;
             Character pop = stack.pop();
           switch (ch[i]){
               case ')':
                   if(pop!='('){
                       return false;
                   }
                   break;
               case ']':
                   if (pop!='['){
                       return false;
                   }
                   break;
               case '}':
                   if (pop!='{'){
                       return false;
                   }
                   break;
           }
            }

        }
        if (recerseCount==-1){
            return false;
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
