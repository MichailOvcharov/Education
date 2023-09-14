package animals;

public abstract class Animal {

    abstract String getName();

    public String walk() {
        return getName() + " идет";
    }

    public String swim() {
        return getName() + " плывет";
    }

    public String run() {
        return getName() + " бежит";
    }

}
