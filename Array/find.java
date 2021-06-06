
//TO FIND AN ELEMENT IN AN ARRAY

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int tosearch=sc.nextInt();
    int n=sc.nextInt();
    int[] arr=new int[n];
    int flag=-1;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      if(arr[i]==tosearch){
      System.out.println(i);
      flag=1;
      }
    }
    if(flag==-1)
    System.out.println("ELEMENT NOT FOUND");

    //System.out.println("Hello world!");
  }
}