package iterator;

public class MainIter {
    public static void main(String args[]) {
        FactoryImpl factory = new FactoryImpl();
        factory.addChair(new Chair(true, true, 30, 40, "Modern"));
        factory.addChair(new Chair(true, true, 30, 40, "Modern"));
        factory.addChair(new Chair(true, true, 30, 40, "Modern"));
        factory.addChair(new Chair(true, true, 30, 40, "Modern"));
        factory.addChair(new Chair(false, true, 50, 35, "Empire"));
        factory.addChair(new Chair(false, true, 50, 35, "Empire"));
        factory.addChair(new Chair(false, true, 50, 35, "Empire"));

        Iterator moderIterator = factory.createIterator("Modern");
        System.out.println("Ітератор для модерн стільців");
        while (!moderIterator.isLastChair()) {
            System.out.println("Модерн стілець: "
                    + moderIterator.nextChair().toString());
        }

        System.out.println("\n");
        System.out.println("Ітератор для ампір стільців");

        Iterator empireIterator = factory.createIterator("Empire");
        while (!empireIterator.isLastChair()) {
            System.out.println("Ампір стілець: "
                    + empireIterator.nextChair().toString());
        }
    }
}
