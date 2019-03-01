import java.util.Arrays;

public class PacmanMap {
	private int[][] dimension = new int[5][5];
	private PacmanLocation p1 = new PacmanLocation(0,0,0);
	
	public void SetPacmanStart(int x, int y, int F) {
		p1.setPacmanY(y);
		p1.setPacmanX(x);
		p1.setPacmanF(F);
		dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
	}
	
	public void getDimension() {
		for(int[] row :dimension) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public void userInput(String input) {
		input = input.toUpperCase();
		int direction = p1.getPacmanF();
			switch(input) {
			case "L":
				System.out.println("LEFT");
				if(direction==1) {
					p1.setPacmanF(4);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				else if(direction==2) {
					p1.setPacmanF(3);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				else if(direction==3) {
					p1.setPacmanF(1);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				else if(direction==4) {
					p1.setPacmanF(2);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				break;
			case "R":
				System.out.println("RIGHT");
				if(direction==1) {
					p1.setPacmanF(3);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				else if(direction==2) {
					p1.setPacmanF(4);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				else if(direction==3) {
					p1.setPacmanF(2);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				else if(direction==4) {
					p1.setPacmanF(1);
					dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				}
				break;
			case "M":
				System.out.println("MOVE");
				movePacman(input);break;
			case "P":
				System.out.println("REPORT");
				System.out.println(p1.toString());break;
			case "Q":
				System.out.println("Thanks for Playing");
				System.exit(0);
			}
	}
	
	public void movePacman(String action) {
		try {
			
			switch(p1.getPacmanF()) {
			case 1:
				dimension[p1.getPacmanY()][p1.getPacmanX()] = 0;
				p1.setPacmanY(p1.getPacmanY()-1);
				p1.setPacmanX(p1.getPacmanX());
				dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				break;
			case 2:
				dimension[p1.getPacmanY()][p1.getPacmanX()] = 0;
				p1.setPacmanY(p1.getPacmanY()+1);
				p1.setPacmanX(p1.getPacmanX());
				dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				break;
			case 3:
				dimension[p1.getPacmanY()][p1.getPacmanX()] = 0;
				p1.setPacmanY(p1.getPacmanY());
				p1.setPacmanX(p1.getPacmanX()+1);
				dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				break;
			case 4:
				dimension[p1.getPacmanY()][p1.getPacmanX()] = 0;
				p1.setPacmanY(p1.getPacmanY());
				p1.setPacmanX(p1.getPacmanX()-1);
				dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
				break;
			}
		}
		catch(IndexOutOfBoundsException e) {
			
			if(p1.getPacmanX()==-1) {
				p1.setPacmanX(0);
			}
			else if(p1.getPacmanY()==-1) {
				p1.setPacmanY(0);
			}
			else if(p1.getPacmanX()==5) {
				p1.setPacmanX(4);
			}
			else if(p1.getPacmanY()==5) {
				p1.setPacmanY(4);
			}
			System.out.println(p1.toString());
			dimension[p1.getPacmanY()][p1.getPacmanX()] = p1.getPacmanF();
			
		}
	}
	
	public String printDirection() {
		return p1.getPacmanD();
	}
}
