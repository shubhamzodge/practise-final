package Comparable1;

import java.util.TreeSet;

public class Headmaster {
    public static void main(String[] args) {
        TreeSet<Student> s= new TreeSet<Student>();

        Student s1 = new Student(5,"Monti");
        Student s2 = new Student(6,"Moti");
        Student s3 = new Student(1,"Balu");

        s.add(s1);
        s.add(s2);
        s.add(s3);
        System.out.println(s);

    }
}
class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age,String name){
        this.age= age;
        this.name= name;
    }
    public String toString(){
        return this.name +" : "+ this.age;
    }
    public int compareTo(Student obj){
        return Integer.compare(this.age,obj.age);
    }

}
