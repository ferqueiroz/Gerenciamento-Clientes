package com.queiroz.Gerenciamento_Clientes.models;

import jakarta.persistence.*;

@Entity(name = "Cliente")
@Table(name = "tb_cliente")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLI_ID")
    private Long id;
    @Column(name = "CLI_NOME")
    private String nome;
    @Column(name = "CLI_EMAIL")
    private String email;
    @Column(name = "CLI_TELEFONE")
    private String telefone;

    public ClienteModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
