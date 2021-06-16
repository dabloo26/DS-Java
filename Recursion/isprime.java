class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    int y=isprime(11,2);
    System.out.println(y);
    int k=isprime(10,2);
    System.out.println(k);

  }

  public static int isprime(int n,int i){
    if(i<=n/2){
      if(n%i!=0){
        return isprime(n,++i);
      }
      else{
        return 0;
      }
    }

    return 1;  
  }
}
