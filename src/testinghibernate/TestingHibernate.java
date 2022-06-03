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
        
        Transaction _transaction = s.beginTransaction();
        List <Studentyi> students = s.createQuery("From Stydentyi").list();
        
        for(Studentyi student : students){
            System.out.println(student.getImya());
            student.setStatusDate(new Date());
            s.saveOrUpdate(student);
        }
        s.flush();
        _transaction.commit();
    }
    
}
