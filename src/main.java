public class main {
    public static void main(String[] args) {

        int m = 1100;     // Сумма пополнения
        int n = 100;     // Имеющиеся на счету средства

        if (m >= 1000) {
            System.out.println(n + m + (m / n) + " рублей (-я) на счету");
            System.out.println((m / n) + " бонусных рублей");
        } else {
            System.out.println(n + m + " рублей (-я) на счету");
        }
    }
}