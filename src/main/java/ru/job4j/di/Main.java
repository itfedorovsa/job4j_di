package ru.job4j.di;

/**
 * Demonstration class of a context implementation
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 01.03.23
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(ConsoleInput.class);
        StartUI ui = context.get(StartUI.class);
        ui.add("John Smith");
        ui.add("Jade Murray");
        ui.print();
    }

}
