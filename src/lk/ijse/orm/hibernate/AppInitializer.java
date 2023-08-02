package lk.ijse.orm.hibernate;

import lk.ijse.orm.hibernate.Entity.Customer;
import lk.ijse.orm.hibernate.config.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Session session = SessionFactoryConfig.getInstance().getsSession();

        //Save Customer

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Theek");
        customer.setAddress("Galle");
        customer.setSalary(750000.00);

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();

        /*//Update customer
        Session session1 = SessionFactoryConfig.getInstance().getsSession();

        Transaction transaction = session1.beginTransaction();
        Customer customer = session1.get(Customer.class,1);
        customer.setName("Vishal");
        session1.update(customer);

        transaction.commit();
        session1.close();
*/

        /*//Delete customer
        Session session2 = SessionFactoryConfig.getInstance().getsSession();

        Transaction transaction = session2.beginTransaction();
        Customer customer = session2.get(Customer.class,1);
        session2.delete(customer);

        transaction.commit();
        session2.close();*/

    }
}
