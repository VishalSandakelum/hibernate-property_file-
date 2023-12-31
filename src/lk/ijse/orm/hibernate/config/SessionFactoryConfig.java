package lk.ijse.orm.hibernate.config;

import lk.ijse.orm.hibernate.Entity.Customer;
import lk.ijse.orm.hibernate.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;

    private SessionFactoryConfig(){

    }

    public static SessionFactoryConfig getInstance(){
        return (null==factoryConfig) ? factoryConfig = new SessionFactoryConfig():factoryConfig;
    }

    public Session getsSession(){
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        SessionFactory sessionFactory = metadata
                .buildSessionFactory();

        return sessionFactory.openSession();
    }

}
