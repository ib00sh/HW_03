import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Random random = new Random();

        phoneBook.add("Максим", String.valueOf(random.nextInt(10)));
        phoneBook.add("Максим", String.valueOf(random.nextInt(10)));
        phoneBook.add("Максим", String.valueOf(random.nextInt(10)));
        phoneBook.add("Витя", String.valueOf(random.nextInt(10)));
        phoneBook.add("Витя", String.valueOf(random.nextInt(10)));
        phoneBook.add("Витя", String.valueOf(random.nextInt(10)));


        phoneBook.findString("Максим");
        phoneBook.findString("Витя");
        phoneBook.findString("Алешка");

    }
}
