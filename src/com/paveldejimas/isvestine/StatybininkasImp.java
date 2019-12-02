package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.ZmogusImp;
import java.util.Comparator;

public class StatybininkasImp extends ZmogusImp implements Statybininkas, Comparable {
    private int stazas;
    private String issilavinimas;
    private String specializacija;
    private double atlyginimas;

    public StatybininkasImp(int stazas, String issilavinimas, String specializacija, double atlyginimas, String lytis, long asmensKodas, String vardas, String pavarde, int amzius, int ugis, String plaukuSpalva) {
        super(lytis, asmensKodas, vardas, pavarde, amzius, ugis, plaukuSpalva);
        this.stazas = stazas;
        this.issilavinimas = issilavinimas;
        this.specializacija = specializacija;
        this.atlyginimas = atlyginimas;
    }

    @Override
    public int getStazas() {
        return stazas;
    }

    @Override
    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    @Override
    public String getIssilavinimas() {
        return issilavinimas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    @Override
    public String getSpecializacija() {
        return specializacija;
    }

    @Override
    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public double getAtlyginimas() {
        return atlyginimas;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public String toString() {
        return String.format("%s %s turi %d metų stažą, uždirba %.2f Eur per mėnesį", super.getVardas(),
                super.getPavarde(), stazas, atlyginimas);
    }

    @Override
    public int compareTo(Object statybininkas) {
        //return super.getVardas().compareTo(((StatybininkasImp)statybininkas).getVardas());
        return Comparator.comparing(StatybininkasImp::getVardas)
                .thenComparing(StatybininkasImp::getAtlyginimas).reversed()
                .compare(this, (StatybininkasImp) statybininkas);
    }

    public static Comparator<StatybininkasImp> nameComparator = new Comparator<StatybininkasImp>() {
        @Override
        public int compare(StatybininkasImp o1, StatybininkasImp o2) {
            return o1.getVardas().compareTo(o2.getVardas());
        }
    };

    public static Comparator<StatybininkasImp> wageComparator = new Comparator<StatybininkasImp>() {
        @Override
        public int compare(StatybininkasImp o1, StatybininkasImp o2) {
            return (int)(o2.getAtlyginimas() - o1.getAtlyginimas());
        }
    };
}
