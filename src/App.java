import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3a.
		
		DecimalFormat f= new DecimalFormat("$0.00");
		double itemPrice = 5;
		double costOfItem = 5;
		
		
		//3b.
		
		double cashInWallet = 10;
		double moneyInWallet = 10;
		
		
		//3c.
		
		int numberOfFriends = 6;
		int totalFriends = 6;
		
		
		//3d.
		
		int ageInYears = 40;
		int currentAge = 40;
		
		
		//3e.
		
		String firstName = "Star";
		String initialName = "Star";
		
		
		//3f.
		
		String lastName = "Shine";
		String endName = "Shine";
		
		
		//3g.
		
		String middleInitial ="Y";
		String midInitial = "Y";
		
		
		//4a
		
		
		double totalMoney = moneyInWallet - itemPrice;		
		double allMoney = cashInWallet - costOfItem;
		
		
		//4b.
		
		double medianOfFriends = (double) totalFriends / (double) currentAge;
		double averageOfFriends = (double) numberOfFriends / (double) ageInYears;
				
				
		//4c
		
		String fullName = firstName + middleInitial + lastName;
		String wholeName = initialName + midInitial + endName;
		
		// Number 5.
		
		System.out.println("Cost of item:" + " " + f.format(itemPrice));
		System.out.println("Cost of Item:" + " " + f.format(costOfItem));
		System.out.println("Cash in purse:" + " " + f.format(cashInWallet));
		System.out.println("Cash in purse:" + " " + f.format(moneyInWallet));
		System.out.println("How many friends" + " " + numberOfFriends);
		System.out.println("How many friends" + " " + totalFriends);
		System.out.println("Average age in years:" + " " + ageInYears);
		System.out.println("Average age in years:" + " " + currentAge);
		System.out.println("First Name:" + " " + firstName);
		System.out.println("First Name:" + " " + initialName);
		System.out.println("Last Name:" + " " + lastName);
		System.out.println("Last Name:" + " " + endName);
		System.out.println("Middle Initial:" + " " + middleInitial);
		System.out.println("Middle Initial:" + " " + midInitial);
		System.out.println("Current Cash:" + " " + f.format(totalMoney));
		System.out.println("Current Cash:" + " " + f.format(allMoney));
		System.out.println("Average age of friends per year:" + " " + medianOfFriends);
		System.out.println("Average age of friends per year:" + " " + averageOfFriends);
		System.out.println("Whole Name:" + " " + fullName);
		System.out.println("Whole Name:" + " " + wholeName);
		
		}

}
