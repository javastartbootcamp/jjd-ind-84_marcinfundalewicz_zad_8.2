package pl.javastart.task;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Adress adress = new Adress("Krakow", "Urzednicza", 20);
        Ticket ticket1 = new Online("Koncert", adress, "Bilet online", 100, 5, 1);
        Ticket ticket2 = new Standard("Koncert", adress, "Bilet standard", 100, 5, 1);
        Ticket ticket3 = new Gift("Koncert", adress, "Bilet gift", 100, 5, 1);

        Scanner scanner = new Scanner(System.in);
        int counter;
        do {
            System.out.println("Jaki bilet na koncert chcesz kupic ?");
            System.out.println("Wpisz 1 jezeli chcesz kupic bilet online");
            System.out.println("Wpisz 2 jezeli chcesz kupic bilet standard");
            System.out.println("Wpisz 3 jezeli chcesz kupic bilet gift");
            counter = scanner.nextInt();

            if (counter == 1) {
                ticket1.printFinalPrice();
            } else if (counter == 2) {
                ticket2.printFinalPrice();
            } else if (counter == 3) {
                ticket3.printFinalPrice();
            }
        } while (counter == 0);
    }
}
