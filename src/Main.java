import com.paveldejimas.bazine.ZmogusImp;
import com.paveldejimas.isvestine.StatybininkasImp;

public class Main {

    public static void main(String[] args) {
        ZmogusImp[] zmones = new ZmogusImp[8];
        zmones[0] = new ZmogusImp("vyr", 34012250237L,"Petras","Petraitis", 25, 180,"juoda");
        zmones[1] = new ZmogusImp("mot", 47856230459L, "Laima", "Vaikulė", 45, 160,"juoda");
        zmones[2] = new ZmogusImp("mot", 47612363615L, "Ona", "Onaitienė", 33, 175,"geltona");
        zmones[3] = new ZmogusImp("mot",47989452125L,"Vilma","Kazlauskė", 55, 173,"raudona");
        zmones[4] = new StatybininkasImp(5, "profesinis","apdailininkas", 600.5, "vyr",34621236262L, "Kazys", "Kazlauskas",42,187,"pilka");
        zmones[5] = new StatybininkasImp(23, "aukštasis", "statybų inžinerija", 1000, "vyr", 37845124578L, "Laimonas","Karalius",35,177,"ruda");
        zmones[6] = new StatybininkasImp(2, "vidurinis", "-", 500, "vyr", 39905120001L, "Jonas", "Jonaitis", 20, 182, "ruda");
        zmones[7] = new StatybininkasImp(10, "Profesinis", "Statyba", 753.99, "vyr", 35511010001L, "Petras", "Petraitis", 64, 172, "ruda");

        for (ZmogusImp zmogus : zmones)
            if (zmogus instanceof StatybininkasImp)
                System.out.println(zmogus.getVardas() + " " + zmogus.getPavarde() + " uždirba " + ((StatybininkasImp) zmogus).getAtlyginimas() + " Eur per mėnesį");
    }
}
