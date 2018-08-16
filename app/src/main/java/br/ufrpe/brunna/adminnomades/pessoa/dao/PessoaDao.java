package br.ufrpe.brunna.adminnomades.pessoa.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import java.util.List;

public interface PessoaDao {
    @Query("SELECT * FROM tb_pessoa")
    public List<Pessoa> getTodosNomes();

    @Query("SELECT * FROM tb_pessoa WHERE id = :id")
    public List<Pessoa> getPessoaId(String id);

    @Insert
    void inserirPessoaDao(Pessoa pessoa);

    @Update
    void alterarPessoaDao(Pessoa pessoa);

    @Delete
    void deletarPessoaDao(Pessoa pessoa);
}
