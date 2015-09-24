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
		
		for(int y=0;y<screenSize.height-1;y++)
		{
			String output="";
			for(int x=0;x<screenSize.width-1;x++)
			{
				if(life[x][y])
					output=output+"@";
				
				else
					output=output+".";
			}			
			System.out.println(output); //output=output+"\n";
		}
		
		
	}
}//class
