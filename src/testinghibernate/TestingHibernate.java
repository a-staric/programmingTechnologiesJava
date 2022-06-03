package testinghibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author 20515
 */
public class TestingHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I'm here!");
        
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
    }
    
}
