package br.ufrpe.brunna.adminnomades.endereco.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.ufrpe.brunna.adminnomades.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import br.ufrpe.brunna.adminnomades.endereco.negocio.EnderecoNegocio;
import br.ufrpe.brunna.adminnomades.infra.Sessao;
import br.ufrpe.brunna.adminnomades.pessoa.gui.PerfilActivity;

public class CadastrarEndereco extends AppCompatActivity {
    private TextView nomeRegistroEndereco;
    private EditText ruaRegistro;
    private EditText numeroRegistro;
    private EditText cidadeRegistro;
    private Button botaoRegistroEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_endereco);
        setTela();
        botaoRegistroEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarEndereco();
            }
        });
    }
    private void setTela(){
        nomeRegistroEndereco = findViewById(R.id.nomeRegistroEnderecoId);
        ruaRegistro = findViewById(R.id.ruaRegistroId);
        numeroRegistro = findViewById(R.id.numeroRegistroId);
        cidadeRegistro = findViewById(R.id.cidadeRegistroId);
        botaoRegistroEndereco = findViewById(R.id.botaoRegistroEnderecoId);
    }
    private void cadastrarEndereco(){
        EnderecoNegocio enderecoNegocio = new EnderecoNegocio();
        Endereco endereco = new Endereco();
        endereco.setRua(ruaRegistro.getText().toString().trim());
        endereco.setNumero(numeroRegistro.getText().toString().trim());
        endereco.setCidade(cidadeRegistro.getText().toString().trim());
        endereco.setIdPessoa(Sessao.instance.getPessoa().getId());
        enderecoNegocio.inserirEndereco(endereco);
        startActivity(new Intent(CadastrarEndereco.this, PerfilActivity.class));
        finish();
    }
}
