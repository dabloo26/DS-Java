import java.util.*;
class Main {
  public static void main(String[] args) {
    // product(2 numbers) in an array of smallest and biggest number
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      if(max<arr[i])
      max=arr[i];

      if(min>arr[i])
      min=arr[i];
    }

    System.out.print(max*min);
     //System.out.println("Hello world!");
  }
}