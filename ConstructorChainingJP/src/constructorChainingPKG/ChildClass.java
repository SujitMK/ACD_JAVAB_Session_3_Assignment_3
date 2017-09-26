package constructorChainingPKG;

public class ChildClass extends ParentClass{
	
    public ChildClass()                                                   // Default constructor
    {
    	this("SUJIT", "CRICKET");                                          // Calling parameterized constructor of child class
    	System.out.println("Welcome! You are inside default constructor of Child Class.");
    	System.out.println();
    }
    
    public ChildClass(String cName, String cFavrtSport)                    // Parameterized constructor
    {
    	super("SUJIT","ROTI AND ALOO SABJI");                              // Calling parameterized constructor of parent class
    	System.out.println("The name is: "+cName+" and Favourate Sport is: "+cFavrtSport);
    	System.out.println();
    }

}
