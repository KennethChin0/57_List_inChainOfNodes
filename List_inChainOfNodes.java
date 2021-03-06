/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
      The default constructor is fine:
      take zero arguments
      do nothing
     */

    /**
      @return the number of elements in this list
     */
    public int size() {
        // recursive approach seems more perspicuous
        if( headReference == null) return 0;
        else return size( headReference);
    }

    // recursively-called helper
    private int size( Node startingAt) {
        Node next = startingAt.getReferenceToNextNode();
        if( next == null) return 1;
        else return 1+ size( next);
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String stringRep = size() + " elements [";

        for( Node node = headReference
           ; node != null
           ; node = node.getReferenceToNextNode() )
            stringRep += node.getCargoReference() + ",";
        return stringRep + "]";
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        headReference = new Node( val, headReference);
        return true;
     }

     public Object set( int index, Object value) {
         int nodeIndex = 0;
         Node currentNode;
         Object oldCargo;
         for (currentNode = headReference; nodeIndex < index; currentNode = currentNode.getReferenceToNextNode() )
             nodeIndex++;
         oldCargo = currentNode.getCargoReference();
         currentNode.setCargoReference( value);
         return oldCargo;
     }

     public Node getNode (int index) {
        int nodeIndex = 0;
        Node currentNode;
        for (currentNode = headReference; nodeIndex < index; nodeIndex++ , currentNode = currentNode.getReferenceToNextNode() ) {}
        return currentNode;
    }

     public Object get(int index){
       int counter = 0;
       Node answer = headReference;
       while (counter != index){
         counter ++;
         answer = answer.getReferenceToNextNode();
       }
       return answer.getCargoReference();
     }

     public void add(int index, Object value){
       if (index == 0){
         addAsHead(value);
       }
       else {
             Node nodeBefore = getNode(index);
             Node newNode = new Node( value, nodeBefore.getReferenceToNextNode() );
             nodeBefore.setReferenceToNextNode( newNode);
         }
     }


   public Object remove(int index) {
     int nodeIndex = 0;

     Node nodeBefore;
     for(nodeBefore = headReference; nodeIndex < index; nodeBefore = nodeBefore.getReferenceToNextNode()){
      nodeIndex ++;
    }
    Object oldObject = nodeBefore.getCargoReference();
    nodeBefore.setCargoReference(null);
    return oldObject;
     }
}
