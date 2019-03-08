package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ShoppingTest2 {

    public Shopping list;

    //@Before
    //public void setUp()throws Exception {ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
     //   shoppingService = (ShoppingSevice)ctx.getBean("calc");
    //}

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calcPaymentAmount() {
        int result = list.calcPaymentAmount(1, 2);
        Assert.assertEquals(2, result);
    }
}