import java.util.*;
class Main {
  public static void main(String[] args) {
    //Reverse String using recursion

    Scanner sc=new Scanner(System.in);
    String sna=new String();
    sna=sc.nextLine();
    String na=reverse(sna);
    System.out.println(na);
  }

  public static String reverse(String str)
    {
        if(str.isEmpty())
        return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
}