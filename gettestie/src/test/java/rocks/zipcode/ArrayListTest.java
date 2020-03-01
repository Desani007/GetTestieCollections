package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    Person person;
    ArrayList<Person> personList;

    @Before
        public void init () {
         person = new Person("Kasper", 1994);
        personList= new ArrayList<>();

    }
        @Test
    public void addTest (){
            //given
            personList.add(person);
            //when
           String name= person.getName();
           int age = person.getYearOfBirth();
            //then
            Assert.assertEquals("Kasper",name);
            Assert.assertEquals(1994,age);
            Assert.assertEquals(1,personList.size());


    }
    @Test
    public void  removeTest (){
        personList.add(person);
       personList.remove(person);
       Assert.assertEquals(0,personList.size());

    }

    @Test
    public void containsTest(){
        personList.add(person);
       Assert.assertTrue( personList.contains(person));


    }


}
