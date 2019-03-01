import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShouldWatchTest {

    @Test
    public static void animu(){
        ShouldWatch var=new ShouldWatch();
        String actual = var.animu(true,3,1);
        Assert.assertEquals(actual,"Monogatari series");
    }

    @Test
    public static void pelis(){
        ShouldWatch var=new ShouldWatch();
        String actual = var.pelis(true,3,1);
        Assert.assertEquals(actual,"Blade runner");
    }

    @Test
    public static void series(){
        ShouldWatch var=new ShouldWatch();
        String actual = var.series(true,3,1);
        Assert.assertEquals(actual,"Twin Peaks");
    }

}
