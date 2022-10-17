package human;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим","1987", "Минск", "Бренд-менеджер");
        maksim.story();

        Human anya = new Human("Аня", "1993", "Москва", "Методист образовательных программ");
        anya.story();

        Human katya = new Human("Катя","1994", "Калининград", "Продакт менеджер");
        katya.story();

        Human artem = new Human("Артем","1995", "Москва", "Директор по развитию бизнеса");
        artem.story();



    }

}
