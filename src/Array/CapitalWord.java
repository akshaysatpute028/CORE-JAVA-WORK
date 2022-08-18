package Array;

class CapitalWord {

	public static void main(String[] args) {
		  String name[]= {"neha","ajay","amit","om"};
		   
	       //String h="amit" + 12345;//ok 
	       
			    for(int i=0;i<name.length;i++)
			    {
			    	String p=(name[i].substring(0,1).toUpperCase() + name[i].substring(1));
			    	System.out.println(p);
			    	
			    }

	}

}
