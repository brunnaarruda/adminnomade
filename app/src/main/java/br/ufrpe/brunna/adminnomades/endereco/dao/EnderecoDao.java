package br.ufrpe.brunna.adminnomades.endereco.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;

@Dao
public interface EnderecoDao {
    @Query("SELECT * FROM tb_endereco WHERE idPessoa = :idPessoa")
    public List<Endereco> getTodosEnderecos(int idPessoa);

    @Insert
    void cadastrarEnderecoDao(Endereco endereco);

    @Delete
    void deletarEnderecoDao(Endereco endereco);

    @Update
    void editarEnderecoDao(Endereco endereco);
}
