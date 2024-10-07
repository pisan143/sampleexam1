public class Chair {
    private int legs;
    private String color;
    private boolean isEmpty;
    private String occupant = "";

    public Chair() {
        this.legs = 4;
        this.color = "brown";
        isEmpty = true;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sitOn(String name) {
        if (isEmpty) {
            System.out.println(name + " is sitting on the " + this.color + " chair.");
            occupant = name;
            isEmpty = false;
        } else {
            System.out.println(name + " cannot sit on the " + this.color + " chair.");
        }
    }

    public void stand() {
        if (isEmpty) {
            System.out.println("Nobody is sitting on the " + this.color + " chair.");
        } else {
            System.out.println(occupant + " is standing. The " + this.color + " chair is empty.");
            isEmpty = true;
        }
    }
}
