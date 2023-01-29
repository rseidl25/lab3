import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests{

    @Test
    public void testFilter(){

        StringCheckerClass sc = new StringCheckerClass();

        List<String> testList = new ArrayList<String>();

        testList.add("apple");
        testList.add("banana");
        testList.add("cucumber");
        testList.add("pear");

        List<String> resultList = new ArrayList<String>();

        resultList.add("apple");
        resultList.add("banana");
        resultList.add("pear");

        assertEquals(ListExamples.filter(testList, sc), resultList);

    }

    @Test
    public void testMerge(){

        List<String> testList1 = new ArrayList<String>();

        testList1.add("apple");
        testList1.add("banana");
        testList1.add("cucumber");
        testList1.add("pear");

        List<String> testList2 = new ArrayList<String>();

        testList2.add("tomato");
        testList2.add("pumpkin");
        testList2.add("peach");

        List<String> resultList = new ArrayList<String>();

        resultList.add("apple");
        resultList.add("banana");
        resultList.add("cucumber");
        resultList.add("peach");
        resultList.add("pear");
        resultList.add("pumpkin");
        resultList.add("tomato");

        assertEquals(ListExamples.merge(testList1, testList2), resultList);

    }

}
