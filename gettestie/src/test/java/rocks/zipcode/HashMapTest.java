package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;


public class HashMapTest  {

    Person person;
    Address address;
    TreeMap<Person, Address> personList;

    @Before
    public void init() {
        person = new Person("Kasper", 1994);
        address= new Address("1223", "bear", "1932","usa");
        personList = new TreeMap<>();

    }


    @Test
    public void addTest() {
        personList.put(person,address);

        Assert.assertTrue(personList.containsKey(person));
        Assert.assertTrue(personList.containsKey(address));
        Assert.assertEquals(address,personList.get(address));
        Assert.assertEquals(person,personList.ceilingKey(person));
     }

     @Test
    public void removeTest () {
         personList.put(person,address);

         personList.clear();
         Assert.assertEquals(0,personList.size());

         personList.put(person,address);

         personList.remove(person);
         Assert.assertEquals(0,personList.size());
         Assert.assertEquals(null,personList.get(person));




     }
     @Test
     public  void  replaceTest (){
        Address address1 = new Address("1111", "1111", "111","1111");
         personList.put(person,address);

         personList.replace(person,address1);
         Assert.assertEquals(address1,personList.get(address));
     }



}
