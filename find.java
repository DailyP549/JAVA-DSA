

public class find {
    // void oddeven(int num) {
    //     if (num % 2 == 0) {
    //         System.out.println("the number is even");

    //     } else {
    //         System.out.println("ODD");
    //     }
    //     System.out.println();
    // }

    // String pass(int scr) {

    //     if (scr < 35) {
    //         return "fail";
    //     } else {
    //         return "pass";
    //     }
    // }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // // int num = scan.nextInt();
        // // int tm = scan.nextInt();
        // find obj = new find();
        // // String result = obj.pass(tm);
        // // System.out.println(result);
        // // obj.oddeven(num);
        // int[] arr = { 1, 3, 3, 4, 2, 4 };
        // int x;
        // for (int y : arr) {
        //     System.out.println(y);
            
        // // }
        // String al="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // System.out.println("al is "+al);
        // System.out.println("al length is "+al.length());
        // String sub =al.substring(3,9);
        // System.out.println("sub is "+sub);
        // System.out.println("sub = sub.length"+sub.length());
        // System.out.println("sub char at 2 is "+ sub.charAt(4));
        // System.out.println("al char at is "+al.charAt(3));
// String fname="demon";
// String lname="slayer";
// System.out.println(lname+" "+fname);
// String nm =fname +" "+ lname;


// System.out.println("anme"+nm);
// nm += " don ";
//  System.out.println(nm);
//  nm+=" bannn";
//  System.out.println(nm);

// String s1 ="abc";
// String s2="abc";
// System.out.println("s1==s2 "+ (s1==s2));
// String s3 =new String("abc");
// System.out.println("s3==s2"+ (s3==s2));
// String s4 =new String("abc");
// System.out.println("s4==s3"+ (s4==s3));
 
// String str ="ademsk2k3sefreksjf";
// System.out.println("Str: "+str);
// int i = str.indexOf('s');
// System.out.println("The first index of "+i);
// i= str.indexOf('s',i+1);
// System.out.println("THE secong index of "+ i);
// i = str.indexOf('f', i+1);
// System.out.println(" "+i);
// System.out.println(i);
//   System.out.println(str.replace('2', 'n'));
//  
int[] a={12,33,44,28,94,73,56};
int n=a.length;
for (int i = 0; i <= n-1; i++) {
  for(int j=0;j<n-i-1;j++){
    if(a[j]>a[j+1]){
      int c =a[j];
      a[j]=a[j+1];
      a[j+1]=c;
    }
  }
    
}System.out.print("Sorted array");
for (int i = 0; i < 10; i++) {
   System.out.print(a[i]+" "); 
}System.out.println();














}
}
