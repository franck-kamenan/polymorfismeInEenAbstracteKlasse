package be.intecbrussel.hoofdstuk10.polymorfismeInEenAbstracteKlasse;

public class MyMain
{
    public static void main(String[] args)
    {
       MyAnimal monCochon = new MyPig("Oolong");
       MyAnimal monChien = new MyDog("Toutou");
       MyDog monChienDesEnfers = new MyDog("Cerberus");
       monCochon.move();
       monCochon.makeNoise();
       monChien.move();
       monChien.makeNoise();
       System.out.println(monCochon.getName());
       System.out.println(monChien.getName());
       MyDog.danse();
    }


}
