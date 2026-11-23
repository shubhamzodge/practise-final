package Comparator2;

import java.util.Comparator;
import java.util.TreeSet;

public class Notebook {
    public static void main(String[] args) {
        //TreeSet<Book> tree = new TreeSet<Book>( new pageComparator());
        TreeSet<Brand> br= new TreeSet<Brand>(new pagesComparator());

        Brand b1 = new Brand(100,"youva");
        Brand b2 = new Brand(200,"atlas");
        Brand b3 = new Brand(50,"Bharti");

        br.add(b1);
        br.add(b2);
        br.add(b3);

        System.out.println(br);

    }
}
class Brand{
    int pages;
    String brandName;

    public Brand(int pages,String brandName){
        this.pages= pages;
        this.brandName= brandName;
    }
    public String toString (){
        return brandName+" : "+ pages;
    }
    }
class pagesComparator implements Comparator<Brand>{
    public int compare(Brand b1,Brand b2){
        return Integer.compare(b2.pages,b1.pages);
    }
}
