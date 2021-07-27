import org.testng.annotations.Test;

public class TestClass1 {

    @Test
    public void testMethod1() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }

    @Test
    public void testMethod2() {
        System.out.println(SystemPropertiesReader.getProperty("client_id"));
    }

    @Test
    public void testMethod3() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}
