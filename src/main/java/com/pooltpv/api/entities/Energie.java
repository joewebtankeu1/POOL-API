package com.pooltpv.api.entities;

public class Energie {
    private String codeEnergie;
    private String libeEnergie;

    public Energie() {
    }

    public Energie(String libeEnergie) {
        this.libeEnergie = libeEnergie;
    }

    public Energie(String codeEnergie, String libeEnergie) {
        this.codeEnergie = codeEnergie;
        this.libeEnergie = libeEnergie;
    }



    public String getCodeEnergie() {
        return codeEnergie;
    }

    public String getLibeEnergie() {
        return libeEnergie;
    }

    public void setCodeEnergie(String codeEnergie) {
        this.codeEnergie = codeEnergie;
    }

    public void setLibeEnergie(String libeEnergie) {
        this.libeEnergie = libeEnergie;
    }
}
