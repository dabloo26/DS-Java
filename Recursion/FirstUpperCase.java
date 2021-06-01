import java.util.*;
class FirstUpperCase {
  public static void main(String[] args) {
   

    Scanner sc=new Scanner(System.in);
    String sna=new String();
    sna=sc.nextLine();
    char na=FirstUpper(sna);
    System.out.println(na);
  }

  public static char FirstUpper(String s){

    if(s.charAt(0)>='A'&& s.charAt(0)<='Z')
    return (s.charAt(0));

    if (s.length()<=1)
    return '0';


    return FirstUpper(s.substring(1)); 

 }
}
