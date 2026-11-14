package ReflectionApi;

import java.lang.reflect.Field;

public class FieldAccessing {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls3=Class.forName("ReflectionApi.Village");
       Field[]f1=cls3.getDeclaredFields();
       for(Field f2:f1){
           System.out.println(f2);
       }
    }
}
class Village{
    int villageNumber;
    String name;
    String district;
}
