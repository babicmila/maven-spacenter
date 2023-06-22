package kupon;

import tretman.Tretman;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "kupon")
public class Kupon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int kuponId;

    @OneToOne
    @JoinColumn(name = "tretman_id")
    private Tretman tretman;

    private String sifraKupona;

    public Kupon() {
    }

    public Kupon(Tretman tretman, String sifraKupona) {
        this.tretman = tretman;
        this.sifraKupona = sifraKupona;
    }

    public int getKuponId() {
        return kuponId;
    }

    public void setKuponId(int kuponId) {
        this.kuponId = kuponId;
    }

    public Tretman getTretman() {
        return tretman;
    }

    public void setTretman(Tretman tretman) {
        this.tretman = tretman;
    }

    public String getSifraKupona() {
        return sifraKupona;
    }

    public void setSifraKupona(String sifraKupona) {
        this.sifraKupona = sifraKupona;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.kuponId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kupon other = (Kupon) obj;
        if (this.kuponId != other.kuponId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kupon{" + "kuponId=" + kuponId + ", tretman=" + tretman + ", sifraKupona=" + sifraKupona + '}';
    }

}
