package br.ufrpe.brunna.adminnomades.infra;

import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import java.util.HashMap;
import java.util.Map;


public class Sessao {
    public static final Sessao instance = new Sessao();
    private final Map<String, Object> values = new HashMap<>();

    private Sessao(){}

    public Endereco getEndereco(){
        return(Endereco) values.get("sessao.endereco");
    }

    public void setEndereco(Endereco endereco){
        setValue("sessao.endereco",endereco);
    }

    public void resetEndereco(){setEndereco(null);}

    public void setPessoa(Pessoa pessoa){
        setValue("sessao.pessoa", pessoa);
    }

    public Pessoa getPessoa(){
        return (Pessoa) values.get("sessao.pessoa");
    }

    private void setValue(String key, Object value){
        values.put(key, value);
    }

    public void resetPessoa(){
        setPessoa(null);
    }
}