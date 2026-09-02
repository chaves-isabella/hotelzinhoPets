import java.util.ArrayList;
import java.util.List;

public abstract class Pets {
    private String nome;
    private int nivelFelicidade;

    public Pets (String nome){
        this.nome = nome;
        this.nivelFelicidade = 50;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "nome='" + nome + '\'' +
                ", nivelFelicidade=" + nivelFelicidade +
                '}';
    }

    public abstract void brincar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelFelicidade() {
        return nivelFelicidade;
    }

    public void setNivelFelicidade(int nivelFelicidade) {
        this.nivelFelicidade = nivelFelicidade;
    }

}

