package model;

public class Ticket {
    private String ticketNumber;
    private float ticketBasePrice;

    public Ticket() {
        super();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public float getTicketBasePrice() {
        return ticketBasePrice;
    }

    public void setTicketPrice(float ticketBasePrice) {
        this.ticketBasePrice = ticketBasePrice;
    }

    public float computeTicketPrice(float convenienceFee) {
        return ticketBasePrice * (1 + convenienceFee);
    }

}