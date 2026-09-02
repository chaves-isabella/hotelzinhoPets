public class AraraDeFogo extends Pets {

    private String temperaturaFogo;

    public AraraDeFogo(String nome, String temperaturaFogo) {
        super(nome);
        this.temperaturaFogo = temperaturaFogo;
    }
    @Override
    public void brincar() {
        setNivelFelicidade(getNivelFelicidade()+10);
        IO.println("Labareda de chamas coloridas");
    }
}
