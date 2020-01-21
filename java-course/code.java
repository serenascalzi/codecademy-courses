// Hello World - Review.java
	public class Review {
		public static void main(String[] args) {
			// The main method executes the tasks of the class
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

// Conditionals and Control Flow

// Conditional Operators

// Arrays

// ArrayLists

// Loops

// String Methods

// Inheritance and Polymorphism

// Debugging