
package q1;

public class boy {
    //includes attributes of boy
    
    String name;       
    int attractiveness;
    public int budget;
    int intelligence; 
    int req;
    boolean status=false;  //false for single, true for commited
    //String gf="";
    
    boy(String n,int att, int b,int intel,int minreq)
    {
        name = n;
        attractiveness = att;  
	budget = b;
        intelligence = intel;
        req = minreq;
	status= false;
	//this.gf = "";
    }
    /*boolean girlfriend(girl g)
    {
        // matches a girl acc to boys's constraints
        if(budget >=g.budget && req <= g.attractiveness)
            return true;	
	else
            return false;
    }*/
	
}

