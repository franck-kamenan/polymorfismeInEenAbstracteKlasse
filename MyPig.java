package be.intecbrussel.hoofdstuk10.polymorfismeInEenAbstracteKlasse;

import be.intecbrussel.hoofdstuk10.polymorfismeInEenAbstracteKlasse.MyAnimal;

public class MyPig extends MyAnimal
{
    public MyPig()
    {

    }
    public MyPig(String name)
    {
        super(name);
    }
    @Override
    public void move()
    {
        System.out.println("Le cochon bouge.");
    }
    @Override
    public void makeNoise()
    {
        System.out.println("Le cochon fait du bruit.");
    }
}
