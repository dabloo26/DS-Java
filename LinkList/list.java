//user can use link list to.......
//insert at beginning
//insert at end
public class list{
  Node head;

  public void make(int data){
    Node node=new Node();
    head=node;
    node.data=data;
    //System.out.print(node.data);
  }

  public void atstart(int data){
    Node node=new Node();
    node.data=data;

    if(head==null)
    make(data);
    
    else{
        Node temp=head;
        head=node;
        node.next=temp;
    }
  }

  public void atend(int data){
    Node node=new Node();
    node.data=data;
    
    if(head==null)
    make(data);
    
    else{
      Node n=head;
      while(n.next!=null){
        n=n.next;
      }
      n.next=node;
    }
  }

  public void show(){
    Node node = head;
    while(node.next!=null){
      System.out.println(node.data);
      node= node.next;
    }
    System.out.println(node.data);
  }
}