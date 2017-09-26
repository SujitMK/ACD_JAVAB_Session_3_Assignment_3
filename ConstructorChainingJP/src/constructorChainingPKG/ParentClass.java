package constructorChainingPKG;

public class ParentClass {
	
	public ParentClass()                                                                 // Default constructor
    {
    	System.out.println("Welcome! You are inside default constructor of Parent Class.");
    	System.out.println();
    }
    
    public ParentClass(String cName, String cFavrtFood)                                  // Parameterized constructor
    { 
        this();                                                           // Calling default constructor of parent class
    	System.out.println("The name is: "+cName+" and Favourate Food is: "+cFavrtFood);
    	System.out.println();
    }

}
