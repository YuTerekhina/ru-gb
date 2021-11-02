package HomeWork06;

public class Cat extends Animal{
    public Cat(String name, int distance) {
        super(name, distance);
    }

    @Override
    public void run(int distance) {
        if (getDistance() >= 200){
            System.out.println("Котик " + getName() + " устал и не может пробежать " + getDistance() + " м. ");
        }else{
            System.out.println(getName() + " пробежал/а " + distance + " м. ");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котик " + getName() + " не умеет плавать. ");
    }

}
