public class CreateList { 
   public Node head = null;  
   public Node tail = null;  
     
    
   public void display(){
       if(head != null){
           Node current = head;
       do{
        System.out.println(current.data);
       current = current.next;}
       while(current!= head);
       System.out.println();}
    
    }
       
       public void add(int data){
           Node newNode = new Node(data);
           if (head == null){
               head = newNode;
               tail = newNode; 
            }
            else{
               newNode.next = head;
               head = newNode;
               tail = newNode; 
               }
            }
 
            public void delete(){
               head = head.next;
   
                }
   }