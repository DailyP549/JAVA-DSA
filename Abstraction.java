import java.util.*;
import java.util.List;
import java.util.AbstractList;
public class Abstraction {
    public static void main(String[] args) {

        //-------------------------
        //>>>>>>>>>>>>>>>>>>>>>>>Abstract subclass of ----ARRAYLIST
        AbstractList<String> lt = new ArrayList<String>();
        lt.add("gray");
        lt.add("green");
        lt.add("red");
        lt.add("yellow");
        lt.add("20");
System.out.println("AbstractList"+lt);
System.out.println();
//----------------AbstractL subclass of linked list
AbstractList <String> ls =new LinkedList<String>();
ls.add("30");
 ls.add("gray");
        ls.add("green");
        ls.add("red");
        ls.add("yellow");
        ls.add("20");
        ls.remove(3);
        System.out.println("Final Abstractlist :"+ls);
        int lst= ls.lastIndexOf("A");
        System.out.println("last index of A: "+lst);
System.out.println();
//------------------Abstract subclass List
List<Integer> li = new myList(5);
for (Integer i : li) {
    System.out.println(i);
}
    }}


public class myList extends AbstractList<Integer>{
private int s;
public myList(int s){
    this.s=s;
}
@Override
public Integer get(int index){
    return index;
}
@Override
public int size(){
    return s;
}

}