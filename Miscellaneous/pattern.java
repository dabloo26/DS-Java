import java.util.*;
class pattern {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    pattern obj=new pattern();
    obj.makepattern(n);
  }
  void makepattern(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}