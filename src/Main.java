public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("current job : %d, Printed total: %d %n", pagesPrinted, printer.getPagesPrinted());


        pagesPrinted = printer.printPages(50);
        System.out.printf("current job : %d, Printed total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(15);
        System.out.printf("current job : %d, Printed total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(5);
        System.out.printf("current job : %d, Printed total: %d %n", pagesPrinted, printer.getPagesPrinted());



    }
}
