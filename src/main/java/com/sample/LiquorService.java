package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.3. Implementing the business logic:
 * Then we’ll have to create a service class to hold the business logic of the app.
 * This is a simple java class that has the required methods defined.
 */
public class LiquorService {
    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
