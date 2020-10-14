package org.hse.example.bilders;

import org.hse.example.MealTicket;

public interface MealTicketBuilders {
    /**
     *
     * @return (@link MealTicket)
     */
    MealTicket build();

    /**
     *
     * @param ticket
     */
    void ticket (long ticket);
}
