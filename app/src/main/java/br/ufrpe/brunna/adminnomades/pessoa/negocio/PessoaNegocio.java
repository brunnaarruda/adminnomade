package br.ufrpe.brunna.adminnomades.pessoa.negocio;

import java.util.List;

import br.ufrpe.brunna.adminnomades.infra.data.Banco;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;

public class PessoaNegocio {
   public void inserirPessoa(Pessoa pessoa){
       Banco banco = Banco.getDb();
       banco.pessoaDao().inserirPessoaDao(pessoa);
   }
   public void editarPessoa(Pessoa pessoa){
       Banco banco = Banco.getDb();
       banco.pessoaDao().alterarPessoaDao(pessoa);
   }
   public void deletarPessoa(Pessoa pessoa){
       Banco banco = Banco.getDb();
       banco.pessoaDao().deletarPessoaDao(pessoa);
   }
   public List<Pessoa> listarPessoas(Pessoa pessoa){
        Banco banco = Banco.getDb();
        List<Pessoa> listaPessoa = banco.pessoaDao().getTodasPessoas();
        return listaPessoa;
    }

}
