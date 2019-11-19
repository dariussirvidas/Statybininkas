package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.ZmogusImp;

public class StatybininkasImp extends ZmogusImp implements Statybininkas {
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
}
