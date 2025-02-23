import org.junit.Test; 
import static org.junit.Assert.assertEquals;

public class TestElement {
  public static void main(String[] args) {
    Element element = new Element(42);
    element.printValue();

    int[] values = {12, 17, 24, 32, 13};
    int middleValue = Element.findMiddleValue(values);
    System.out.println("The middle value is: " + middleValue);
    assertEquals(42, ementses);
  }
}
