package tretman;

import kupon.Kupon;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tretman")
public class Tretman implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tretman_id")
    private int tretmanId;

    @OneToOne
    private Kupon kupon;

    @Column(name = "tretman_naziv")
    private String nazivTretmana;

    @Column(name = "tretman_opis")
    private String opisTretmana;

    @Column(name = "tretman_cena")
    private int cenaTretmana;

    @Column(name = "slika_url")
    private String urlSlike;

    public Tretman() {

    }

    public Tretman(String nazivTretmana, String opisTretmana, int cenaTretmana, String urlSlike) {

        this.nazivTretmana = nazivTretmana;
        this.opisTretmana = opisTretmana;
        this.cenaTretmana = cenaTretmana;
        this.urlSlike = urlSlike;
    }

    public int getTretmanId() {
        return tretmanId;
    }

    public void setTretmanId(int tretmanId) {
        this.tretmanId = tretmanId;
    }

    public String getNazivTretmana() {
        return nazivTretmana;
    }

    public void setNazivTretmana(String nazivTretmana) {
        this.nazivTretmana = nazivTretmana;
    }

    public String getOpisTretmana() {
        return opisTretmana;
    }

    public void setOpisTretmana(String opisTretmana) {
        this.opisTretmana = opisTretmana;
    }

    public int getCenaTretmana() {
        return cenaTretmana;
    }

    public void setCenaTretmana(int cenaTretmana) {
        this.cenaTretmana = cenaTretmana;
    }

    public String getUrlSlike() {
        return urlSlike;
    }

    public void setUrlSlike(String urlSlike) {
        this.urlSlike = urlSlike;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.tretmanId;
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
        final Tretman other = (Tretman) obj;
        if (this.tretmanId != other.tretmanId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tretman{" + "tretmanId=" + tretmanId + ", nazivTretmana=" + nazivTretmana + ", opisTretmana=" + opisTretmana + ", cenaTretmana=" + cenaTretmana + ", urlSlike=" + urlSlike + '}';
    }

}
