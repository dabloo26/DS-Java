import java.util.*;
class Pattern3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Pattern3 obj=new Pattern3();
    obj.makepattern(n);
  }
  void makepattern(int n){
    /*for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(i);
      }
      System.out.println();
    }*/
    int m=0;
    for(int i=n;i>=0;i--){
      for(int k=0;k<m;k++){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print(i);
      }
      m++;
      System.out.println();
    }
  }
}