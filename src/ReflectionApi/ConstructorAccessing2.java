package ReflectionApi;

import java.lang.reflect.Constructor;

public class ConstructorAccessing2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
       Class<?>cls2 = Class.forName("java.lang.String");

      Constructor<?> []cons2= cls2.getDeclaredConstructors();
        //Constructor <?>[] cons2= cls2.getDeclaredConstructor(); //wrong
        for(Constructor i:cons2){
            System.out.println(i);
        }

    }
}
