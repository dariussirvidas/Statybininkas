package com.paveldejimas.bazine;

public interface Zmogus {
    String getLytis();
    long getAsmensKodas();
    String getVardas();
    String getPavarde();
    int getAmzius();
    int getUgis();
    String getPlaukuSpalva();
    void setAsmensKodas(long asmensKodas);
    void setVardas(String vardas);
    void setPavarde(String pavarde);
    void setAmzius(int amzius);
    void setUgis(int ugis);
    void setPlaukuSpalva(String plaukuSpalva);
}
