import java.util.*;
public class Factorial
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int ans=factorial(n);
		System.out.println(ans);
	}
	public static int factorial(int num){
	    if(num<0)
	    return -1;
	    
	    if(num==0||num==1)
	    return 1;
	    
	    return num*factorial((num-1));
	}
}