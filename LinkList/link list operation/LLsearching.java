 public void search(int data){
    Node node = head;
    while(node.next!=null){
      if(node.data==data)
      {
        System.out.println("Yes Found the value");
        return;
      }
      node= node.next;
    }
    System.out.println("not found");
  }
}
