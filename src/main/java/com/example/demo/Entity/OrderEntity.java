package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;


    @ManyToOne
    private UserEntity client;

    public OrderEntity(){}

    public OrderEntity(Long id, Instant moment, UserEntity client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public UserEntity getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
