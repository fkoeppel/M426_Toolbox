package Toolbox;

import java.util.ArrayList;

public class CoordinatesVisualizer {
	
	public String[][] get2DimensionalGrid(ArrayList<Koordinate> koordinaten) {
		int highestX = 0;
		int highestY = 0;
		int lowestX = 0;
		int lowestY = 0;
		
		for (Koordinate koordinate : koordinaten) {
			if(koordinate.X > highestX) {
				highestX = koordinate.X;
			}
			if(koordinate.Y > highestY) {
				highestY = koordinate.Y;
			}
			if(koordinate.X < lowestX) {
				lowestX = koordinate.X;
			}
			if(koordinate.Y < lowestY) {
				lowestY = koordinate.Y;
			}
		}
		
		if(lowestX < 0) {
			lowestX = lowestX * -1;
		}
		if(lowestY < 0) {
			lowestY = lowestY * -1;
		}
		
		int xHeight = highestX + lowestX + 1;
		int yHeight = highestY + lowestY + 1;
		String[][] grid = new String[xHeight][yHeight];
		
		for (Koordinate koordinate : koordinaten) {
			int newX = 0;
			int newY = 0;
			
			if (koordinate.X < 0) {
				newX = lowestX - koordinate.X * -1;
			}
			if (koordinate.X >= 0) {
				newX = lowestX + koordinate.X;
			}
			
			if (koordinate.Y < 0) {
				newY = highestY + koordinate.Y * -1;
			}
			if (koordinate.Y >= 0) {
				newY = highestY - koordinate.Y;
			}
			
			grid[newX][newY] = koordinate.X + "/" + koordinate.Y;
		}
		
		return grid;
	}

	public String getStringVisualisation(ArrayList<Koordinate> koordinaten) {
		int highestX = 0;
		int highestY = 0;
		int lowestX = 0;
		int lowestY = 0;
		
		for (Koordinate koordinate : koordinaten) {
			if(koordinate.X > highestX) {
				highestX = koordinate.X;
			}
			if(koordinate.Y > highestY) {
				highestY = koordinate.Y;
			}
			if(koordinate.X < lowestX) {
				lowestX = koordinate.X;
			}
			if(koordinate.Y < lowestY) {
				lowestY = koordinate.Y;
			}
		}
		
		if(lowestX < 0) {
			lowestX = lowestX * -1;
		}
		if(lowestY < 0) {
			lowestY = lowestY * -1;
		}
	
	int xHeight = highestX + lowestX + 1;
	int yHeight = highestY + lowestY + 1;
	String[][] grid = new String[xHeight][yHeight];
	
	for (Koordinate koordinate : koordinaten) {
		int newX = 0;
		int newY = 0;
		
		if (koordinate.X < 0) {
			newX = lowestX - koordinate.X * -1;
		}
		if (koordinate.X >= 0) {
			newX = lowestX + koordinate.X;
		}
		
		if (koordinate.Y < 0) {
			newY = highestY + koordinate.Y * -1;
		}
		if (koordinate.Y >= 0) {
			newY = highestY - koordinate.Y;
		}
		
		grid[newX][newY] = koordinate.X + "/" + koordinate.Y;
	}
	
		int grid1Length =  grid.length;
		int grid0Length =  grid[0].length;
		
		for (int i = 0; i < grid0Length; i++) {
			for (int j = 0; j < grid1Length; j++) {
				if(grid[j][i] == null || grid[j][i] == "") {
					grid[j][i] = "";
				}
			}
		}
		
		String result = "";
		for (int i = 0; i < grid0Length; i++) {
			for (int j = 0; j < grid1Length; j++) {
				String block = "|";
				block += grid[j][i];
				if(j == lowestX) {
					block += "$";
				}
				if(i == highestY) {
					block += "$";
				}
				while (block.length() <= 6) {
					block += " ";					
				}
				result += block;
			}
			result += "|\n";
		}
		return result;
	}
}
