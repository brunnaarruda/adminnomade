package br.ufrpe.brunna.adminnomades.pessoa.dominio;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;

@Entity(tableName = "tb_pessoa")
public class Pessoa {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
