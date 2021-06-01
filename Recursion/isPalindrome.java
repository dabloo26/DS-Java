import java.util.*;
class isPalindrome {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String sna=new String();
    sna=sc.nextLine();
    boolean na=isPalindrome(sna);
    System.out.println(na);
  }

  public static boolean isPalindrome(String s){
    
    if(s.length()==0||s.length()==1)
    return true;

    if(s.charAt(0)==s.charAt(s.length()-1))
    return isPalindrome(s.substring(1,s.length()-1));

    return false;

 }
}
