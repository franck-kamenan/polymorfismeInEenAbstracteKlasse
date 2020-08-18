package be.intecbrussel.hoofdstuk10.polymorfismeInEenAbstracteKlasse;

public class MyMain
{
    public static void main(String[] args)
    {
       MyAnimal monCochon = new MyPig();
       MyAnimal monChien = new MyDog();
       monCochon.move();
       monCochon.makeNoise();
       monChien.move();
       monChien.makeNoise();

    }


}
