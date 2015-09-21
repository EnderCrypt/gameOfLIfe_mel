import java.awt.Dimension;

public class Main
	{
	public static Dimension screenSize = new Dimension(100,30);
	public static void main(String[] args)
		{
		// gets the screensize as parameter
		if (args.length >= 2)
			{
			screenSize.width = Integer.parseInt(args[0]);
			screenSize.height = Integer.parseInt(args[1]);
			}
		Printer.init(screenSize);
		// initialises the simulation
		Simulation.init(screenSize);
		// start simulation
		while (true)
			{
			boolean[][] life = Simulation.update();
			//Printer
			//<---- ANDVÄND boolean[][] life för att ria om skärmen här
			//sleep
			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
			}
		}
	}