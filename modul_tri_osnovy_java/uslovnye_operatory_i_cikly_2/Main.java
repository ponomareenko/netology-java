import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = 0;

        while (true) {
            System.out.print("Введите год в формате yyyy: ");
            int year = scanner.nextInt();
            System.out.print("Введите количество дней: ");
            int days = scanner.nextInt();

            if (year % 400 == 0) {
                int rasDays = 366;
                if (days != rasDays) {
                    System.out.println("Неправильно! В этом году " + rasDays + " дней!");
                    System.out.println("Набрано очков: " + point);
                    break;
                }
            } else if (year % 4 == 0 && year % 100 != 0) {
                int rasDays = 366;
                if (days != rasDays) {
                    System.out.println("Неправильно! В этом году " + rasDays + " дней!");
                    System.out.println("Набрано очков: " + point);
                    break;
                }
            } else {
                int rasDays = 365;
                if (days != rasDays) {
                    System.out.println("Неправильно! В этом году " + rasDays + " дней!");
                    System.out.println("Набрано очков: " + point);
                    break;
                }
            }

            point++;
        }
    }
}
