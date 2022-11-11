package com.api.eletriccarcontrol.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="tb_fiap_gs_parceiro")
public class FiapGsParceiroModel {
    private static final long serialVersionUID = 1L;

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID nr_id_parceiro;
    @Column(nullable = false)
    private String nm_parceiro;
    @Column(nullable = false)
    private String ds_endereco;
    @Column(nullable = false)
    private String nr_cnpj;
    @Column(nullable = false)
    private String ds_email;
    @Column(nullable = false)
    private String nr_telefone;
    @Column(nullable = false)
    private String nr_rg;
    @Column(nullable = false)
    private int nr_pontos;

    public UUID getNr_id_parceiro() {
        return nr_id_parceiro;
    }

    public void setNr_id_parceiro(UUID nr_id_parceiro) {
        this.nr_id_parceiro = nr_id_parceiro;
    }

    public String getNm_parceiro() {
        return nm_parceiro;
    }

    public void setNm_parceiro(String nm_parceiro) {
        this.nm_parceiro = nm_parceiro;
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


