package com.classes;
import com.interfaces.Animal;

public class GetObject
{
    Animal getObject(String s)
    {
        if(s.equalsIgnoreCase("doggie"))
            return new Dog();
        else if(s.equalsIgnoreCase("kitten"))
            return new Cat();
        else
            return null;
    }
}
