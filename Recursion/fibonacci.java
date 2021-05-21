import java.util.*;
class fibonacci{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


int ans=fibo(n);
System.out.println(ans);
}

public static int fibo( int n){
if(n==0||n==1)
return n;

if(n<0)
return -1;

return fibo(n-1)+fibo(n-2);
}}