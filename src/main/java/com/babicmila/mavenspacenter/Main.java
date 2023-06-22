package com.babicmila.mavenspacenter;

import tretman.TretmanDao;
import tretman.Tretman;
import java.util.List;

/**
 *
 * @author milab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TretmanDao tretmandao = new TretmanDao();

        Tretman tretman1 = new Tretman("Higijenski tretmam lica",
                "Tretman za problematicnu kozu lica.",
                2000,
                "https://sp-ao.shortpixel.ai/client/to_webp,q_lossy,ret_img,w_850,h_570/https://dermaville.rs/wp-content/uploads/2018/08/Cosmetic_Treatment_850x570.jpg");

        Tretman tretman2 = new Tretman("Relax masaza 60min",
                "Masaza slabijeg intenziteta u trajanju od sat vremena.",
                3000,
                "https://www.physiospa.rs/wp-content/uploads/2016/04/masaza1.jpg");

        tretmandao.saveTretman(tretman1);
        tretmandao.saveTretman(tretman2);

        tretman1.setCenaTretmana(2500);
        tretmandao.updateTretman(tretman1);

        List<Tretman> sviTretmani = tretmandao.getAllTreatmans();

        System.out.println();

        for (Tretman t : sviTretmani) {
            System.out.println(t);
        }

//        sviTretmani.forEach((t) -> {
//            System.out.println(t);
//        });
    }

}
