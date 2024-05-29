package dias.matheus;

import java.util.ArrayList;

public class Aparelho {

    private Long id;

    private ArrayList<Peca> pecas;

    private String nome;

    public Aparelho() {}

    public Aparelho(Long id, ArrayList<Peca> pecas, String nome) {
        this.id = id;
        this.pecas = pecas;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aparelho{" +
                "id=" + id +
                ", pecas=" + pecas +
                ", nome='" + nome + '\'' +
                '}';
    }
}
