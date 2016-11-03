package com.github.wimdk.fasttrackmicroservices;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private List<String> links;
    private Item item;
    private String location;
    private BigDecimal cost;
    private String status;


    public List<String> getLinks() {
        return links;
    }
}
