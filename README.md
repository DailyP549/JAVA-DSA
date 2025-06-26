//-------------------------------------------------
//  ----------------BUBBBEL SHORT------------------
//example 1;
// int[] a={12,33,44,28,94,73,56};
// int n=a.length;
// for (int i = 0; i <= n-1; i++) {
//   for(int j=0;j<n-i-1;j++){
//     if(a[j]>a[j+1]){
//       int c =a[j];
//       a[j]=a[j+1];
//       a[j+1]=c;
//     }
//   }
    
// }System.out.print("Sorted array");
// for (int i = 0; i < 10; i++) {
//    System.out.print(a[i]+" "); 
// }System.out.println();


//----------------------------------------------

//---------------BUBBLE SHORT-------------------
//example2
int[] a={1,4,5,63,7,35,4,59,3,2,1,0,9,8,70,6,5,4,3,2,1};
int b= a.length;
for (int i = 0; i < b-1; i++) {
boolean d =false;
for(int j=0;j<b-i-1;j++){
  if(a[j]>a[j+1]){
    int c =a[j];
    a[j]=a[j+1];
    a[j+1]=c;
    d=true;
  }
}    if(!d){
  break;
}
}System.out.println("Sorted array:");
for (int i = 0; i <b; i++) {
  System.out.print(a[i]+" ");


    
}System.out.println();}
}
