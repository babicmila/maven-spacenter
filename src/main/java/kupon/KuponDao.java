package kupon;

import com.babicmila.mavenspacenter.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author milab
 */
public class KuponDao implements KuponDaoInterface {

    @Override
    public void saveKupon(Kupon kupon) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(kupon);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }

    @Override
    public void updateKupon(Kupon kupon) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.saveOrUpdate(kupon);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }

    @Override
    public void deleteKupon(int id) {

        Transaction transaction = null;
        Kupon kupon = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            kupon = session.get(Kupon.class, id);

            session.delete(kupon);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }

    @Override
    public Kupon getKuponById(int id) {

        Transaction transaction = null;
        Kupon kupon = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            kupon = session.get(Kupon.class, id);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return kupon;

    }

    @Override
    public List<Kupon> getAllKupons() {

        Transaction transaction = null;
        List<Kupon> kuponi = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            kuponi = session.createQuery("from Kupon").list();

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return kuponi;
    }

}
