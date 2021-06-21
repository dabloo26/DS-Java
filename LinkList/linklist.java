public class Link{
  Node head;
//inserts at the beginning
  public void add(int data){
    Node node=new Node();
    node.data=data;
    if(head==null){
      head=node;
    }
    else{
      Node n=head;
      while(n.next!=null){
        n=n.next;
      }
      n.next=node;
      
    }
        
  }

  public void print(){
    Node n=head;
      while(n.next!=null){
        System.out.print(n.data+"->");
        n=n.next;
      }
      System.out.print(n.data);
  }
}
