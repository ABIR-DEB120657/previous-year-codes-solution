class Account {
    double balance;
    Account(double balance) {
        this.balance = balance;
    }double calinterest() {
        return 0;
    }
}
    class sgaccount extends Account {
        sgaccount(double balance) {
            super(balance);
        }

        @Override
        double calinterest() {
            return balance * 0.4;//4% interest
        }
    }
        class fixdeposit extends Account {
            fixdeposit(double balance){
                super(balance);
            }
            @Override
            double calinterest() {
                return balance * 0.6;//6% interest
            }
        }
public class bankingsystem {
    public static void main(String[] args) {
        Account a1 = new sgaccount(10000);
        Account a2 = new fixdeposit(5000);
        System.out.println("saving account money = "+a1.calinterest());
        System.out.println("fixed account money ="+a2.calinterest());


    }
}
