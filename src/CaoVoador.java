public class CaoVoador extends Pets{

    private String tipoAsa;

    public CaoVoador (String nome,String tipo_asa){
        super(nome);
        this.tipoAsa = tipo_asa;
    }
    @Override
    public void brincar() {
        setNivelFelicidade(getNivelFelicidade()+ 10);
        IO.println("Voando a 300km por hora");
    }
}
