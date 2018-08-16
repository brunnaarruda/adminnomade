package br.ufrpe.brunna.adminnomades.endereco.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import br.ufrpe.brunna.adminnomades.endereco.negocio.EnderecoNegocio;

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


            PessoaNegocio pessoaNegocio = new PessoaNegocio();
            Pessoa pessoa = new Pessoa();
            String nome = nomeRegistro.getText().toString().trim();
            String telefone = telefoneRegistro.getText().toString().trim();
            String email = emailRegistro.getText().toString().trim();
            pessoa.setNome(nome);
            pessoa.setTelefone(telefone);
            pessoa.setEmail(email);
            finish();
    }
}
