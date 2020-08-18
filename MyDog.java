package be.intecbrussel.hoofdstuk10.polymorfismeInEenAbstracteKlasse;

import be.intecbrussel.hoofdstuk10.polymorfismeInEenAbstracteKlasse.MyAnimal;

public class MyDog extends MyAnimal
{

    public MyDog()
    {

    }
    public MyDog(String name)
    {
        super(name);
    }
    @Override
    public void move()
    {
        System.out.println("Le chien bouge.");
    }
    @Override
    public void makeNoise()
    {
        System.out.println("Le chien fait du bruit.");
    }
}
