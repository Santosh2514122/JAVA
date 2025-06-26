package oopABS;

// Abstract Class declared
abstract class Animal {
    private String name;

    public Animal(String name)//method
    {
        this.name = name;
    }

    public abstract void makeSound();//abstract method

    public String getName()//method
    {
        return name;
    }
}

//  Dog class extend the animals
class Dog extends Animal
{
    public Dog(String name)// method value
    {
        super(name);
    }

    public void makeSound()// abstract  method  insert value
    {
        System.out.println(getName() + " barks");
    }
}

// Abstracted class
class Cat extends Animal {
    public Cat(String name)
    {
        super(name);
    }
    public void makeSound()// abstract method insert value
    {
        System.out.println(getName() + " meows");
    }
}

//  main Class
public class Class4 {

    // Main Function
    public static void main(String[] args)
    {
        Animal myDog = new Dog("x");//object
        Animal myCat = new Cat("y");

        myDog.makeSound();
        myCat.makeSound();
    }
}
