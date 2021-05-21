import java.util.*;
class productarray{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int ans=product(arr,n-1);
System.out.println(ans);
}

public static int product(int arr[], int n){
if(n==0)
return arr[0];

return (arr[n]*product(arr,n-1));
}}