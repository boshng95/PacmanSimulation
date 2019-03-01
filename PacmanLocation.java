
public class PacmanLocation {
	private int pacmanX = 0;
	private int pacmanY = 0;
	private int pacmanF = 0; //1-North, 2-South, 3-East, 4-West
	
	public PacmanLocation(int pacmanX, int pacmanY, int pacmanF) {
		this.pacmanX = pacmanX;
		this.pacmanY = pacmanY;
		this.pacmanF = pacmanF;
	}
	
	public void setPacmanX(int pacmanX) {
		this.pacmanX = pacmanX;
	}
	
	public int getPacmanX() {
		return pacmanX;
	}
	
	public void setPacmanY(int pacmanY) {
		this.pacmanY = pacmanY;
	}
	
	public int getPacmanY() {
		return pacmanY;
	}
	
	public void setPacmanF(int pacmanF) {
		this.pacmanF = pacmanF;
	}
	
	public int getPacmanF() {
		return pacmanF;
	}
	
	public String getPacmanD() {
		String direction = "";
		switch(pacmanF) {
		case 1: direction = "NORTH"; break;
		case 2: direction = "SOUTH"; break;
		case 3: direction = "EAST"; break;
		case 4: direction = "WEST"; break;
		}
		return direction;
	}
	
	public String toString() {
		return "Pacman X: " + pacmanX +"\n" +
				"Pacman Y: " + pacmanY +"\n" +
				"Pacman Face: " + getPacmanD();
	}
}
