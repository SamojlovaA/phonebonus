public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        int percent = 1;
        long amount;
        amount = 5000;
        long bonus = amount * percent / 100;
        long limit = 1000;
        if (amount < limit) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
