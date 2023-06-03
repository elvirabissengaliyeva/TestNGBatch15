package class04;

import org.testng.annotations.*;

public class annotationsBeforeClass {

    @BeforeClass
    public void hello() {
        System.out.println("I am before class");

    }
    @Test
    public void TestB() {
        System.out.println("i am test B");
    }

}