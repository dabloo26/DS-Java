import java.util.*;
class Main {
  public static void main(String[] args) {
    //given a continuous array till "n" starting from 1
    //Assuming multiple numbers are missing
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int j=1;j<=arr[n-1];j++){
      int flag=-1;
    for(int i=0;i<n;i++){
      if(j==arr[i]){
        flag=1;
      }
    }
    if(flag==1){
      continue;
    }
    else
    System.out.print(j+"  ");
    }
  }
}