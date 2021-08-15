public class Bat extends Mammal{

	public Bat() {
		super(300);
	}
	public void fly() {
		System.out.println("hello, you can call me bat");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("it's time to eat humans");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("im attacking a town, will be soon");
		this.energyLevel -= 100;
	}
	

}