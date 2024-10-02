package com.portaria.proj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "itens")
public class EntityPortItens {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name_produto;
    private String apto_morador;
    private String quantidade;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private EntityStatus status_pedido;

    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    private String usuario_cadastro;

    public void setId(Long id) {
        this.id = id;
    }

    public EntityStatus getStatus_pedido() {
        return status_pedido;
    }

    public void setStatus_pedido(EntityStatus status_pedido) {
        this.status_pedido = status_pedido;
    }

    public Long getId() {
        return id;
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

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getUsuario_cadastro() {
        return usuario_cadastro;
    }

    public void setUsuario_cadastro(String usuario_cadastro) {
        this.usuario_cadastro = usuario_cadastro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityPortItens that = (EntityPortItens) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
