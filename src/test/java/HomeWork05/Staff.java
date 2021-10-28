package HomeWork05;

public class Staff {
    private String nameSurname;
    private int age;
    private String position;
    private String email;
    private String telephone;
    private int salary;


    Staff(String nameSurname, int age, String position, String email, String telephone, int salary){
        this.nameSurname = nameSurname;
        this.age = age;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
    }

    void print(){
        System.out.printf("Имя сотрудника - %s, возраст - %d, занимаемая должность - %s, эл.почта - %s, номер телефона - %s, заработная плата - %d\n", nameSurname, age, position, email, telephone, salary);

    }

    public int getAge() {
        return age;
    }

}