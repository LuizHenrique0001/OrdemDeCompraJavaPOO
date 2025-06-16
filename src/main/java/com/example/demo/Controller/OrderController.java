package com.example.demo.Controller;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderEntity>> findAll(){
        return ResponseEntity.ok().body(orderService.findAll());
    }

    public ResponseEntity<Optional<OrderEntity>> findById(Long id){
        return ResponseEntity.ok().body(orderService.findById(id));
    }

    public void save(OrderEntity orderEntity){orderService.save(orderEntity);
    }
}
