public class main {
    public static void main(String[] args) {

        int payment = 1100;             // Сумма пополнения
        int balance = 100;              // Имеющиеся на счету средства

        if (payment >= 1000) {
            System.out.println(balance + payment + (payment / balance) + " рублей (-я) на счету");
            System.out.println((payment / balance) + " бонусных рублей");
        } else {
            System.out.println(balance + payment + " рублей (-я) на счету");
        }
    }
}