package br.com.projeto.api.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
    public String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
