import java.util.*;
class power
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int base=sc.nextInt();
		int ans=power(base,n);
		System.out.println(ans);
	}
	public static int power(int base, int n){
	    if(n==0)
	    return 1;
	    
	    return base*power(base,n-1); 
	}
}