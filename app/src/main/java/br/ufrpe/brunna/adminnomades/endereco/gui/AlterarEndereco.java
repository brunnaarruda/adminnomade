package br.ufrpe.brunna.adminnomades.endereco.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import br.ufrpe.brunna.adminnomades.R;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import br.ufrpe.brunna.adminnomades.endereco.negocio.EnderecoNegocio;
import br.ufrpe.brunna.adminnomades.infra.Sessao;

public class AlterarEndereco extends AppCompatActivity {
    private TextView nomeAlterarEndereco;
    private EditText ruaAlterar;
    private EditText numeroAlterar;
    private EditText cidadeAlterar;
    private Button botaoAlterarEndereco;
    private Button botaoDeletarEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_endereco);
        setTela();
        botaoAlterarEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alterarEndereco();
            }
        });
        botaoDeletarEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deletarEndereco();
            }
        });
    }
    private void setTela(){
        nomeAlterarEndereco = findViewById(R.id.nomeEditarEnderecoId);
        ruaAlterar = findViewById(R.id.ruaEditarId);
        numeroAlterar = findViewById(R.id.numeroEditarId);
        cidadeAlterar = findViewById(R.id.cidadeEditarId);
        botaoAlterarEndereco = findViewById(R.id.botaoEditarEnderecoId);
        botaoDeletarEndereco = findViewById(R.id.botaoDeletarEnderecoId);
    }
    private void alterarEndereco(){
        Endereco endereco = new Endereco();
        EnderecoNegocio enderecoNegocio = new EnderecoNegocio();
        endereco.setRua(ruaAlterar.getText().toString().trim());
        endereco.setNumero(numeroAlterar.getText().toString().trim());
        endereco.setCidade(cidadeAlterar.getText().toString().trim());
        enderecoNegocio.editarEndereco(endereco);
        startActivity(new Intent(AlterarEndereco.this, EnderecoListActivity.class));
        finish();
    }
    private void deletarEndereco(){
        EnderecoNegocio enderecoNegocio = new EnderecoNegocio();
        enderecoNegocio.deletarEndereco(Sessao.instance.getEndereco());
        startActivity(new Intent(AlterarEndereco.this, EnderecoListActivity.class));
        finish();
    }
}
