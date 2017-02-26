package q1;

public class girl {
    // attributes of girl
    
    String n;       
    public int attractiveness;
    int budget;
    int intelligence;
    boolean status=false; //false for single, true for commited
    //String bf="";
	
    girl(String name,int attract,int expense,int intellect){
		n = name;
		attractiveness = attract;
		budget = expense;
		intelligence = intellect;
		status=false;
		//this.bf = "";
		
	}
	
    /*boolean boyfriend(boy b)
    {
	// matches a boy acc to girl's constraints
		if( b.budget >= budget )
			return true;
		else
			return false;
			
		
	}*/
}
