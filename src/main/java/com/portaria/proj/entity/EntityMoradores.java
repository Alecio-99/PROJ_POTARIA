package com.portaria.proj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "morador")
public class EntityMoradores {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Id
    private  Long id;
    private String name_morador;
    private  String apto_morador;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getName_morador() {
        return name_morador;
    }

    public void setName_morador(String name_morador) {
        this.name_morador = name_morador;
    }

    public String getApto_morador() {
        return apto_morador;
    }

    public void setApto_morador(String apto_morador) {
        this.apto_morador = apto_morador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityMoradores that = (EntityMoradores) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
