CREATE TABLE tb_fiap_gs_usuario (
    nr_id_user   INTEGER NOT NULL,
    nm_user      VARCHAR2(32 CHAR) NOT NULL,
    ds_endereco  VARCHAR2(100 CHAR) NOT NULL,
    nr_cpf       INTEGER NOT NULL,
    ds_email     VARCHAR2(50 CHAR) NOT NULL,
    nr_telefone  INTEGER,
    nr_rg        INTEGER,
    nr_pontos    INTEGER
);

ALTER TABLE tb_fiap_gs_usuario ADD CONSTRAINT tb_fiap_gs_usuario_pk PRIMARY KEY ( nr_id_user );

CREATE TABLE tb_fiap_gs_parceiro (
    nr_id_parceiro      INTEGER NOT NULL,
    nr_cnpj             INTEGER NOT NULL,
    dt_inicio_parceria  DATE NOT NULL,
    dt_termino          DATE NOT NULL,
    ds_endereco         VARCHAR2(100 CHAR) NOT NULL,
    nm_parceiro         VARCHAR2(32),
    nr_telefone         INTEGER
);

ALTER TABLE tb_fiap_gs_parceiro ADD CONSTRAINT tb_fiap_gs_parceiro_pk PRIMARY KEY ( nr_id_parceiro );

-------------------------------------

insert into tb_fiap_gs_usuario(nr_id_user,nm_user,ds_endereco,nr_cpf,ds_email,nr_telefone,nr_rg,nr_pontos) values(1, 'RAFAEL', 'AVENIDA VILA EMA', 12345678912, 'RFCUNHA7@GMAIL.COM', NULL, NULL, 0);

  INSERT INTO tb_fiap_gs_parceiro (nr_id_parceiro ,nr_cnpj,dt_inicio_parceria,dt_termino,ds_endereco,nm_parceiro,nr_telefone) 
  VALUES (1, 38901193, DATE '2022-11-01', DATE '2089-11-01', 'AVENIDA VILA EMA', 'SHELL', 991223809);
