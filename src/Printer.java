import java.awt.Dimension;

public class Printer
{
	//public static boolean[][] outputArray;
	public static Dimension screenSize;
	
	
	public static void init(Dimension screenSize)
	{
		Printer.screenSize = screenSize;
	}

	public static void printBool(boolean [][] life)
	{
		StringBuilder output = new StringBuilder();
		for(int y=0;y<screenSize.height-1;y++)
		{
			for(int x=0;x<screenSize.width-1;x++)
			{
				if(life[x][y])
					output.append('@');
				
				else
					output.append('.');
			}			
			output.append('\n'); //output=output+"\n";
		}
		System.out.println(output);
		
		
	}
}//class
