import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceMultipleValues(){

    int[] multipleValueInput = {10, 8, 6, 4, 2, 0};
    ArrayExamples.reverseInPlace(multipleValueInput);
    assertArrayEquals(new int[]{0, 2, 4, 6, 8, 10}, multipleValueInput);
    
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedMultipleValues(){

    int[] multipleValueInput = {10, 8, 6, 4, 2, 0};
    ArrayExamples.reversed(multipleValueInput);
    assertArrayEquals(new int[]{0, 2, 4, 6, 8, 10}, multipleValueInput);

  }

}
