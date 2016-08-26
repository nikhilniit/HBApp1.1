


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	public static void main(String[] args) {
		Configuration config = new Configuration(); //to give configuration as in hib.cfg.xml
		config.configure("hibernate.cfg.xml");// to load the file
        SessionFactory factory=config.buildSessionFactory(); // to build sessionfactory
        Session session=factory.openSession();// to open session
        Transaction tx=session.beginTransaction();// to begin transaction
        EmployeeInfo info=new EmployeeInfo();// should create object to which data you have to create
        info.setName("Emp1");
        info.setId("E100");
        info.setAddress("hyd");// to assign values
        session.persist(info);// to store data in database
        tx.commit();// commiting transaction
        session.close(); // closing session
        System.out.println("done");
	}

}
