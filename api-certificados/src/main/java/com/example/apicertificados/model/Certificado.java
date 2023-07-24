package com.example.apicertificados.model;

import jakarta.persistence.*;

@Entity
public class Certificado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Curso curso_fk;

    @OneToOne
    private Participante participante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Curso getCurso_fk() {
        return curso_fk;
    }

    public void setCurso_fk(Curso curso_fk) {
        this.curso_fk = curso_fk;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Certificado that = (Certificado) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
