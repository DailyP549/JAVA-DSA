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