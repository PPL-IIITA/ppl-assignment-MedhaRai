
package q1;

public class boy {
    //includes attributes of boy
    
    String name;       
    int attractiveness;
    public int budget;
    int intelligence; 
    int req;
    boolean status=false;  //false for single, true for commited
    
    
    boy(String n,int att, int b,int intel,int minreq)
    {
        name = n;
        attractiveness = att;  
	budget = b;
        intelligence = intel;
        req = minreq;
	status= false;
	
    }
    
}

