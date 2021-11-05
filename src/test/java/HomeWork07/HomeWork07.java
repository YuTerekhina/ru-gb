package HomeWork07;

public class HomeWork07 {

    public static void main(String[] args) {
        final Cat cat = new Cat("Васька", 10);
        final Plate plate = new Plate(5);
        System.out.println(plate);
        cat.eat(plate);

    }
}
