import java.util.*;
class Maximum {
  public static void main(String[] args) {
    //product(2 numbers) in an array of min and max value
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      if(max<arr[i]){
      min=max;
      max=arr[i];
      }
      if(arr[i]>min&&arr[i]<max){
        min=arr[i];
      }
    }
    System.out.print(max*min);
    //System.out.println(kk);
  }
}