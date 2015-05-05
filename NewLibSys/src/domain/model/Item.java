package domain.model;


import java.io.Serializable;

/**This is an abstract class with the subclasses Book, Article, CD and DVD. The class sets the title
 * of the items as well as their lending status. It also contains the abstract methods setAddDate() and copy()
 * that are defined in the subclasses.
    */ 
public abstract class Item  implements Serializable
{
		private String title;
	       private String StatusToString;
	       
	       /**For the state pattern */
	       
	       private State lendOutState; 
	       private AvailableState availableState;
	       private State state;
	        
	       
	       /**
	           * Constructor for abstract item class initializes the fields title and
	           * status. 
	           * @param title
	           * @param status
	           */
	       public Item(String title)
	       {
	         
	          this.title = title;
	          
	     
	          lendOutState = new LendOutState(this); 
	          availableState = new AvailableState(this); 
	          this.state = availableState; 
	          
	       }
	       
	       public void lendItem(String name, String email)
	       {
	    	   state.lendOut(name, email);
	       }
	       
	       public void returnItem()
	       {
	    	   state.returnItem();
	       }

	       public String getTitle()
	       {
	          return this.title;
	       }

	       public void setTitle(String title)
	       {
	        
	          this.title = title;
	       }
	       
	       public State getAvailableState()
	       {
	    	   return availableState; 
	       }
	       
	       public State getLendoutState(String name, String email)
	       {
	    	   return lendOutState;
	       }
	       /**
    	    * This method translates the get status integer to 
    	    * a string which is the use in toString method
    	    * @return statusToString
    	    */
	       public String getStatusToString()
	       {
    	     if (state.equals(lendOutState))
	          {
	        	  return " lent out. ";
	          }
	         if (state.equals(availableState))
	          {
	        	  return " available. ";
	          }
	          
	        return "Check item STATUS ";
	    	   
	       }
	       
	       public State getState()
	       {
	    	   return state;
	       }
	       
	       public void setState(State state)
	       {
	    	   this.state = state;
	       }
	       /**Overrides the object toString() and returns
    	    * this class' fields except the status is changed to a string.
    		 */
	       @Override
		public String toString() 
	       {	              
			return "title = " + title + ", status = " + getStatusToString();
	       }
    		 	  
	    public abstract boolean equals(Object obj);		
	
		
		

}
