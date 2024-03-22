package view;

import model.Ticket;
import model.TicketVIP;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setTicketNumber("001");
        ticket.setTicketPrice(25.00f);

        TicketVIP ticketvp = new TicketVIP();
        ticketvp.setTicketNumber("002");
        ticketvp.setTicketPrice(25.00f);
        ticketvp.setTicketAttribute("{Open Bar, Backstage Access}");

        float convenienceFee = 0.10f;

        System.out.printf("Id: %s\nTotal: %.2f\n", ticket.getTicketNumber(),
                ticket.computeTicketPrice(convenienceFee));

                System.out.println("---------------");

        System.out.printf("Id: %s\nTotal: %.2f\nDescription: %s\n", ticketvp.getTicketNumber(),
                ticketvp.computeTicketPrice(convenienceFee), ticketvp.getTicketAttribute());
    }
}
