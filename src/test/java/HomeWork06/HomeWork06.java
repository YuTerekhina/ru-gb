package HomeWork06;

public class HomeWork06 {
    public static void main(String[] args) {
        Animal[] catArray = {
                new Cat("Мурзик", 250),
                new Cat("Люська", 100),
                new Cat("Васька", 75),
        };
        Animal[] dogArray = {
                new Dog("Бобик", 210),
                new Dog("Шарик", 9),
                new Dog("Белла", 440),
                new Dog("Оскар", 170),
        };

        System.out.println("------- Спорт котиков -------");
        int totalizerCat = 0;
        for (int i = 0; i < catArray.length; i++) {
            totalizerCat++;
            catArray[i].run(catArray[i].getDistance());
            catArray[i].swim(catArray[i].getDistance());
            System.out.println("***");
            }

        System.out.println("------- Спорт собак -------");
        int totalizerDog = 0;
       for (int i = 0; i < dogArray.length; i++) {
            totalizerDog++;
            dogArray[i].run(dogArray[i].getDistance());
            dogArray[i].swim(dogArray[i].getDistance());
           System.out.println("***");
        }
        System.out.println("--------------");
        System.out.println("Всего животных создано : " + (totalizerCat + totalizerDog) + "\nИз них котиков : " + totalizerCat + "\nА собак : " + totalizerDog);

    }


}
