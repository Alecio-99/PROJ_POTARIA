package com.portaria.proj.DAO;


public class PedidosEntegueDTO {

    private Long modadorId;
    private Long itensId;
    private Long statusId;
    private String apto_morador;
    private String name_produto;
    private String nome_status;

    public PedidosEntegueDTO(){

    }

    public Long getModadorId() {
        return modadorId;
    }

    public void setModadorId(Long modadorId) {
        this.modadorId = modadorId;
    }

    public Long getItensId() {
        return itensId;
    }

    public void setItensId(Long itensId) {
        this.itensId = itensId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getApto_morador() {
        return apto_morador;
    }

    public void setApto_morador(String apto_morador) {
        this.apto_morador = apto_morador;
    }

    public String getName_produto() {
        return name_produto;
    }

    public void setName_produto(String name_produto) {
        this.name_produto = name_produto;
    }

    public String getNome_status() {
        return nome_status;
    }

    public void setNome_status(String nome_status) {
        this.nome_status = nome_status;
    }

    public PedidosEntegueDTO(String apto_morador, String name_produto, String nome_status){
        this.apto_morador = apto_morador;
        this.name_produto = name_produto;
        this.nome_status = nome_status;




    }
}
