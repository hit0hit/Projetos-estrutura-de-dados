package Aula03;

public class Ex005Bilhetes {
    public int Id;
    public String Nome;
    public boolean Cancelado;

    public Ex005Bilhetes(int id, String nome) {
        this.Id = id;
        this.Nome = nome;
        this.Cancelado = false;
    }

    public String GetBilhete() {
        String string = "#" + Id + " - " + Nome;
        return string;
    }

}