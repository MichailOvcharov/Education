import animals.*;


public class Main {

    public static void main(String[] args) {
        Animal wolf = new Wolf();
        System.out.println(wolf.walk());
        Animal cat = new Cat();
        System.out.println(cat.run());
        Animal tiger = new Tiger();
        System.out.println(tiger.swim());
        Animal dog = new Dog();
        System.out.println(dog.walk());
        Animal hare = new Hare();
        System.out.println(hare.run());
        Animal elephant = new Elephant();
        System.out.println(elephant.swim());

    }

}
