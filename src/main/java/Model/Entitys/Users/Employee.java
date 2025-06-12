package Model.Entitys.Users;

import Model.Entitys.Order.Order;

import java.sql.Date;

public class Employee {

    private int id;
    private String name;
    private Date dateOfBirth;

    public Employee(Date dateOfBirth, int id, String name) {
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void CreatedOrder(Order order){

    }



}
