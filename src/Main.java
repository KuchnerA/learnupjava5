import kuchner.homework.finance.Bank;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Saver();
        client1.name = "Maxim";
        client1.age = 26;
        client1.salary = 30_000;

        Client client2 = new Splitter();
        client2.name = "Alex";
        client2.age = 35;
        client2.salary = 40_000;

        Bank bank = new Bank();

        compare(client1, client2, bank, 34);

    }

    public static void compare(Client client1, Client client2, Bank bank, int years) {

        int amount = client1.calcSavings(bank, 34) - client2.calcSavings(bank, 34);   //amount_RUB

        System.out.println("Разность сумм накоплений: " + amount + " RUB");
    }
}
