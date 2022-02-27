package HashMapImplementationTest;

import HashMapImplementation.MyMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyTest {

    @Test
    public void testMyMap() {
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Nepal", "Kathmandu");
        myMap.put("India", "New Delhi");
        myMap.put("Australia", "Sydney");

        assertNotNull(myMap);
        assertEquals(4, myMap.getSize());
        assertEquals("Kathmandu", myMap.get("Nepal"));
        assertEquals("Sydney", myMap.get("Australia"));
    }
}
