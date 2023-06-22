package tretman;

import tretman.Tretman;
import java.util.List;

/**
 *
 * @author milab
 */
public interface TretmanDaoInterface {

    void saveTretman(Tretman tretman);

    void updateTretman(Tretman tretman);

    void deleteTretman(int id);

    Tretman getTretmanById(int id);

    List<Tretman> getAllTreatmans();

}
