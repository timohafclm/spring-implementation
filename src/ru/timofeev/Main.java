package ru.timofeev;

import org.springframework.beans.factory.BeanFactory;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.instantiate("ru.timofeev");
        ProductService productService = (ProductService) beanFactory.getBean("productService");
        PromotionsService promotionsService = productService.getPromotionsService();
        System.out.println(promotionsService);
    }
}
