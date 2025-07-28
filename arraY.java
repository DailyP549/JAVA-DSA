public class arraY {

    public static void main(String[] args) {
        int arr[];
        arr= new int[5];
        System.out.println("Array before adding data ");
        display(arr);
//Add element
for (int i = 0; i < arr.length; i++) {
    System.out.println("Adding "+i+" at index "+i);
    arr[i]=i;
}System.out.println();


//after adding data
System.out.println("After adding data");
display(arr);
//update 
int index=5;
arr[index]=10;
System.out.println("Array after adding the element at index "+index);
display(arr);
//search using the value
//search the element usng the value
 int value = 4;
      for(int i = 0; i< intArray.length; i++)
      {
         if(intArray[i] == value ){
            System.out.println(value + " Found at index "+i);
            break;
         }
      }         
      System.out.println("Data at index " + index + ": "+ intArray[index]);
   }













    }
    public static void display(int[] arr){
        System.out.print("Array : [");
        for(int i =0;i<arr.length;i++){
System.out.print(" "+arr[i]);
        }System.out.println(" ]");
        System.out.println();
    }
}
 //
// 
import java.util.*;
import  java.util.ArrayList;
class d{
    public static void main(String[] args) {
        //itrative approach of hte array

// int[] arr= {10,20,30,40,70,60,90};
// ArrayList<Integer> res= getAlternates(arr);
// for(int i:res){
//     System.out.println(i+" ");
// }
//-----------------leaders in an array

int[] arr={10,33,42,2,53,7,1};
ArrayList<Integer>result= leaders(arr);
for(int res:result){
    System.out.println(res+" ");
}System.out.println();







    }






    
static ArrayList<Integer> leaders(int[] arr)
{
    ArrayList<Integer> result = new ArrayList<>();
    int n= arr.length;
    for(int i =0;i<n;i++)
    {
        int j;
        for(j=i+1;j<n;j++)
        {
            if(arr[i]<arr[j])
            {
                break;
            }

        }
        if(j==n)
        {
            result.add(arr[i]);
        }return result;

    }
}







    static ArrayList<Integer> getAlternates(int[] arr)
    {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i+=2) 
        {
            res.add(arr[i]);

        }
        return res;

    }
}
