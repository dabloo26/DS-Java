  public void deleteatstart(){
    if(head==null){
      System.out.println("LL EMPTY");
    }
    else{
      Node n=head;
      n=n.next;
      head=n;
    }
  }
