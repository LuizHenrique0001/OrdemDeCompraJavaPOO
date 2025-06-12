package Model.Entitys.Order;

import Model.Entitys.Users.Employee;
import Model.Enuns.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date date;
    private OrderStatus status;

    private Employee employee;
    private List<OrderItem> listOrders;

    public Order(Date date, OrderStatus status, Employee employee) {
        this.date = date;
        this.status = status;
        this.employee = employee;
        this.listOrders = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public List<OrderItem> getListOrders() {
        return listOrders;
    }

    public Double total(){

        Double totalPrice = 0.0;
        for (OrderItem item: listOrders){

            totalPrice+= item.subTotal();

        }
        return totalPrice;
    }
}
