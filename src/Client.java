import kuchner.homework.finance.Bank;

public class Client {
    public String name;
    public int age;
    public int salary;

    public int calcSavings(Bank bank, int years) {

        int amount = 0;
        for (int i = 0; i < years; i++) {
            amount += this.salary * 0.1;
            amount += (int) (amount * bank.calcRate(amount, years) / 100);

        }

        return amount;
    }

}

