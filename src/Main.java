void main() {
    CaoVoador novocao = new CaoVoador("Zézinho", "Asa Brilhante");
    GatoLaser novogato = new GatoLaser("Joãozinho", "Laser desintegrador");
    AraraDeFogo novaarara = new AraraDeFogo("Mariazinha", "200 graus");
    IO.println(novaarara);
    IO.println(novocao);
    IO.println(novogato);
    IO.println("--------------");
    novocao.brincar();
    novogato.brincar();
    novaarara.brincar();
    IO.println("--------------");
    IO.println(novaarara);
    IO.println(novocao);
    IO.println(novogato);
}
