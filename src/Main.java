import com.paveldejimas.bazine.ZmogusImp;
import com.paveldejimas.isvestine.StatybininkasImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList <StatybininkasImp> statybininkai = new ArrayList<>();
        statybininkai.add(new StatybininkasImp(5, "profesinis","apdailininkas",
                600.5, "vyr",34621236262L, "Kazys", "Kazlauskas",
                42,187,"pilka"));
        statybininkai.add(new StatybininkasImp(23, "aukštasis", "statybų inžinerija",
                1000, "vyr", 37845124578L, "Petras","Karalius",
                35,177,"ruda"));
        statybininkai.add(new StatybininkasImp(2, "vidurinis", "-",
                500, "vyr", 39905120001L, "Jonas", "Jonaitis",
                20, 182, "ruda"));
        statybininkai.add(new StatybininkasImp(10, "Profesinis", "Statyba",
                753.99, "vyr", 35511010001L, "Petras", "Petraitis",
                64, 172, "ruda"));
        statybininkai.add(new StatybininkasImp(3, "Profesinis", "Tinkuotojas",
                688, "vyr", 35511010001L, "Bronius", "Ropė",
                64, 172, "ruda"));
        statybininkai.add(new StatybininkasImp(15, "Profesinis", "Mūrininkas",
                620, "vyr", 35511010001L, "Petras", "Antanaitis",
                64, 172, "ruda"));
        statybininkai.add(new StatybininkasImp(2, "Profesinis", "Plytelių klojėjas",
                593.85, "vyr", 35511010001L, "Simonas", "Daukantas",
                64, 172, "ruda"));
        statybininkai.add(new StatybininkasImp(4, "Profesinis", "Statyba",
                631, "vyr", 35511010001L, "Romas", "Dambrauskas",
                64, 172, "ruda"));
        statybininkai.add(new StatybininkasImp(20, "Profesinis", "Statyba",
                723.99, "vyr", 35511010001L, "Zigmas", "Kazlauskas",
                64, 172, "ruda"));
        statybininkai.add(new StatybininkasImp(7, "Profesinis", "Statyba",
                653.99, "vyr", 35511010001L, "Gytis", "Požėra",
                64, 172, "ruda"));

        ListIterator<StatybininkasImp> statybininkaiIterator = statybininkai.listIterator();
        while(statybininkaiIterator.hasNext()) {
            System.out.println(statybininkaiIterator.next());
        }

        statybininkaiIterator = statybininkai.listIterator();
        while(statybininkaiIterator.hasNext()) {
            if(statybininkaiIterator.next().getStazas() < 4)
                statybininkaiIterator.remove();
        }
/*
        for (int i = 0; i < statybininkai.size(); i++) {
            if(statybininkai.get(i).getStazas() < 4) statybininkai.remove(i);
        }
*/
        System.out.println("============================================");
        //Collections.sort(statybininkai, StatybininkasImp.nameComparator);
        Collections.sort(statybininkai);


        for (StatybininkasImp statybininkas:statybininkai) {
            System.out.println(statybininkas);
        }
    }
}
