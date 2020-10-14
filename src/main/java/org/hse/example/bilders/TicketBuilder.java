package org.hse.example.bilders;


import org.hse.example.MealTicket;
import org.hse.example.Ticket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * сервис строитель экземпляров (@link org.hse.example.MealTicket
 */

@Service("ticketBuilder")
@Scope("prototype")
public class TicketBuilder implements MealTicketBuilders{
    private Long ticket;

    /**

     */
    private boolean used = false;

    public MealTicket build() {
        if(used) {
            throw new IllegalStateException();
        }
        used = true;
        return new Ticket(ticket);

    }
    @Override
    public MealTicketBuilders ticket(long ticket) {
        this.ticket = ticket;
        return this;

    }
}
