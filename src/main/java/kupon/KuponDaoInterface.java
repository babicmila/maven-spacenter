package kupon;

import java.util.List;


/**
 *
 * @author milab
 */
public interface KuponDaoInterface {

    void saveKupon(Kupon kupon);

    void updateKupon(Kupon kupon);

    void deleteKupon(int id);

    Kupon getKuponById(int id);

    List<Kupon> getAllKupons();
    
}
