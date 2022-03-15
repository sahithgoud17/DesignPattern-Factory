package com.classes;
import com.interfaces.Animal;

class Dog implements Animal
{
    public void run()
    {
        System.out.println("Dog is running");
    }
}
class Cat implements Animal{
    public void run()
    {
        System.out.println("Cat is running");
    }
}
public class FactoryDP
{
    public static void main(String[] args)
    {
        GetObject go = new GetObject();
        Animal A;
        A = go.getObject("doggie");
        A.run();
        A = go.getObject("kitten");
        A.run();
    }

}
