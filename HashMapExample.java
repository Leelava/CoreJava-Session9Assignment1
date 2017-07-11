package collections.assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapExample {

	public static void main(String[] args) {
		//defining  Generic HashMap hm with Empcode and Empname
		HashMap<Integer,String> hm = new HashMap<Integer,String>();//Key Empcode is of Integer type ,EMpname of String
       //populating key and values
		hm.put(2345, "Shaym");
        hm.put(3456, "Prasanna");
        hm.put(4567, "Neeraja");
        hm.put(5678, "Satish");
        
        //to print the values, first get the keyset() which returns the Setand get the iterator on the same
        Iterator<Integer> keySetIterator = hm.keySet().iterator(); 
        System.out.println( "The  values are : ");
        while(keySetIterator.hasNext())
        {
        	Integer key = keySetIterator.next();
            System.out.println(  hm.get(key));
            } 

        System.out.println(hm.keySet());
        
	}

}
