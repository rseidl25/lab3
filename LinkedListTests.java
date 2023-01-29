import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void testPrepend(){

        LinkedList testList = new LinkedList();

        testList.prepend(5);

        assertEquals("5", testList.toString());

    }

    @Test
    public void testAppend(){

        LinkedList testList = new LinkedList();

        testList.append(1);
        testList.append(2);
        testList.append(3);

        assertEquals("1 2 3", testList.toString());

    }

}
