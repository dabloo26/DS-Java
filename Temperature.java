import java.util.*;
class Temperature {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter No. of DAYS:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println();
    for(int i=0;i<n;i++){
      System.out.print("Day "+(i+1)+"'s Temperature:");
      arr[i]=sc.nextInt();
      System.out.println();
    }
    float sum=0;
    float avg;
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
    }
    avg=(sum/n);
    int c=0;
    for(int i=0;i<n;i++){
      if(arr[i]>avg)
      c++;
    }
    System.out.println("Average Temperature:"+avg);

    System.out.println(c+" day(s) above average temperature");
  }
}