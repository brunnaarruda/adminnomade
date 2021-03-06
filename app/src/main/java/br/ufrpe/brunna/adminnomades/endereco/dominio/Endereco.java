package br.ufrpe.brunna.adminnomades.endereco.dominio;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "tb_endereco", foreignKeys = @ForeignKey(onDelete = CASCADE, entity = Pessoa.class, parentColumns = "id",childColumns = "idPessoa"))
public class Endereco {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private int idPessoa;
    private String rua;
    private String numero;
    private String cidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
