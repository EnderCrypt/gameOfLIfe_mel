import java.awt.Dimension;

public class Main
	{
	public static Dimension screenSize = new Dimension(100,30);
	public static void main(String[] args)
		{
		if (args.length >= 2)
			{
			screenSize.width = Integer.parseInt(args[0]);
			screenSize.height = Integer.parseInt(args[1]);
			}
		}
	}