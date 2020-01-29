// Hello World - Review.java
	public class Review {
		public static void main(String[] args) {
			// Main Method Executes Tasks of Class
			System.out.println("My first Java program from scratch!");
		}
	}

// Variables - MyProfile.java
	public class MyProfile {
		public static void main(String[] args) {
			String name = "Serena Scalzi";
			int age = 38;
			double desiredSalary = 75000.00;
			char gender = 'f';
			boolean lookingForJob = true;
		}
	}

// Manipulating Variables - BankAccount.java
	public class BankAccount {
		public static void main(String[] args){
			double balance = 1000.75;
			double amountToWithdraw = 250;
			double updatedBalance = balance - amountToWithdraw;
			double amountForEachFriend = updatedBalance / 3;
			boolean canPurchaseTicket = amountForEachFriend >= 250;
			System.out.println(canPurchaseTicket);
			System.out.println("I gave each friend " + amountForEachFriend + "...");
		}
	}

// Introduction to Classes - Dog.java
	public class Dog {
		String breed;
		boolean hasOwner;
		int age;

		public Dog(String dogBreed, boolean dogOwned, int dogYears) {
			System.out.println("Constructor invoked!");
			breed = dogBreed;
			hasOwner = dogOwned;
			age = dogYears;
		}

		public static void main(String[] args) {
			System.out.println("Main method started");
			Dog fido = new Dog("poodle", false, 4);
			Dog nunzio = new Dog("shiba inu", true, 12);
			boolean isFidoOlder = fido.age > nunzio.age;
			int totalDogYears = nunzio.age + fido.age;
			System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
			System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
			System.out.println("The total age of the dogs is: " + totalDogYears);
			System.out.println("Main method finished");
		}
	}

// Methods - SavingsAccount.java
	public class SavingsAccount {
		int balance;

		public SavingsAccount(int initialBalance){
			balance = initialBalance;
		}

		public void checkBalance() {
			System.out.println("Hello!");
			System.out.println("Your balance is " + balance);
		}

		public void deposit(int amountToDeposit) {
			int afterDeposit = balance + amountToDeposit;
			balance = afterDeposit;
			System.out.println("You just deposited " + amountToDeposit);
		}

		public int withdraw(int amountToWithdraw) {
			int afterWithdraw = balance - amountToWithdraw;
			balance = afterWithdraw;
			System.out.println("You just withdrew " + amountToWithdraw);
			return amountToWithdraw;
		}

		public static void main(String[] args){
			SavingsAccount savings = new SavingsAccount(2000);

			savings.checkBalance();	// Check Balance

			savings.withdraw(300);	// Withdraw 300

			savings.checkBalance();	// Check Balance

			savings.deposit(600);	// Deposit 600

			savings.checkBalance();	// Check Balance

			savings.deposit(600);	// Deposit 600

			savings.checkBalance();	// Check Balance
		}
	}

// Conditionals and Control Flow - Order.java
	public class Order {
		boolean isFilled;
		double billAmount;
		String shipping;

		public Order(boolean filled, double cost, String shippingMethod) {
			if (cost > 24.00) {
				System.out.println("High value item!");
			} else {
				System.out.println("Low value item!");
			}
			isFilled = filled;
			billAmount = cost;
			shipping = shippingMethod;
		}

		public void ship() {
			if (isFilled) {
				System.out.println("Shipping");
			} else {
				System.out.println("Order not ready");
			}

			double shippingCost = calculateShipping();

			System.out.println("Shipping cost: ");
			System.out.println(shippingCost);
		}

		public double calculateShipping() {
			double shippingCost;
			switch (shipping) {
				case "Regular":
					shippingCost = 0;
					break;
				case "Express":
					shippingCost = 1.75;
					break;
				default:
					shippingCost = .50; 
			}
			return shippingCost;
		}

		public static void main(String[] args) {
			// Create Instances & Call Methods
			System.out.println("ORDER #1:");
			Order order1 = new Order(true, 25.00, "Regular");
			order1.ship();
			order1.calculateShipping();

			System.out.println("ORDER #2:");
			Order order2 = new Order(false, 23.00, "Express");
			order2.ship();
			order2.calculateShipping();

			System.out.println("ORDER #3:");
			Order order3 = new Order(true, 24.00, "Overnight");
			order3.ship();
			order3.calculateShipping();
		}
	}

// Conditional Operators - Reservation.java
	public class Reservation {
		int guestCount;
		int restaurantCapacity;
		boolean isRestaurantOpen;
		boolean isConfirmed;

		public Reservation(int count, int capacity, boolean open) {
			if (count < 1 || count > 8) {
				System.out.println("Invalid reservation!");
			}
			guestCount = count;
			restaurantCapacity = capacity;
			isRestaurantOpen = open;
		}

		public void confirmReservation() {
			if (restaurantCapacity >= guestCount && isRestaurantOpen) {
				System.out.println("Reservation confirmed");
				isConfirmed = true;
			} else {
				System.out.println("Reservation denied");
				isConfirmed = false;
			}
		}

		public void informUser() {
			if (!isConfirmed) {
				System.out.println("Unable to confirm reservation, please contact restaurant.");
			} else {
				System.out.println("Please enjoy your meal!");
			}
		}

		public static void main(String[] args) {
			// Create Instances & Call Methods
			System.out.println("RESERVATION #1:");
			Reservation reservation1 = new Reservation(10, 20, true);

			System.out.println("RESERVATION #2:");
			Reservation reservation2 = new Reservation(4, 20, true);
			reservation2.confirmReservation();
			reservation2.informUser();

			System.out.println("RESERVATION #3:");
			Reservation reservation3 = new Reservation(8, 4, false);
			reservation3.confirmReservation();
			reservation3.informUser();
		}
	}

// Arrays - Classroom.java
	import java.util.Arrays;

	public class Classroom {
		public static void main(String[] args){
			String[] students = {"Sade", "Alexus", "Sam", "Koma"};
			double[] mathScores = new double[4];

			mathScores[0] = 94.5;
			mathScores[2] = 76.8;

			System.out.println("The number of students in the class is " + students.length + ".");
		}
	}

// ArrayLists - List.java
	import java.util.ArrayList;

	public class List {
		public static void main(String[] args) {
			// Create ArrayList
			ArrayList<String> taskList = new ArrayList<String>();

			// Add New Items
			String task1 = "Task 1";
			String task2 = "Task 2";
			String task3 = "Task 3";
			taskList.add(task1);
			taskList.add(task2);
			taskList.add(task3);
			System.out.println("Task List: " + taskList);

			// Access Size
			System.out.println("List Size: " + taskList.size());

			// Find Item by Index
			System.out.println("Item Index 2: " + taskList.get(2));

			// Change Value of Item
			taskList.set(2, "Third Task");
			System.out.println("Task List: " + taskList.toString());

			// Remove Item with Specific Value
			taskList.remove("Third Task"); // or 2
			System.out.println("Task List: " + taskList.toString());

			// Retrieve Index of Item with Specific Value
			System.out.println("Task 1 Index: " + taskList.indexOf("Task 1"));
		}
	}

// Loops
	// LuckyFive.java
	import java.util.Random;

	public class LuckyFive {
		public static void main(String[] args) {
			// Create Random Number Generator
			Random randomGenerator = new Random();

			// Generate Number Between 1 & 6
			int dieRoll = randomGenerator.nextInt(6) + 1;

			// Repeat While Roll Isn't 5
			while (dieRoll != 5) {
				System.out.println("Die Roll: " + dieRoll);
				dieRoll = randomGenerator.nextInt(6) + 1;
			}
		}
	}

	// Coffee.java
	public class Coffee {
		public static void main(String[] args) {
			// Initialize cupsOfCoffee
			int cupsOfCoffee = 1;

			// Add While Loop
			while (cupsOfCoffee <= 10) {
				System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
				cupsOfCoffee++;
			}

			// Add For Loop
			for (int i = 1; i <= 10; i++) {
				System.out.println("Fry drinks cup of coffee #" + i);
			}
		}
	}

	// ExpenseReport.java
	import java.util.ArrayList;

	public class ExpenseReport {
		public static void main(String[] args) {
			ArrayList<Double> expenses = new ArrayList<Double>();
			expenses.add(74.46);
			expenses.add(63.99);
			expenses.add(10.57);
			expenses.add(81.37);

			double total = 0;

			// Iterate Over Expenses
			for (int i = 0; i < expenses.size(); i++) {
				double value = expenses.get(i);
				total = total + value;
			}

			System.out.println("Total Expenses: " + total);

			double mostExpensive = 0;

			// Iterate Over Expenses - Add For-Each Loop
			for (double expense : expenses) {
				if (expense > mostExpensive) {
					mostExpensive = expense;
				}
			}

			System.out.println("Most Expensive: " + mostExpensive);
		}
	}

// String Methods - Names.java
	public class Names {
		public static void main(String[] args) {
			String firstName = "Serena ";
			String lastName = "Scalzi";

			System.out.println("First Name Length: " + firstName.length());
			
			System.out.println("Full Name: " + firstName.concat(lastName));
			
			System.out.println("Space Index: " + firstName.indexOf(" "));
			
			System.out.println("First Name Initial: " + firstName.charAt(0));
			
			System.out.println("First Name SERENA: " + firstName.equalsIgnoreCase("SERENA "));
			
			System.out.println("Last Name Allen: " + lastName.equals("Allen"));
			
			System.out.println("Nickname: " + lastName.substring(0, 5));
			
			System.out.println("Last Name Lowercase: " + lastName.toLowerCase());
			
			System.out.println("Last Name Uppercase: " + lastName.toUpperCase());
		}
	}

// Inheritance and Polymorphism
	// Noodle.java
	public class Noodle {
		protected double lengthInCentimeters;
		protected double widthInCentimeters;
		protected String shape;
		protected String ingredients;
		protected String description;
		protected String texture = "brittle";

		Noodle(double lenInCent, double wthInCent, String shp, String ingr, String desc) {
			this.lengthInCentimeters = lenInCent;
			this.widthInCentimeters = wthInCent;
			this.shape = shp;
			this.ingredients = ingr;
			this.description = desc;
		}

		public String getCookPrep() {
			return "Boil noodle for 7 minutes and add sauce.";
		}

		public static void main(String[] args) {
			Noodle spaghetti, ramen, pho;
			spaghetti = new Spaghetti();
			ramen = new Ramen();
			pho = new Pho();

			Noodle[] allTheNoodles = {spaghetti, ramen, pho};

			for (Noodle eachNoodle : allTheNoodles) {
				System.out.println("Cook Prep for " + eachNoodle.description + ": " + eachNoodle.getCookPrep());
			}
		}
	}

	// Spaghetti.java
	class Spaghetti extends Noodle {
		Spaghetti() {
			super(30.0, 0.2, "round", "semolina flour", "Spaghetti");
		}

		@Override
		public String getCookPrep() {
			return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
		}
	}

	// Ramen.java
	class Ramen extends Noodle {
		Ramen() {
			super(30.0, 0.3, "flat", "wheat flour", "Ramen");
		}

		@Override
		public String getCookPrep() {
			return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
		}
	}

	// Pho.java
	class Pho extends Noodle {
		Pho() {
			super(30.0, 0.64, "flat", "rice flour", "Pho");
		}

		@Override
		public String getCookPrep() {
			return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
		}
	}

// Debugging