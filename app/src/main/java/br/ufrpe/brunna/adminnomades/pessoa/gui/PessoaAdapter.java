package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import br.ufrpe.brunna.adminnomades.R;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import br.ufrpe.brunna.adminnomades.infra.NomadesApp;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;

public class PessoaAdapter extends ArrayAdapter<Pessoa> {
    private List<Pessoa> pessoaList;

    public PessoaAdapter(@NonNull List<Pessoa> pessoaList){
        super(NomadesApp.getContext(), R.layout.linha_pessoa, pessoaList);
        this.pessoaList = pessoaList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) NomadesApp.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.linha_pessoa, parent, false);
        TextView pessoaNome = view.findViewById(R.id.pessoaNomeId);
        pessoaNome.setText(pessoaList.get(position).getNome());
        TextView pessoaTelefone = view.findViewById(R.id.pessoaTelefoneId);
        pessoaTelefone.setText(pessoaList.get(position).getTelefone());
        TextView pessoaEmail = view.findViewById(R.id.pessoaEmailId);
        pessoaEmail.setText(pessoaList.get(position).getEmail());
        return view;
    }
}