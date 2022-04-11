import org.testng.annotations.Test;

public class TestCases {
@Test(priority = 2)
void setup(){
    System.out.println("test method checking");
}
    @Test(priority = 3)
    void setup1(){
        System.out.println("test method here");
    }
    @Test(priority = 1)
    void setup2(){
        System.out.println("april month");
    }
}
