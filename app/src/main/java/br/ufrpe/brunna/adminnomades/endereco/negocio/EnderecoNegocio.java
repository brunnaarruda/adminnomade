package br.ufrpe.brunna.adminnomades.endereco.negocio;

import br.ufrpe.brunna.adminnomades.endereco.dao.EnderecoDao;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;

public class EnderecoNegocio {
    public void inserirEndereco(Endereco endereco) {
        EnderecoDao banco = new EnderecoDao();
        banco.cadastrarEnderecoDao(endereco);
    }
    public void editarEndereco(Endereco endereco){
        EnderecoDao banco = new EnderecoDao();
        banco.editarEnderecoDao(endereco);
    }
    public void deletarEndereco(Endereco endereco){
        EnderecoDao banco = new EnderecoDao;
        banco.deletarEnderecoDao(endereco);
    }
}
