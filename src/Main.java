import java.awt.Dimension;

public class Main
	{
	public static Dimension screenSize = new Dimension(182,56);
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
			int total = (int)(screenSize.width*screenSize.height);
			long millis = System.currentTimeMillis();
			int population = Simulation.populate((int)(total*0.05),(int)(total*0.2));
			boolean[][] life = Simulation.update();
			//Printer
			System.out.println();
			Printer.printBool(life);
			//print delta of execution
			System.out.print("POPULATION: "+population+" | MAX: "+total+" | execution delta: "+(System.currentTimeMillis()-millis)+" Milis");
			//sleep
			try{Thread.sleep(250);}catch(InterruptedException e){e.printStackTrace();}
			}
		}
	}