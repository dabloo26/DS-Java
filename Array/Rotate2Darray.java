import java.util.*;
class Main {
  public static void main(String[] args) {
    //rotate by 90 degree 
    //double dimension array
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] arr=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println();
    System.out.println();
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(arr[n-j-1][i]+ " ");
      }
      System.out.println();
    }
  }
}
