package org.example;

public class Driver {
    public static void main(String[] args) {
        // Instantiate the Symbol Table (using Integer for Key, String for Value as an example)
        ST<Integer, String> st = new ST<>();

        System.out.println("Testing Ordered Symbol Table...");

        // Example tests (these will only work once you implement the TODOs in ST.java)

        // 1. Test isEmpty()
        System.out.println("Is empty initially? " + st.isEmpty());

        // 2. Test put()
         st.put(5, "Apple");
         st.put(2, "Banana");
         st.put(8, "Cherry");

        // 3. Test size()
         System.out.println("Size after inserts: " + st.size());

        // 4. Test get()
         System.out.println("Value for key 2: " + st.get(2));

        // 5. Test min() and max()
         System.out.println("Min key: " + st.min());
         System.out.println("Max key: " + st.max());
    }
}