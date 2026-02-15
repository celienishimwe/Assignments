package PersonalAtm;

public class Main {
    public static void main(String[] args) {

        ATM myATM = new ATM(100.0);

        System.out.println("Initial Balance: " + myATM.checkBalance());

        myATM.deposit(50.0);

        myATM.withdraw(30.0);

        System.out.println("Final Balance: " + myATM.checkBalance());
    }
}