package Collection;

import java.util.*;

public class MapExample4 { 
	public static void main(String[] args) {  
    Map<Integer,String> m=new HashMap();  
    //Adding elements to map  
    m.put(1,"Akshay");  
    m.put(5,"Rahul");  
    m.put(2,"Vijay");  
    m.put(6,"Amit");  
    //Traversing Map  
    Set set=m.entrySet();
    Iterator itr=set.iterator();  
    while(itr.hasNext()){
        Map.Entry e=(Map.Entry)itr.next();  
        System.out.println(e.getKey()+" "+e.getValue());  
        
    }  
}  
}  