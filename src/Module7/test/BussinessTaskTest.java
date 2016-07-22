package Module7.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

/**
 * Created by vberezovskii on 22.07.2016.
 */
public class BussinessTaskTest {
    @Before
    public void beforeMethod() {
        System.out.println("@Before method");
    }
     @Test(expected = java.lang.Exception.class)
        public void helloTest(){
        int a=1;
        int b =2 ;
        int res = a+b;
         System.out.println("test");
        //Assert.assertTrue(res==3);
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis()- start<100){
        String s =null;
            s.hashCode();
        }
    }

    @After
    public void afterMethod(){
        System.out.println("@After method");
    }
}
