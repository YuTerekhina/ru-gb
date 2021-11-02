package HomeWork06;

public class Dog extends Animal{
    public Dog(String name, int distance) {
        super(name, distance);
    }

    @Override
    public void run(int distance) {
        if (getDistance() >= 500){
            System.out.println("Собака " + getName() + " устала и не может пробежать " + getDistance() + " м. ");
        }else {
            System.out.println(getName() + " пробежал/а " + getDistance() + " м. ");
        }
    }

    @Override
    public void swim(int distance) {
        if (getDistance() >= 10) {
            System.out.println("Собака " + getName() + " не может проплыть " + getDistance() + " м. ");
        }else{
            System.out.println("Собака " + getName() + " проплыл/а " + distance + " м. ");
        }
    }


}

