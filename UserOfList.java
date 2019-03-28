/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

        int index = 0;
        for( int i = 0; i < elements.length; i++ ) {
          System.out.println("Element " + index + " : "+ list.get(index));
          index ++;
        }
        System.out.println(System.lineSeparator());

        list.add(0, "L");
        System.out.println("add at index " + 0 + " : "+ list);
        list.add(list.size() / 2, "L");
        System.out.println("add at index " + list.size() / 2 + " : "+ list);
        list.add(list.size()-1, "L");
        System.out.println("add at index " + list.size()+ " : "+ list);

        System.out.println(System.lineSeparator());
        System.out.println("set at index 2 " + "\nold value "+ list.set(2, "X") +  "\n" + list);

        System.out.println(System.lineSeparator());
        System.out.println("set at index " + list.size() /2 + "\nold value "+ list.set(list.size() / 2, "X") +  "\n" + list);
        System.out.println(System.lineSeparator());
        System.out.println("set at index 2 " + list.size() + "\nold value "+ list.set(list.size() -1, "X") +  "\n" + list);


        System.out.println(System.lineSeparator());
        System.out.println("remove at index 2 " + "\nold value "+ list.set(2, "X") +  "\n" + list);

        System.out.println(System.lineSeparator());
        System.out.println("remove at index " + list.size() /2 + "\nold value "+ list.remove(list.size() / 2) +  "\n" + list);
        System.out.println(System.lineSeparator());
        System.out.println("remove at index 2 " + list.size() + "\nold value "+ list.remove(list.size() -1) +  "\n" + list);


    }
}
