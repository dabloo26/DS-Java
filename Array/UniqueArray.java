import java.util.*;
class Main {
  public static void main(String[] args) {
    //unique Array
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int flag=-1;
    for(int i=0;i<n-1;i++){
      int c=0;
      for(int j=i+1;j<n;j=j+1){
        if(arr[i]==arr[j])
        c++;
      }
      if(c>0){
      flag=1;
      break;
      }
    }
    if(flag==1)
    System.out.print("not unique");
    else
    System.out.println("unique");
  }
}
