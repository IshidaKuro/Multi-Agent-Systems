import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Runtime;

public class Application {

	public static void main(String[] args) {
		
		//setup jade environment
		
		Profile myProfile = new ProfileImpl();
		Runtime myRuntime = Runtime.instance();
		ContainerController myContainer = myRuntime.createMainContainer(myProfile);
		
		try
		{
			//Start the agent controller, which is itself an agent (rma)
			AgentController rma = myContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
			rma.start();
			
			//create simple agents
			AgentController Agent0 = myContainer.createNewAgent("Adam", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent1 = myContainer.createNewAgent("Bruce", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent2 = myContainer.createNewAgent("Carley", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent3 = myContainer.createNewAgent("Deardrie", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent4 = myContainer.createNewAgent("Evan", SimpleAgent.class.getCanonicalName(), null);		
			AgentController Agent5 = myContainer.createNewAgent("Fred", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent6 = myContainer.createNewAgent("George", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent7 = myContainer.createNewAgent("Hilda", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent8 = myContainer.createNewAgent("Ian", SimpleAgent.class.getCanonicalName(), null);
			AgentController Agent9 = myContainer.createNewAgent("James", TickerAgent.class.getCanonicalName(), null);
								
			Agent0.start();
			Agent1.start();
			Agent2.start();
			Agent3.start();
			Agent4.start();
			Agent5.start();
			Agent6.start();
			Agent7.start();
			Agent8.start();
			Agent9.start();		
			
		}	
		
		catch(Exception e)
		{
		System.out.println("Exception starting agent: " + e.toString());
		}
		
	}

}
