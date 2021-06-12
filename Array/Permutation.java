import java.util.*;
class Main {
  public static void main(String[] args) {
    //given two arrays
    // check if they both are permutation of each other
    //permutation - elements are same no matter the index (acc to //question)
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int m=sc.nextInt();

    if(m!=n){
      System.out.println("False");
      System.exit(0);
    }
    int[] arr1=new int[m];
    for(int i=0;i<m;i++){
      arr1[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(arr[i]==arr1[j]){
          arr1[j]=0;
          continue;
        }
      }
    }
    for(int i=0;i<m;i++){
      if(arr1[i]!=0)
      System.out.println("False");
    }
    System.out.println("TRUE");
    //O(N^2)

    //better solution sort in O(N log N)
    // loop till N check if value is same or not.
  }
}
