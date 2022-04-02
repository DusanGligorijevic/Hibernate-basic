package queries;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            int id =1;
            Student student = session.get(Student.class, id);
            System.out.println(student.getFirstName());
            session.getTransaction().commit();

        }catch (Exception e){

        }finally {

        }
    }



}
