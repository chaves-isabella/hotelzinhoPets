void main() {

   Pets[] listarPets = new Pets[3];

    listarPets [0] = new CaoVoador("Zézinho", "Asa Brilhante");
    listarPets [1] = new GatoLaser("Joãozinho", "Laser desintegrador");
    listarPets [2] = new AraraDeFogo("Mariazinha", "200 graus");

    for (int i = 0; i < listarPets.length; i++) {
        IO.println(listarPets[0]);
        IO.println(listarPets[1]);
        IO.println(listarPets[2]);
        IO.println("--------------");
        listarPets[0].brincar();
        listarPets[1].brincar();
        listarPets[2].brincar();
        IO.println("--------------");
        IO.println(listarPets[0]);
        IO.println(listarPets[1]);
        IO.println(listarPets[2]);
    }
}
