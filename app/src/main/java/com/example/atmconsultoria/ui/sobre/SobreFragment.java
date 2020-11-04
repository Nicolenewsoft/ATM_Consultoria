package com.example.atmconsultoria.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
                "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
                "sunt in culpa qui officia deserunt mollit anim id est laborum.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");


        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("barrosnicole094@gmail.com", "Envie um email")
                .addWebsite("https://www.google.com.br/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("nicole.barros.7739", "Facebook")
                .addInstagram("nicolebarros_", "Instagram")
                .addGitHub("Nicolenewsoft", "GitHub")
                .addItem(versao)
                .create();



        //return inflater.inflate(R.layout.fragment_sobre, container, false);

    }

}
