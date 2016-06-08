package com.rzd.pktb.ProdOrders.business;

import com.rzd.pktb.ProdOrders.crud.salesCRUD;

/**
 * Created by SimpleUser on 08.06.2016.
 */
public class SalesProcess {
    public salesCRUD db;

    public SalesProcess(salesCRUD dataSource){
        this.db = dataSource;
    }

    public void startProcess(){
    }
}
