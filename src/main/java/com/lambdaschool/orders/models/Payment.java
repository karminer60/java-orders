package com.lambdaschool.orders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    private String type;

    @ManyToMany(mappedBy = "payments")
    @JsonIgnoreProperties("payments")
    private Set<Order> orders = new HashSet<>();


    public Payment() {
        //default constructor
    }

    public Payment(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(long paymentid) {
        this.paymentid = paymentid;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentid=" + paymentid +
                ", type='" + type + '\'' +
                '}';
    }
}
