import java.awt.Dimension;
import java.awt.Point;

public class Simulation
	{
	private static boolean[][] life;
	private static Dimension simulationSize;
	public static void init(Dimension simulationSize)
		{
		life = new boolean[simulationSize.width][simulationSize.height];
		Simulation.simulationSize = simulationSize;
		}
	public static boolean[][] update() // will return the game as 2D array after updating
		{
		boolean[][] nextLife = new boolean[simulationSize.width][simulationSize.height];
		
		for (int y=0;y<simulationSize.width;y++)
			{
			for (int x=0;x<simulationSize.width;x++)
				{
				boolean alive = life[x][y];
				int surr = getSurrounding(new Point(x,y));
				if (surr < 2)
					{
					alive = false;
					}
				if (surr > 3)
					{
					alive = false;
					}
				if (surr == 3)
					{
					alive = true;
					}
				nextLife[x][y] = alive;
				}
			}
		
		life = nextLife;
		return life;
		}
	private static int getSurrounding(Point p)
		{
		return 	get(p.x+1,p.y-1)+get(p.x+1,p.y)+get(p.x+1,p.y+1)+
				get(p.x,p.y-1)+get(p.x,p.y+1)+
				get(p.x-1,p.y-1)+get(p.x-1,p.y)+get(p.x-1,p.y+1);
		}
	private static int get(int x, int y)
		{
		if ((x >= 0) && (y >= 0) && (x < simulationSize.width) && (y < simulationSize.height))
			{
			return life[x][y]?1:0;
			}
		return 0;
		}
	}
