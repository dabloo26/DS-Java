  public void deletevalue(int value){
    //delete value 12 or any other
    //delete the value in link list which is passed
    if(searchfordeleteatvalue(value)==0){
      System.out.println("VALUE NOT FOUND IN LIST");
    }

    else{
      Node n=head;
      Node temp=head;
      while(n.next!=null){
          temp=temp.next;
          if(temp.data==value)
          {
            temp=temp.next;
            n.next=temp;
            return;
          }
          n=n.next;
      }
      temp.next=n;
    }
  }
