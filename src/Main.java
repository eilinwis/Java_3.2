public class Main<total> {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 7000;
        int bonus = refill <= 1000 ? 0 : refill / 100;

        long total = balance + refill + bonus;
        System.out.println(total);
    }
}