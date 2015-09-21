import java.awt.Dimension;
import java.awt.Point;

public class Printer
{
	public static boolean[][] outputArray;
	public static Dimension screenSize;
	
	
	public static void init(Dimension screenSize)
	{
		Printer.screenSize = screenSize;
		outputArray = new boolean[screenSize.width][screenSize.height];
		clear();
	}


	private static void clear()
	{
		clear(screenSize);
	}
	
	private static void clear(Dimension screenSize)
	{
		for(int x=0;x<screenSize.width;x++)
		{
			for(int y=0;y<screenSize.height;y++)
			{
				outputArray[x][y] = false;
			}
		}
	}//clear(dim)
	
	
	private static void drawPrint(Point point, String text)
	{
		drawPrint(point, text, 1);
	}


	private static void drawPrint(Point point, String text, int allign)
	{
		switch(allign)
		{
		case -1:
			for(int i=0;i<text.length();i++)
				put(new Point(point.x-i, point.y), text.charAt(i));
			break;
		case 1:
			for(int i=0;i<text.length();i++)
				put(new Point(point.x+i, point.y), text.charAt(i));
			break;
		}
	}


	private static boolean put(Point point, char ch)
	{
		if((point.x>=0) && (point.y>=0) 
				&& (point.x<screenSize.width)
				&& (point.y<screenSize.height))
		{
			outputArray[point.x][point.y] = true;
			return true;
		} else
			return false;
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
