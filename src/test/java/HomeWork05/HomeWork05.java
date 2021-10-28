package HomeWork05;

public class HomeWork05 {
    public static void main(String[] args) {
        Staff person1 = new Staff("Иванов Иван", 47, "Генеральный директор", "IIvanov@gmail.com", "9039899999", 150000);
        person1.print();

        Staff[] persArray = new Staff[5];
        persArray[0] = new Staff("Иванов Иван", 47, "Генеральный директор", "IIvanov@gmail.com", "9039899999", 150000);
        persArray[1] = new Staff("Соловьева Мария", 29, "Секретарь", "MSolovyova@gmail.com", "9515514879", 65000);
        persArray[2] = new Staff("Петров Петр", 32, "Инженер", "PPetrov@gmail.com", "9264586978", 90000);
        persArray[3] = new Staff("Сидоров Иван", 41, "Ведущий инженер", "ISidorov@gmail.com", "9653542597", 105000);
        persArray[4] = new Staff("Журавлев Евгений", 21, "Курьер", "EZhyravlev@gmail.com", "9053547562", 30000);

        System.out.println("--------------------------");
        System.out.println("Сотрудники старше 40 лет:");

        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() >= 40) {
                persArray[i].print();
            }
        }

    }
}
