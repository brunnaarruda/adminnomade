package br.ufrpe.brunna.adminnomades.infra.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import br.ufrpe.brunna.adminnomades.endereco.dao.EnderecoDao;
import br.ufrpe.brunna.adminnomades.infra.NomadesApp;
import br.ufrpe.brunna.adminnomades.pessoa.dao.PessoaDao;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;

@Database(entities = {Endereco.class, Pessoa.class},version = 1)
public abstract class Banco extends RoomDatabase{
    private static Banco instance;

    public abstract EnderecoDao enderecoDao();
    public abstract PessoaDao pessoaDao();

    public static Banco getDb() {
        if (instance == null) {
            instance = Room.inMemoryDatabaseBuilder(NomadesApp.getContext(), Banco.class).allowMainThreadQueries().build();
        }
        return instance;
    }
}