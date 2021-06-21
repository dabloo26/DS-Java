  public void deleteatend(){
    if(head==null){
      System.out.println("LL EMPTY");
    }
    else{
      Node node = head;
      Node n=head;
    while(node.next!=null){
      n=node;
      //System.out.println(node.data);
      node= node.next;
      }
      n.next=null;
    }
    
  }
