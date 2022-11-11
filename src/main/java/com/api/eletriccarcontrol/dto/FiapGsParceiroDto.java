package com.api.eletriccarcontrol.dto;

import javax.validation.constraints.NotBlank;
import javax.persistence.Column;


public class FiapGsParceiroDto {
	
    @NotBlank
    private String nm_parceiro;
    @NotBlank
    private String ds_endereco;
    @NotBlank
    private String nr_cpf;
    @NotBlank
    private String ds_email;
    @NotBlank
    private String nr_telefone;
    @NotBlank
    private String nr_rg;
    private int nr_pontos;

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
