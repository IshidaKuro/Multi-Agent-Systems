import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.TickerBehaviour;

public class TickerAgent extends Agent
{
	//get the current time
	long t0 = System.currentTimeMillis();
	
	Behaviour loop;
	protected void setup()
	{
		loop = new TickerBehaviour(this, 300)
				{
					protected void onTick()
					{
						//print elapsed time since launch
						System.out.println(System.currentTimeMillis()-t0 +		": " + myAgent.getLocalName());
					}
				};
				
		addBehaviour(loop);
	}
}
