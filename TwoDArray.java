import java.util.*;

class TwoDArray{
 public static void main(String args[]){
  int arr[][] = new int[10][10];
  int r,c;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the no of rows:");
  r = input.nextInt();
  System.out.println("Enter the no of columns:");
  c = input.nextInt();
  System.out.println("Enter the array elements:");
  for(int i=0;i<r;i++){
     for(int j=0;j<c;j++){
       arr[i][j] = input.nextInt();
     }
  }
  System.out.println("Array elements are:");
   for(int i=0;i<r;i++){
     for(int j=0;j<c;j++){
      System.out.print(arr[i][j]+" ");
     }
     System.out.print("\n");
  }
 }
}
