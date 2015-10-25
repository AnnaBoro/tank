package tank;

public class RunTank {

	public static void main(String[] args) {
		
		RunTank runTank = new RunTank();
		runTank.printTankInfo();
	}
	
	void printTankInfo() {
		
		Tank tank = new Tank();
		System.out.println("Tank color is " + tank.color);
		System.out.println("Tank crew is " + tank.crew);
		System.out.println("Tank maxSpeed is " + tank.maxSpeed);
	}
}
