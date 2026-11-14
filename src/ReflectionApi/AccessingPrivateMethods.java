package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingPrivateMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> cls = Class.forName("ReflectionApi.Train");

        Constructor<?> cons=cls.getDeclaredConstructor();

        cons.trySetAccessible();

        Object obj= cons.newInstance();

       Method m= cls.getDeclaredMethod("display", String.class);
       m.trySetAccessible();

       m.invoke(obj,"beed");

       Field f= cls.getDeclaredField("district");

       f.trySetAccessible();
        System.out.println(f.get(obj));




    }
}
class Train{
    private String district ="Nagpur";
    private void Train(){
      //  System.out.println(i+ " "+ str);
    }
    private void display(String name){
        System.out.println("welcome to: "+ name);
    }
}
