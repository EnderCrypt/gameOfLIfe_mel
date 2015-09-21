import java.awt.Dimension;

public class Main
	{
	public static Dimension screenSize = new Dimension(53,180);
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
			Simulation.populate((int)((screenSize.width*screenSize.height)*0.2));
			boolean[][] life = Simulation.update();
			//Printer
			System.out.println("---------");
			Printer.printBool(life);
			//sleep
			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
			}
		}
	}