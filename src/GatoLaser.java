public class GatoLaser extends Pets {

    private String tipoLaser;

    public GatoLaser(String nome, String tipoLaser) {
        super(nome);
        this.tipoLaser = tipoLaser;
    }
    @Override
    public void brincar() {
        setNivelFelicidade(getNivelFelicidade()+10);
        IO.println("Soltando laser colorido");
    }

}
