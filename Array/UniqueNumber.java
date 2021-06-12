import java.util.*;
class Main {
  public static void main(String[] args) {
    //Unique Number
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int flag=-1;
    for(int i=0;i<=9;i++){
      int c=0;
      for(int j=n;j>0;j=j/10){
        if(j%10==i)
        c++;
      }
      if(c>1){
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
