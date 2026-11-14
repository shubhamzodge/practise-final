package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Access content inside private constructors so we need object;
public class AccessingPrivateConstructors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls=Class.forName("ReflectionApi.Company");

        Constructor<?> cons = cls.getDeclaredConstructor(int.class);
        /*
        System.out.println(cons.isAccessible());
        cons.setAccessible(true);

            Combination of above two methods is cons.trySetAccessible() : ha false cha true karto
         */
        cons.trySetAccessible();
        cons.newInstance(123);
    }
}
class Company{
    private Company(int i){
        System.out.println(i);
        System.out.println("*******");
    }

}
