package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AccessingPrivateConstructors2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls=Class.forName("ReflectionApi.Animal");

        Constructor<?> cons2=cls.getDeclaredConstructor(int.class,String.class);

//        System.out.println(cons2.isAccessible());
//        cons2.setAccessible(true);

        cons2.trySetAccessible();
        Object obj=cons2.newInstance(2,"tiger");

    }
}
class Animal{
    private Animal(int count,String name){
        System.out.println(name+" : " + count);
        System.out.println("*****");
    }
}
