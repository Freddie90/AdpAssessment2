package ac.za.cput;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//@Configuration
public class Shopping {


    //@Bean(name="Shop")
    //public ShoppingImpl getService(){return new ShoppingImpl();}

    class sortPay implements Comparator<Shopping>
    {

        @Override
        public int compare(Shopping o1, Shopping o2) {
            return Double.compare(o2.getAmount(), o1.getAmount());
        }
    }

    private int itemPrice;
    private int amount;


    public Shopping(int price, int amount)
    {
        this.itemPrice = price;
        this.amount = amount;
    }

    public boolean equals(Object obj)
    {
        Shopping itm = (Shopping) obj;
        boolean list = false;
        if(this.itemPrice == itm.itemPrice && this.amount == itm.amount)
        {
            list = true;
        }
        return list;
    }

    public static List<Shopping> getShoppingList()
    {
        ArrayList<Shopping> ShopArraylist = new ArrayList<Shopping>();
        ShopArraylist.add(new Shopping(25, 21));
        ShopArraylist.add(new Shopping(27, 15));
        ShopArraylist.add(new Shopping(22, 18));
        return ShopArraylist;
    }

    //Collections.sort(ShopArraylist, new sortPay());

    @Override
    public int hashCode()
    {
        return this.amount;
    }

    public int getItemPrice()
    {
        return itemPrice;
    }

    public int getAmount()
    {
        return amount;
    }



    public int calcPaymentAmount(int amount, int itemPrice)
    {
        return amount * itemPrice;
    }




}
