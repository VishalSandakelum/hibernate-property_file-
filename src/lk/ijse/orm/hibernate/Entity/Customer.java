package lk.ijse.orm.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id //This is primary key in sql table (When use this create the primary key in table)
    @Column(name = "customer_id")//This is column name
    private int Id;

    @Column(name = "customer_name")
    private String Name;

    @Column(name = "customer_address")
    private String Address;

    @Column(name = "customer_salary")
    private double Salary;

    public Customer(int id, String name, String address, double salary) {
        Id = id;
        Name = name;
        Address = address;
        Salary = salary;
    }

    public Customer() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
