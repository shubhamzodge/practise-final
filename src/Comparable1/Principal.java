package Comparable1;

import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {
        TreeSet<Teacher5> set= new TreeSet<Teacher5>();

        Teacher5 first = new Teacher5("shubham",5);
        Teacher5 second = new Teacher5("Aditya",7);
        Teacher5 third = new Teacher5("Raju",8);
        Teacher5 fourth = new Teacher5("Kalidas",1);

        set.add(first);
        set.add(second);
        set.add(third);
        set.add(fourth);

        System.out.println(set);


    }
}
class Teacher5 implements Comparable<Teacher5>{
    String name;
    int age;

    public Teacher5(String name,int age){
        this.name= name;
        this.age = age;
    }
    public String toString(){
        return this.name +" : "+ this.age;
    }

    @Override
    public int compareTo(Teacher5 o) {
        return Integer.compare(this.age,o.age);
    }
}



