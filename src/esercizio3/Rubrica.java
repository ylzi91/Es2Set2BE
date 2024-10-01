package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private String telefono;
    private String nome;
    public Map<String, String> rubs = new HashMap<>();

    public Rubrica(String nome, String telefono) {
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

    public Map<String, String> getRubs() {
        return rubs;
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "telefono='" + telefono + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
    public void nomeTel(Rubrica rub){
        rubs.put(rub.getNome(), rub.getTelefono());
    }

    public void deleteNum(String name){
        rubs.remove(name);
    }
    public void searchByName(String name){
        System.out.println(rubs.get(name));
    }

}
