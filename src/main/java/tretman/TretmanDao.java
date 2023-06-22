package tretman;

import com.babicmila.mavenspacenter.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author milab
 */
public class TretmanDao implements TretmanDaoInterface {

    @Override
    public void saveTretman(Tretman tretman) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(tretman);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void updateTretman(Tretman tretman) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.saveOrUpdate(tretman);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }

    @Override
    public void deleteTretman(int id) {

        Transaction transaction = null;
        Tretman tretman = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            tretman = session.get(Tretman.class, id);

            session.delete(tretman);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }

    @Override
    public Tretman getTretmanById(int id) {

        Transaction transaction = null;
        Tretman tretman = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            tretman = session.get(Tretman.class, id);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return tretman;

    }

    @Override
    public List<Tretman> getAllTreatmans() {

        Transaction transaction = null;
        List<Tretman> tretmans = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            tretmans = session.createQuery("from Tretman").list();

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return tretmans;
    }

}
