package model;

public class TicketVIP extends Ticket {
    private String ticketAttribute;

    public TicketVIP() {
        super();
    }

    public String getTicketAttribute() {
        return ticketAttribute;
    }

    public void setTicketAttribute(String ticketAttribute) {
        this.ticketAttribute = ticketAttribute;
    }

    @Override
    public float computeTicketPrice(float convenienceFee) {
        return getTicketBasePrice() * (1 + convenienceFee + 0.18f);
    }
}
