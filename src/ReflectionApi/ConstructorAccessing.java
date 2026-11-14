package ReflectionApi;

import java.lang.reflect.Constructor;

//Accessing public & private constructors
public class ConstructorAccessing {
    public static void main(String[] args) throws ClassNotFoundException {
       Class<?>cls= Class.forName("ReflectionApi.Library");

        Constructor<?>[]cons= cls.getDeclaredConstructors();
        for(int i=0;i< cons.length;i++){
            System.out.println(cons[i]);
        }
        //through for each loop
        for(Constructor i: cons){
            System.out.println(i);
        }
    }
}
class Library{
    public Library(){

    }
    public Library(int i){

    }
    private Library(String str1,String str2){

    }
}
