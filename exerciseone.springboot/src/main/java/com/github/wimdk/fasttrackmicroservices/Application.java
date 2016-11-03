package com.github.wimdk.fasttrackmicroservices;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        XStreamMarshaller marshaller = new XStreamMarshaller();


        XStreamMarshaller unmarshaller = new XStreamMarshaller();


        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/vnd.restbucks+xml");
        String body = "<order xmlns=\"http://schemas.restbucks.com\">\n" +
                "<item>\n" +
                "<milk>none</milk>\n" +
                "<size>small</size>\n" +
                "<drink>\n" +
                "whosyourdaddynow\n" +
                "</drink>\n" +
                "</item>\n" +
                "<location>takeaway</location>\n" +
                "</order>";
        HttpEntity<String> request = new HttpEntity<>(body, headers);
        RestTemplate restTemplate = new RestTemplate(marshaller,unmarshaller);
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
        ResponseEntity<Order> orderResponseEntity = restTemplate.postForEntity("http://172.16.5.55:8080/order", request, Order.class);

        final Order order = orderResponseEntity.getBody();
        System.out.println(order.getLinks());

    }

}
