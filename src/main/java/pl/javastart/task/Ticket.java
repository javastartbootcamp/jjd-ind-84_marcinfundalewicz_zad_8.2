package pl.javastart.task;

public class Ticket {
    private String nameOfEvent;
    private Adress adress;
    private String typeOfTicket;
    private double basicPrice;
    private double discount;
    private int numberOfTicket;
    public static int uniqueNumber = 0;

    public Ticket(String nameOfEvent, Adress adress, String typeOfTicket, double basicPrice, double discount) {
        this.nameOfEvent = nameOfEvent;
        this.adress = adress;
        this.typeOfTicket = typeOfTicket;
        this.basicPrice = basicPrice;
        this.discount = discount;
        uniqueNumber++;
        this.numberOfTicket = uniqueNumber;

    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public static int getUniqueNumber() {
        return uniqueNumber;
    }

    public static void setUniqueNumber(int uniqueNumber) {
        Ticket.uniqueNumber = uniqueNumber;
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

    double finalPrice() {
        return basicPrice - (discount / 100 * basicPrice);
    }

    void printFinalPrice() {
        System.out.print("Unikalny numer biletu: " + numberOfTicket + " " + typeOfTicket + ": " + "cena podstawowa " + basicPrice + " zl," + " znizka " + discount + " %, cena finalna wyniesie ");
    }
}


