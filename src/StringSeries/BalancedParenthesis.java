package StringSeries;

import java.util.Stack;

public class BalancedParenthesis {

   public static  boolean isValid(String str){
       Stack<Character>stack= new Stack<>();
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(ch=='(' || ch=='{' || ch=='['){
               stack.push(ch);
           }
           else{
               if(stack.isEmpty()){
                   return false;
               }
               char open = stack.pop();
               if(ch==')' && open!='('||
               ch=='}' && open !='{'||
               ch==']' && open!='['){
                   return false;
               }
           }
       }

       return stack.isEmpty();
   }

   public static void main(String []args){
       System.out.println(isValid("[()[{()}]]"));
   }
}
