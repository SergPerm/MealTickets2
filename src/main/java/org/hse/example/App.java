package org.hse.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
import java.util.function.Supplier;

/**
 * Приложение для работы со счастливым
 */
public class App {
    /**
     * Счётчик счастливых билетов
     */
    private static long count = 0; // для грязного хака с лямблами

    /**
     * Основной метод. Вычисляет количество счастливых билетов
     *
     * @param args аргументы
     */
    public static void main(String... args) {
        //Реализуем служеюный Iterable
        //todo подменить генератор на тот, что для билетов из 4-х цифр
        //todo универсальный генератор + фабрика билетов (с Function)
//        Iterator<MealTicket> generator = new SmallTicketGenerator();
//        Iterator<MealTicket> generator = new TicketsGenerator();
        ApplicationContext context = new AnnotationConfigApplicationContext("org.hse.example");
        Supplier<Long> mealTicketCounter = context.getBean("mealTicketCounter", Supplier.class);
//        Iterator<MealTicket> generator = context.getBean("smallTicketGenerator", Iterator.class);
////        Iterator<MealTicket> generator = context.getBean("ticketsGenerator", Iterator.class);
//
//        generator.forEachRemaining(
//                ticket -> {
//                    if (!ticket.isMealTicket()) {
//                        return;
//                    }
//                    count++;
//                    System.out.println(ticket.toString());
//                });
//        System.out.println("Счастливых билетов " + count);

        System.out.println("Счастливых билетов " + mealTicketCounter.get());
    }

}
