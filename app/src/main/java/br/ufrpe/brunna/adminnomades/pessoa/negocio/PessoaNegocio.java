package br.ufrpe.brunna.adminnomades.pessoa.negocio;

import br.ufrpe.brunna.adminnomades.pessoa.dao.PessoaDao;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;

public class PessoaNegocio {
    public void List<Pessoas> recuperarNomades(Pessoa pessoa){
        PessoaDao banco = new PessoaDao();
        banco.getTodosNomes();
    }

    public void recuperarPessoaId(Pessoa pessoa){
        PessoaDao banco = new PessoaDao();
        banco.getPessoaId();
    }
    public void inserirPerfil(Pessoa pessoa){
        PessoaDao banco = new PessoaDao();
        banco.inserirPessoaDao();
    }
    public void editarPerfil(Pessoa pessoa){
        PessoaDao banco = new PessoaDao();
        banco.alterarPessoaDao();
    }
    public void deletarPerfil(Pessoa pessoa){
        PessoaDao banco = new PessoaDao();
        banco.deletarPessoaDao();
    }
}
