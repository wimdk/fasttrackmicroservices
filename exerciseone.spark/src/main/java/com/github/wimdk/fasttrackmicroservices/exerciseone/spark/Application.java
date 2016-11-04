package com.github.wimdk.fasttrackmicroservices.exerciseone.spark;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) throws Exception {
        post("/order", (req, res) -> {
            if req.headers("content-Type").contentEquals("application/vnd.restbucks+xml") {
            return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                    "<ns2:order xmlns:ns2=\"http://schemas.restbucks.com\" xmlns:ns3=\"http://schemas.restbucks.com/dap\">\n" +
                    "  <ns3:link mediaType=\"application/vnd.restbucks+xml\" rel=\"http://relations.restbucks.com/cancel\" uri=\"http://172.16.5.55:8080/order/c5bdbff5-09b7-4142-b855-4952087b5863\"/>\n" +
                    "  <ns3:link mediaType=\"application/vnd.restbucks+xml\" rel=\"http://relations.restbucks.com/payment\" uri=\"http://172.16.5.55:8080/payment/c5bdbff5-09b7-4142-b855-4952087b5863\"/>\n" +
                    "  <ns3:link mediaType=\"application/vnd.restbucks+xml\" rel=\"http://relations.restbucks.com/update\" uri=\"http://172.16.5.55:8080/order/c5bdbff5-09b7-4142-b855-4952087b5863\"/>\n" +
                    "  <ns3:link mediaType=\"application/vnd.restbucks+xml\" rel=\"self\" uri=\"http://172.16.5.55:8080/order/c5bdbff5-09b7-4142-b855-4952087b5863\"/>\n" +
                    "  <ns2:item>\n" +
                    "    <ns2:milk>none</ns2:milk>\n" +
                    "    <ns2:size>small</ns2:size>\n" +
                    "  </ns2:item>\n" +
                    "  <ns2:location>takeaway</ns2:location>\n" +
                    "  <ns2:cost>0.0</ns2:cost>\n" +
                    "  <ns2:status>unpaid</ns2:status>\n" +
                    "</ns2:order>";
            }
            else res.status(406);
        );
    }
}
