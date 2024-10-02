package com.portaria.proj.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidoEntregue")
public class EntityEntregue {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "morador_id")
    private EntityMoradores moradores;

    @Column(name = "apto_morador")
    private String apto_morador;

    @ManyToOne
    @JoinColumn(name = "itens_id")
    private EntityPortItens itens;

    @Column(name = "nome_pedido")
    private  String nome_pedido;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private EntityStatus status;

    @Column(name = "nome_status")
    private String nome_status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntityMoradores getMoradores() {
        return moradores;
    }

    public void setMoradores(EntityMoradores moradores) {
        this.moradores = moradores;
    }

    public String getApto_morador() {
        return apto_morador;
    }

    public void setApto_morador(String apto_morador) {
        this.apto_morador = apto_morador;
    }

    public EntityPortItens getItens() {
        return itens;
    }

    public void setItens(EntityPortItens itens) {
        this.itens = itens;
    }

    public String getNome_pedido() {
        return nome_pedido;
    }

    public void setNome_pedido(String nome_pedido) {
        this.nome_pedido = nome_pedido;
    }

    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    public String getNome_status() {
        return nome_status;
    }

    public void setNome_status(String nome_status) {
        this.nome_status = nome_status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityEntregue that = (EntityEntregue) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
