package br.ufrpe.brunna.adminnomades.endereco.negocio;

import br.ufrpe.brunna.adminnomades.infra.data.Banco;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;

public class EnderecoNegocio {
    public void inserirEndereco(Endereco endereco) {
        Banco banco = Banco.getDb();
        banco.enderecoDao().cadastrarEnderecoDao(endereco);
    }
    public void editarEndereco(Endereco endereco){
        Banco banco = Banco.getDb();
        banco.enderecoDao().editarEnderecoDao(endereco);
    }
    public void deletarEndereco(Endereco endereco){
        Banco banco = Banco.getDb();
        banco.enderecoDao().deletarEnderecoDao(endereco);
    }
}
