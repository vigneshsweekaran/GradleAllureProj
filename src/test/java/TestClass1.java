import org.testng.annotations.Test;

public class TestClass1 {

    @Test
    public void testMethod1() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }

    @Test
    public void testMethod2() {
        String client_id = SystemPropertiesReader.getProperty("client_id");
        if (client_id.equals("qwerty")) System.out.println("QWERTY!!!");
    }

    @Test
    public void testMethod3() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}
