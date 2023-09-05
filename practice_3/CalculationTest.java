package practice_3;

import org.junit.*;


import static org.junit.Assert.*;

public class CalculationTest {

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("before class");
    }

    @Before
    public  void setUpBefore(){
        System.out.println("before");
    }

    @Test
    public void maxNum() {
        assertEquals(4 , Calculation.maxNum(new int[] {1,2,3,4}));
        assertEquals(7 , Calculation.maxNum(new int[] {5,2,7,4}));
    }

    @Test
    public void cube() {
        assertEquals(27,Calculation.cube(3));
        assertEquals(64,Calculation.cube(4));
    }

    @After
    public void tearDown(){
        System.out.println("after");
    }
//
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("afterclass");
    }
}