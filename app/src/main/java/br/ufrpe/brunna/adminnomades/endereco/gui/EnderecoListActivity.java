package br.ufrpe.brunna.adminnomades.endereco.gui;

import java.util.List;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import br.ufrpe.brunna.adminnomades.R;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import br.ufrpe.brunna.adminnomades.endereco.negocio.EnderecoNegocio;
import br.ufrpe.brunna.adminnomades.infra.Sessao;
import br.ufrpe.brunna.adminnomades.pessoa.gui.PerfilActivity;

public class EnderecoListActivity extends AppCompatActivity {
    private Button botaoCadastrarEndereco;
    private ListView lista;
    private List<Endereco> listaEnderecos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endereco_list);
        setTela();
    }
    private void setTela(){
        botaoCadastrarEndereco = findViewById(R.id.botaoCadastrarId);
        lista = findViewById(R.id.listaId);
        EnderecoNegocio enderecoNegocio = new EnderecoNegocio();
        listaEnderecos = enderecoNegocio.recuperarEnderecos(Sessao.instance.getPessoa());
        EnderecoAdapter adapter = new EnderecoAdapter(listaEnderecos);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editarEndereco(position);
            }
        });
        botaoCadastrarEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarEndereco();
            }
        });

    }
    private void editarEndereco(int position){
        Sessao.instance.setEndereco(listaEnderecos.get(position));
        startActivity(new Intent(EnderecoListActivity.this, AlterarEndereco.class));
        finish();
    }
    private void cadastrarEndereco(){
        startActivity(new Intent(EnderecoListActivity.this,CadastrarEndereco.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(EnderecoListActivity.this, PerfilActivity.class));
        finish();
    }
}
