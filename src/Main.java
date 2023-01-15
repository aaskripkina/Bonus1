public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int payment = 1500;

        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int finalBalance = payment + bonus + currentBalance;

        System.out.println("Количество бонусных рублей " + bonus);
        System.out.println("Итоговый счет " + finalBalance);
    }
}