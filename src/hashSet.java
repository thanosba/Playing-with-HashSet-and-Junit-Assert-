import org.junit.Assert;
import java.util.*;

public class hashSet {
    public static void main(String args[]) throws InterruptedException {
        // HashSet declaration
        HashSet<String> hset =
                new HashSet<String>();
        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);
        //Displaying HashSet elements
        System.out.println(hset);
        Thread.sleep(5000);

        //Using Iterator
        Iterator<String> it = hset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Thread.sleep(5000);

        //Convert HashSet to a List/ArrayList
        List<String> list = new ArrayList<String>(hset);
        // Displaying ArrayList elements
        System.out.println("ArrayList contains: " + list);
        Thread.sleep(5000);

        //Delete All Elements from hashSet
        hset.clear();
        System.out.println("After: HashSet contains: " + hset);
        Thread.sleep(5000);

        //verify different elements
        List<String> list2 = Arrays.asList("1", "2", "3", "4");
        Assert.assertNotEquals(hset, list2);
        Thread.sleep(5000);
    }

}
