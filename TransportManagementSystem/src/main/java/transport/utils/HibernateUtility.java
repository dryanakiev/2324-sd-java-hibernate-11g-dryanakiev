package transport.utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

    public static Session getCurrentSessionFromConfig() {
        // SessionFactory in Hibernate 5 example
        Configuration config = new Configuration();

        config.configure();

        // local SessionFactory bean created
        Session session;
        try (SessionFactory sessionFactory = config.buildSessionFactory()) {

            session = sessionFactory.getCurrentSession();
        }

        return session;
    }
}