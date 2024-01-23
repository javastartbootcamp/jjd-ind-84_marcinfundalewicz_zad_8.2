package pl.javastart.task;

public class Ticket {
    private String nameOfEvent;
    private Adress adress;
    private String typeOfTicket;
    private double basicPrice;
    private double discount;
    private double numberOfTicket;

    public Ticket(String nameOfEvent, Adress adress, String typeOfTicket, double basicPrice, double discount, double numberOfTicket) {
        this.nameOfEvent = nameOfEvent;
        this.adress = adress;
        this.typeOfTicket = typeOfTicket;
        this.basicPrice = basicPrice;
        this.discount = discount;
        this.numberOfTicket = numberOfTicket;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getTypeOfTicket() {
        return typeOfTicket;
    }

    public void setTypeOfTicket(String typeOfTicket) {
        this.typeOfTicket = typeOfTicket;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(double numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    double finalPrice() {
        return basicPrice - (discount / 100 * basicPrice);
    }

    void printFinalPrice() {
        System.out.print(typeOfTicket + ": " + "cena podstawowa " + basicPrice + " zl," + " znizka " + discount + " %, cena finalna wyniesie ");
    }
}


