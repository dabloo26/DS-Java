import java.util.*;
class Main {
  public static void main(String[] args) {
    //Reverse String using recursion

    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();

    }

    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        System.out.print(arr[i]*10+arr[j]+" , ");
      }
      System.out.println();
    }
  }
}
