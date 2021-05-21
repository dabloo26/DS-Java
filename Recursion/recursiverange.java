import java.util.*;
class recursiverange{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


int ans=range(n);
System.out.println(ans);
}

public static int range( int n){
if(n==0)
return 0;

if(n<0)
return -1;

return n+range(n-1);
}}