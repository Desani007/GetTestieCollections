package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

public class LinkedListTest {
    Person person;
    Address address;
    LinkedList<Person> personList;

    @Before
    public void init() {
        person = new Person("Kasper", 1994);
        address= new Address("1223", "bear", "1932","usa");
        personList = new LinkedList<>();

     }


     @Test
    public void addTest (){
             personList.add(person);
             Assert.assertTrue(personList.contains(person));
             Assert.assertEquals(person,personList.get(0));
             Assert.assertEquals(1,personList.size());
         }

         @Test
    public void removeTest(){
        personList.add(person);
        personList.remove();
        Assert.assertEquals(0,personList.size());
         }


}
