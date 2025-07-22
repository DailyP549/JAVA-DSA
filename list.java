import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        

        List<String> al = new ArrayList<>();
        al.add("Saaa");
        al.add("deep");
        al.add(1,"gel");
        //print all element
System.out.println(al);
//updatting 
al.set(1,"drep");
System.out.println(al);
//search indexof element 
//search the first element 
al.indexOf("all of ");
System.out.println(al);
al.lastIndexOf("alt");
System.out.println(al);
 int i = al.indexOf(1);
      System.out.println(i);
      int l= al.lastIndexOf(2);
      System.out.println(l);
      //remove a element
      al.remove(1);
      System.out.println(al);
        //accessing an elemrt 
        String second = al.get(1);
        System.out.println(second);
        System.out.println(al);

    }
    
}
