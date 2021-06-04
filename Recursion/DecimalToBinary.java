import java.util.*;
class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    DecimalToBinary obj=new DecimalToBinary();
    
    System.out.print(obj.dectobin(n));
  }
  int dectobin(int n){
    if(n==1)
    return 1;

    return dectobin(n/2)*10+(n%2);
    }
  }
