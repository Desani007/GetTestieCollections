package rocks.zipcode;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashSetTest {
    HashSet<Person> personHashSet;
    Person person;

    @Before
    public void init (){
        personHashSet= new HashSet<>();
        person = new Person("Kasper",1994);


    }
    @Test
    public  void  addTest (){
        personHashSet.add(person);
        Assert.assertEquals(1,personHashSet.size());
    }

    @Test
    public void removeTest (){
        personHashSet.add(person);
        personHashSet.remove(person);
        Assert.assertEquals(0,personHashSet.size());

    }

    @Test
    public void isEmpty(){
       Assert.assertTrue( personHashSet.isEmpty());
    }

}
