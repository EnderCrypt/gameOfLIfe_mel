import java.awt.Dimension;
import java.awt.Point;

public class Printer
{
	public static Dimension screenSize;
	
	public static void init(Dimension screenSize)
	{
		Printer.screenSize = screenSize;
	}
	
	public static void printBool(boolean [][] life)
	{
		for(int x=0;x<screenSize.width-1;x++)
		{
			for(int y=0;y<screenSize.height-1;y++)
			{
				if(life[x][y])
					System.out.print('@');
				else
					System.out.print('.');
					//put(point.x, point.)
			}
			System.out.println();
		}
	}
}//class
