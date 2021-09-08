import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestClass2 {

    @Test
    public void testMethod1() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2() {
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod3() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod4() {
        open("https://phptravels.com/demo/");
        $(".main-title strong").shouldHave(Condition.text("Demo Credentials for Frontend and Backend"));
    }
}
