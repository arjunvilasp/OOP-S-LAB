import java.util.*;

class Array{
 public static void main(String args[]){
  int arr1[] = new int[10];
  int temp;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter array elements:");
  for(int i=0;i<5;i++){
   arr1[i]=input.nextInt();
  }
  System.out.println("Array elements after sorting:");
  for(int i=0;i<5;i++){
     for(int j=i+1;j<5;j++){
       if(arr1[i]>arr1[j]){
        temp=arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=temp;
       }
     }
  }
  for(int i=0;i<5;i++){
    System.out.println(arr1[i]);
  }
 }
}
