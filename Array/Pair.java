import java.util.*;
class Main {
  public static void main(String[] args) {
    //pairs of integers which sum up to target
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("enter target");
    int target=sc.nextInt();
    Main obj=new Main();
    int[] p=obj.Pair(arr, target);
    for(int i=0;i<n;i++){
      if(p[i]==0)
      continue;
      System.out.print(p[i]+"  ");
      if((i+1)%2==0)
      System.out.println();
    }
  }
  public int[] Pair(int[] arr, int target){
    int l=arr.length;
    int k=0;
    int[] array1=new int[l];
    for(int i=0;i<l;i++){
      for(int j=i+1;j<l;j++){
        if((arr[j]+arr[i])==target){
        array1[k]=arr[i];
        array1[++k]=arr[j];
        k++;
        }
      }
    }
    return array1;
  }
}