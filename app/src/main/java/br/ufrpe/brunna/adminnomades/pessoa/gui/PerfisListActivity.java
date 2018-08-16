package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R;

import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import br.ufrpe.brunna.adminnomades.pessoa.negocio.PessoaNegocio;

public class PerfisListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfis_list);

    }
    private void mostrarTodos(){
        PessoaNegocio pessoaNegocio = new PessoaNegocio();
        Pessoa pessoa = new Pessoa();
    }
}
