  public void deleteatlocation(int p){
    Node n=head;
    Node temp=head;
    for(int i=1;i<p;i++){
        temp=n;
        n=n.next;
    }
    n=n.next;
    temp.next=n;
  }
