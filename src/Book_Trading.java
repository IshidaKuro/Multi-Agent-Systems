import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Runtime;

public class Book_Trading {
	
	public static void main(String args[])
	{
		//setup jade environment
		
				Profile myProfile = new ProfileImpl();
				Runtime myRuntime = Runtime.instance();
			
				ContainerController myContainer = myRuntime.createMainContainer(myProfile);
				
				try
				{
					//Start the agent controller, which is itself an agent (rma)
					AgentController rma = myContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
					rma.start();
					//start agents
					AgentController Agent0 = myContainer.createNewAgent("Buyer Seller Ticker", BuyerSellerTicker.class.getCanonicalName(), null);
				
				
				}
				
				catch(Exception e)
				{
				System.out.println("Exception starting agent: " + e.toString());
				}
	}

}
