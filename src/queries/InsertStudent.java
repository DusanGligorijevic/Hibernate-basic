package queries;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
                session.beginTransaction();
                Student student = new Student("Dusan","Gligorijevic","dgligorijevic@raf.rs");
                session.save(student);
                session.getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}
