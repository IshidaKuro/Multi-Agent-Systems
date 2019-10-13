import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class SimpleAgent extends Agent {

	
	protected void setup()
	{
		System.out.println("Agent " + getAID().getName()+" ready for tasking");
		
		//randomly generate a time for the agent to die
		double death = 60000 + (Math.random() * 60000);
		
		//store when the application was started so we can keep track of time
		long t0 = System.currentTimeMillis();
		

		
		addBehaviour(new TickerBehaviour(this, 10000) {
			//call onTick every 10 seconds (1,000 ms = 1 second)
			
			protected void onTick()
			{

				//check if it's time to die
				if ((System.currentTimeMillis() - t0) > death)
				{
					System.out.println(getAID().getName().substring(0, getAID().getName().indexOf('@')) + " has died.");
					myAgent.doDelete();
				}
				else
				{
					//print name
					System.out.println(getAID().getName().substring(0, getAID().getName().indexOf('@')));
					
				}
				
			}
		});
		
	}
}
