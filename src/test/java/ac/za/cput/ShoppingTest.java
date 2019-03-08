package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;

public class ShoppingTest {

    Object[] ShopTime = new Object[3];

    private void put(String itemPrice, String amount, Map<String,String> mMap1, Map<String,String> mMap2){
        
        mMap1.put(itemPrice, amount);
        mMap1.put(itemPrice, amount);
    }

    @Before
    private void list() throws Exception {


        ShopTime[0] = new Shopping(25, 21);
        ShopTime[1] = new Shopping(27, 15);
        ShopTime[2] = new Shopping(22, 18);


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEquilMap()throws Exception
    {

        Map<String, String> theMap = new HashMap<String, String>();
        Map<String, String> thMap = new TreeMap<String, String>();

        put("29,5", "4", theMap, thMap);
        put("50,3", "90", theMap, thMap);
        Assert.assertTrue(theMap.equals(thMap));

        thMap.put("50,3", "90");
        Assert.assertFalse(theMap.equals(thMap));
    }

    @Test
    public void main() {

        Object[] testShopTime = Shopping.getShoppingList().toArray();
        Assert.assertArrayEquals(ShopTime, testShopTime);
    }

}