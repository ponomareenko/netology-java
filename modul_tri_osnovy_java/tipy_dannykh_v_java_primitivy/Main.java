import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения\n");

            String input = scanner.nextLine();
            System.out.println();

            if (input.equals("end")) {
                break;
            }

            // Выбор операции
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.print("Введите сумму дохода: ");
                    String mony1Str = scanner.nextLine();
                    int money1 = Integer.parseInt(mony1Str);
                    earnings += money1;
                    break;
                case 2:
                    System.out.print("Введите сумму расходов: ");
                    String mony2Str = scanner.nextLine();
                    int money2 = Integer.parseInt(mony2Str);
                    spendings += money2;
                    break;
                case 3:
                    int taxEarningsMinusSpendings = taxEarningsMinusSpendings(earnings,spendings);
                    int taxEarningsSix = taxEarningsSix(earnings);

                    int taxMin = (taxEarningsMinusSpendings < taxEarningsSix) ? taxEarningsMinusSpendings : taxEarningsSix;
                    int taxMax = (taxEarningsMinusSpendings > taxEarningsSix) ? taxEarningsMinusSpendings : taxEarningsSix;

                    if (taxEarningsMinusSpendings < taxEarningsSix) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                    } else if (taxEarningsMinusSpendings > taxEarningsSix) {
                        System.out.println("Мы советуем вам УСН доходы");
                    } else {
                        System.out.println("Можете выбрать любую систему налогообложения");
                    }

                    System.out.println("Ваш налог составит: " + taxMin + " рублей");
                    System.out.println("Налог на другой системе: " + taxMax + " рублей");
                    System.out.println("Экономия: " + (taxMax - taxMin) + " рублей");

                    break;
                default:
                    System.out.println("Такой операции нет");
            }
            System.out.println();
        }

        System.out.println("Программа завершена!");
    }

    // УСН доходы минус расходы - налог 15% от разницы доходов и расходов.
    public static int taxEarningsMinusSpendings(int eartings, int spendings) {
        int tax = (eartings - spendings) * 15 / 100;
//        System.out.println("Вызов метода - доходы минус расходы");
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }

    // УСН доходы - налог 6% от доходов;
    public static int taxEarningsSix(int eartings) {
        int tax = eartings * 6 / 100;
//        System.out.println("Вызов метода - 6% от доходов");
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
