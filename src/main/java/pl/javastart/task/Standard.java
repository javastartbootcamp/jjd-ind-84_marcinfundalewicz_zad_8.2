package pl.javastart.task;

public class Standard extends Ticket {
    private static final  int LOGISTIC_COST = 5;

    public Standard(String nameOfEvent, Adress adress, String typeOfTicket, double basicPrice, double discount) {
        super(nameOfEvent, adress, typeOfTicket, basicPrice, discount);
    }

    @Override
    double finalPrice() {
        return super.finalPrice() + 5;
    }

    @Override
    void printFinalPrice() {
        super.printFinalPrice();
        System.out.println(finalPrice() - LOGISTIC_COST + " zl + 5 zl = " + finalPrice() + " zl");
    }
}
