package be.intecbrussel.hoofdstuk10.polymorfismeInEenAbstracteKlasse;

public abstract class MyAnimal
{
    private String name;

    public MyAnimal()
    {

    }
    public MyAnimal(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public abstract void move();
    public abstract void makeNoise();
    public static void danse()
    {
        System.out.println("L'animal danse.");
    }
}
