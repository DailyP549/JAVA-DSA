import java.util.ArrayList;
import java.util.List;

public class listInterface {
    public static void main(String[] args) {
        List<String> li= new ArrayList<>();
        li.add("java");
        li.add("python");
        li.add("DSA");
        li.add("C++");
        System.out.println("Element of List are:");
        for (String s : li) {
            System.out.println(s);
        }
        System.out.println("Element of first Index :"+li.get(1));
        li.set(1,"Javascript");
        System.out.println("Updated list:"+li);
        li.remove("C++");
        System.out.println("List After Removing Element : "+li);

    }
}
