package ReflectionApi;

import java.lang.reflect.Method;

public class MethodAccessing {
    public static void main(String[] args) throws ClassNotFoundException {
       Class<?>cls= Class.forName("ReflectionApi.Employee");
      Method [] meth= cls.getDeclaredMethods();
      for(Method m:meth){
          System.out.println(m);
      }
    }
}
class Employee{
    public static void run(){

    }
    public static void display(String str){
        System.out.println("Displaying the content");
    }
    private static void execute(int i,int j){
        System.out.println(i+j);
    }
}
