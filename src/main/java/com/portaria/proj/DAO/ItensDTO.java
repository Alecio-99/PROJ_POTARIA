package com.portaria.proj.DAO;

public class ItensDTO {

    private String name_produto;

    public ItensDTO(){

    }

    public String getName_produto() {
        return name_produto;
    }

    public void setName_produto(String name_produto) {
        this.name_produto = name_produto;
    }

    public ItensDTO(String name_produto){
        this.name_produto = name_produto;


    }
}
