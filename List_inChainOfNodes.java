/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */


    /**
      @return the number of elements in this list
     */
    public int size() {
      int counter = 0;
      Node holder = headReference;
      while(holder != null) {
        counter++;
        holder = holder.getReferenceToNextNode();
      }
      return counter;

    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String answer = "[";
        Node holder = headReference;
        for (int i = 0; i <size(); i ++) {
          answer += holder.getCargoReference() + ",";
          holder = holder.getReferenceToNextNode();
        }
        answer += "]";
        return answer;

    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        Node oldHead = headReference;
        headReference = new Node (val, oldHead);
        return true;
     }
}
