public class Plane {
    private int capacity;
    private int numOfPeople;
    private int miles;

    public Plane() {
        this.capacity = 100;
        this.numOfPeople = 0;
        this.miles = 0;
    }

    public Plane(int capacity) {
        this.capacity = capacity;
        this.numOfPeople = 0;
        this.miles = 0;
    }

    public int getPassengers() {
        return this.numOfPeople;
    }

    public void load(int people) {
        numOfPeople += people;
        if (numOfPeople > capacity) {
            numOfPeople = capacity;
        }
    }

    public void unload(int people) {
        numOfPeople -= people;
        if (numOfPeople < 0) {
            numOfPeople = 0;
        }
    }

    public void fly(int distance) {
        miles += distance;
    }

    public int getTotalMiles() {
        return miles;
    }
}
