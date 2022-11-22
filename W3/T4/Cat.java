import java.util.Objects;

class Animal implements Cloneable {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        Cat neighborCat =(Cat) myCat.clone();
        neighborCat.testInstanceMethod();
        System.out.println("is neighborCat equals myCat ?: " + Objects.equals(neighborCat,myCat));
        System.out.println("getClass neighborCat: "+ neighborCat.getClass());
        System.out.println("toString neighborCat: " + neighborCat.toString());
        System.out.println("Hash code of neighborCat:" + neighborCat.hashCode());
    }
}
