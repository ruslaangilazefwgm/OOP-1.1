public class Main {
    public static void main(String[] args) {
        Human maxim = new Human( "Максим", 1995,"Moskow", "бренд-менеджер");
        Human ann = new Human("Аня", 1993, "Москва", " методист образовательных программ");
        Human kata = new Human("Катя", 1994, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 2021, "Казань", null);

        maxim.printHuman();
        ann.printHuman();
        kata.printHuman();
        artem.printHuman();
        vladimir.printHuman();
        System.out.println();

        Flower roza = new Flower("Роза обыкновенная", null,
                                "Голландия", 35.59, 0);
        Flower xriz = new Flower("Хризантема", null,
                null, 15, 5);
        Flower pion = new Flower("Пион", null,
                "Англия", 69.9, 1);
        Flower gips = new Flower("Гипсофила", null,
                "Турция", 19.5, 10);

        roza.printFlower();
        xriz.printFlower();
        pion.printFlower();
        gips.printFlower();




    }
}