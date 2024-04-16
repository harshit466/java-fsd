import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration().configure();
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error initializing Hibernate");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
