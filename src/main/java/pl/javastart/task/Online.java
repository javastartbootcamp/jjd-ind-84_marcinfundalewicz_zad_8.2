package pl.javastart.task;

public class Online extends Ticket {
    public Online(String nameOfEvent, Adress adress, String typeOfTicket, double basicPrice, double discount) {
        super(nameOfEvent, adress, typeOfTicket, basicPrice, discount);
    }

    @Override
    double finalPrice() {
        return super.finalPrice();
    }

    @Override
    void printFinalPrice() {
        super.printFinalPrice();
        System.out.println(finalPrice() + " zl");
        System.out.println();
    }
}
