package com.portaria.proj.DAO;



public class MoradoresDTO {

    private String apto_morador;

    public MoradoresDTO(){

    }

    public String getApto_morador() {
        return apto_morador;
    }

    public void setApto_morador(String apto_morador) {
        this.apto_morador = apto_morador;
    }

    public MoradoresDTO(String apto_morador){
        this.apto_morador = apto_morador;

    }
}
