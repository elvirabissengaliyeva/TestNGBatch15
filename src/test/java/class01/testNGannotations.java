package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am before Method");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am after Method");
    }

    @Test (groups = "regression")
    public void AfirstTestCase(){
        System.out.println("I am the first test case");
    }
    @Test
    public void bSecondTestcase(){
        System.out.println("I am the second test case");
    }
    @Test
    public void cThirdTestcase(){
        System.out.println("I am the third test case");
    }
}
