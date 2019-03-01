import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PromptTest {

    @Test
    public void testRequestName(){
        Prompt prompt = new Prompt();
        String[] params = {"Kaworu", "Elgueta"};

        Assert.assertEquals(prompt.requestName(params),params);

    }

    @Test
    public void testRequestAge() {
        Prompt prompt = new Prompt();
        Assert.assertEquals(prompt.requestAge(40),true);
        Assert.assertEquals(prompt.requestAge(4), false);
    }

    @Test
    public void testRequestMagiIdentity() {
        Prompt prompt = new Prompt();
        Assert.assertEquals(prompt.requestMagiIdentity(1),1);
        Assert.assertEquals(prompt.requestMagiIdentity(34567),1);
    }

    @Test
    public void testRequestBestAsianActress() {
        Prompt prompt = new Prompt();
        Assert.assertEquals(prompt.requestBestAsianActress(23232), 2);
    }
}