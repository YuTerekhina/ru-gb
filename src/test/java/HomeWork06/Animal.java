package HomeWork06;

public abstract class Animal {
    private String name;
    private int distance;

    public Animal(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}