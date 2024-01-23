package pl.javastart.task;

public class Gift extends Ticket {
    private static final  int LOGISTIC_COST = 5;

    public Gift(String nameOfEvent, Adress adress, String typeOfTicket, double basicPrice, double discount, double numberOfTicket) {
        super(nameOfEvent, adress, typeOfTicket, basicPrice, discount, numberOfTicket);
    }

    @Override
    double finalPrice() {
        return (super.finalPrice());
    }

    @Override
    void printFinalPrice() {
        super.printFinalPrice();
        System.out.printf("%.1f " + "zl + " + "%d" + " zl +" + " (%.0f" + "%%" + " * " + "%.1f zl)" + " = " + "%.2f" + " zl", finalPrice(),
                LOGISTIC_COST, getDiscount(), finalPrice(), finalPrice() + 5 + ((getDiscount() * finalPrice()) / 100));
    }
}
