package hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Access {

	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	static private int insertUser(Person p) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer userIdSaved = null;
		try {
			tx = session.beginTransaction();

			userIdSaved = (Integer) session.save(p);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return userIdSaved;

	}

	static private Person getPerson(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		Person person = null;
		try {
			tx = session.beginTransaction();
			person = (Person) session.get(Person.class, id);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return person;

	}

	static private Person updatePerson(int id, String name) {
		Session session = factory.openSession();
		Transaction tx = null;
		Person person = null;
		try {
			tx = session.beginTransaction();
			person = (Person) session.get(Person.class, id);
			person.setName(name);
			// session.beginTransaction().commit();
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return person;

	}

	static private Person deletePerson(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		Person person = null;
		try {
			tx = session.beginTransaction();
			person = (Person) session.get(Person.class, id);
			session.delete(person);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return person;

	}

	static private List<Person> listPersons() {
		Session session = factory.openSession();
		Transaction tx = null;
		List<Person> lp = null;
		try {
			tx = session.beginTransaction();
			lp = session.createQuery(" From Person").list();
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return lp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration().configure();
		config.addAnnotatedClass(Person.class);

		serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		factory = config.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		// Insertion of Data
		/*
		Person p = new Person();
		p.setRoll(92);
		p.setName("Vishnu");
		p.setCollegeName("KRCT");
		insertUser(p);

		p.setRoll(118);
		p.setName("Vimal");
		p.setCollegeName("KRCT");
		insertUser(p);
		*/

		/*
		 * // select single record Person single = getPerson(1);
		 * System.out.println("single record: " + single.getRoll() + " " +
		 * single.getName() + " " + single.getCollegeName());
		 * 
		 * //update specific record Person perObj = updatePerson(1,"Vishnu") ;
		 * 
		 * List<Person> personList = listPersons(); for (Person person : personList) {
		 * System.out.println(person.getRoll() + " " + person.getName() + " " +
		 * person.getCollegeName()); }
		 * 
		 * // delete selected record Person delObj = deletePerson(2);
		 */

		// Display the data
		List<Person> personList1 = listPersons();
		for (Person person : personList1) {
			System.out.println(person.getRoll() + " " + person.getName() + " " + person.getCollegeName());
		}

	}

}
