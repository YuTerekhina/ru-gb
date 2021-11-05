package HomeWork07;

public class HomeWork07 {

    public static void main(String[] args) {
        final Cat [] catArray = {
                new Cat("Васька", 100),
                new Cat ("Мэйсон", 180),
                new Cat("Тимка", 80),
                new Cat("Тайсон", 200),
                new Cat("Пирожок", 40),
        };
        Plate plate = new Plate(0);

        System.out.println("-----------------------------");
        for(int i = 0; i < catArray.length; i++){
            catArray[i].eat(plate, catArray);
        }

        System.out.println("-----------------------------");

        for(int i = 0; i < catArray.length; i++){
            catArray[i].printFull(plate, catArray);
        }
    }
}
