public class Main {
    public static void main(String[] args) {
        Human maxim = new Human( "Максим", 1995,"Moskow", "бренд-менеджер");
        Human ann = new Human("Аня", 1993, "Москва", " методист образовательных программ");
        Human kata = new Human("Катя", 1994, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        maxim.printHuman();
        ann.printHuman();
        kata.printHuman();
        artem.printHuman();

    }
}