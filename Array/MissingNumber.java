import java.util.*;
class MissingNumber {
  public static void main(String[] args) {
    //assuming only one number is missing
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int k=1;
    int flag=0;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      if(k==arr[i]){
        k++;
      }
      else{
        flag=k;
        continue;
      }
    }
    System.out.println(flag);

  }
}