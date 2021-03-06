package br.ufrpe.brunna.adminnomades.pessoa.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import android.arch.persistence.room.Dao;
import java.util.List;

@Dao
public interface PessoaDao {
    @Query("SELECT * FROM tb_pessoa")
    public  List<Pessoa> getTodasPessoas();

    @Insert
    void inserirPessoaDao(Pessoa pessoa);

    @Update
    void alterarPessoaDao(Pessoa pessoa);

    @Delete
    void deletarPessoaDao(Pessoa pessoa);
}
