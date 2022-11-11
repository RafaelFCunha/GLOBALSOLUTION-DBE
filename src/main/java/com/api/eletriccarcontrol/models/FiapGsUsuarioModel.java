package com.api.eletriccarcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="tb_fiap_gs_usuario")
public class FiapGsUsuarioModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID nr_id_user;
    @Column(nullable = false)
    private String nm_user;
    @Column(nullable = false)
    private String ds_endereco;
    @Column(nullable = false)
    private String nr_cpf;
    @Column(nullable = false)
    private String ds_email;
    @Column(nullable = false)
    private String nr_telefone;
    @Column(nullable = false)
    private String nr_rg;
    @Column(nullable = false)
    private int nr_pontos;

    public UUID getNr_id_user() {
        return nr_id_user;
    }

    public void setNr_id_user(UUID nr_id_user) {
        this.nr_id_user = nr_id_user;
    }

    public String getNm_user() {
        return nm_user;
    }

    public void setNm_user(String nm_user) {
        this.nm_user = nm_user;
    }

    public String getDs_endereco() {
        return ds_endereco;
    }

    public void setDs_endereco(String ds_endereco) {
        this.ds_endereco = ds_endereco;
    }

    public String getNr_cpf() {
        return nr_cpf;
    }

    public void setNr_cpf(String nr_cpf) {
        this.nr_cpf = nr_cpf;
    }

    public String getDs_email() {
        return ds_email;
    }

    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }

    public String getNr_telefone() {
        return nr_telefone;
    }

    public void setNr_telefone(String nr_telefone) {
        this.nr_telefone = nr_telefone;
    }

    public String getNr_rg() {
        return nr_rg;
    }

    public void setNr_rg(String nr_rg) {
        this.nr_rg = nr_rg;
    }

    public int getNr_pontos() {
        return nr_pontos;
    }

    public void setNr_pontos(int nr_pontos) {
        this.nr_pontos = nr_pontos;
    }
}
