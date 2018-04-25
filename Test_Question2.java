package springlab.SpringLabs;

public class Test_Question2 {

	public static void main(String[] args) {
	Beverage Drink_1 = new Beverage("Pepsi",120.0,1.99);
	Beverage Drink_2 = new Beverage("Coke",130.0,1.50);
	Beverage Drink_3 = new Beverage("Dr.Pepper",100.0,1.00);
	System.out.println("Name : "+Drink_1.name+"\n Cal: "+Drink_1.calories+"\n Cost: $"+ Drink_1.cost);
	System.out.println("Name : "+Drink_2.name+"\n Cal: "+Drink_2.calories+"\n Cost: $"+ Drink_2.cost);
	System.out.println("Name : "+Drink_3.name+"\n Cal: "+Drink_3.calories+"\n Cnost: $"+ Drink_3.cost);


	}

}
