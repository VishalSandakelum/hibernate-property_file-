package lk.ijse.orm.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private int Id;

    @Column(name = "user_name")
    private String Name;

    @Column(name = "user_address")
    private String Address;

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

    public User(int id, String name, String address, double salary) {
        Id = id;
        Name = name;
        Address = address;
        Salary = salary;
    }

    @Column(name = "user_salary")
    private double Salary;
}
