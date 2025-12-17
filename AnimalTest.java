class Animal
{
    void makeSound() 
    {
        System.out.println("The animal makes a sound.");
    }
}
class Cat extends Animal 
{
    @Override
    void makeSound() 
    {
        System.out.println("The cat meows");
    }
}

class Dog extends Cat 
{
    @Override
    void makeSound() 
    {
        System.out.println("The dog barks");
    }
}

public class AnimalTest
{
    public static void main(String[] args)
    {

        Animal a = new Animal();
        a.makeSound();

        Animal c = new Cat();
        c.makeSound();

        Animal d = new Dog();
        d.makeSound();
    }
}
