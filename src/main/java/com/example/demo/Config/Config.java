package com.example.demo.Config;

import java.time.Instant;
import java.util.Arrays;

import com.example.demo.Entity.CategoryEntity;
import com.example.demo.Entity.OrderEntity;
import com.example.demo.Entity.ProductEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.Repository.ProducttRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


public class Config {

    @Configuration
    @Profile("test")
    public static class TestConfig implements CommandLineRunner {

        @Autowired
        private UserRepository userRepository;

        @Autowired
        private OrderRepository orderRepository;

        @Autowired
        private CategoryRepository categoryRepository;

        @Autowired
        private ProducttRepository producttRepository;

        @Override
        public void run(String... args) throws Exception {

            UserEntity u1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
            UserEntity u2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
            UserEntity u3 = new UserEntity(null, "Amanda", "amanda@gmail.com", "977777777", "123456");

            OrderEntity o1 = new OrderEntity(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
            OrderEntity o2 = new OrderEntity(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
            OrderEntity o3 = new OrderEntity(null, Instant.parse("2019-07-22T15:21:22Z"), u3);

            CategoryEntity cat1 = new CategoryEntity(null, "Electronics");
            CategoryEntity cat2 = new CategoryEntity(null, "Books");
            CategoryEntity cat3 = new CategoryEntity(null, "Computers");

            ProductEntity p1 = new ProductEntity(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "", cat2);
            ProductEntity p2 = new ProductEntity(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "", cat1);
            ProductEntity p3 = new ProductEntity(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "", cat3);
            ProductEntity p4 = new ProductEntity(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "", cat3);
            ProductEntity p5 = new ProductEntity(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "", cat2);

            categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
            producttRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
            userRepository.saveAll(Arrays.asList(u1, u2, u3));
            orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        }
    }
}
