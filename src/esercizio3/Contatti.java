package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Contatti{
    private String telefono;
    private String nome;

    public Contatti(String nome, String telefono) {
        this.nome = nome;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Rubrica{" +
                "telefono='" + telefono + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }


}
