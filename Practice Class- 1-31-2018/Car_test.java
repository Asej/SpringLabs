package springlab;
class Car_test{
	public static void main(String[] args) {
		Car car1 = new Car("BNW",123213.99,1999);
		System.out.println(car1.carBrand);
		Car car2 = new Car("Ford",15000,1992);
		Car car3 = new Car("TOyota",10000,2000);
		car2.carBrand="Niasain";
		System.out.println(car2.carBrand);
		}
}