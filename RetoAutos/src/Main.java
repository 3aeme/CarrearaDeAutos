public class Main {
    public static void main(String[] args) {
        int numCarriles= 3;
        int kilometros = 200;
        Juego juego = new Juego(numCarriles,kilometros,"Pista#Los Andes");
        Carro rojo= new Carro(Carro.Color.ROJO, "XX1");
        rojo.agregarConductor(new Conductor("C1", "Raul", "raul@gmail.com", "raul"));
        Carro azul= new Carro(Carro.Color.AZUL, "XX2");
        azul.agregarConductor(new Conductor("C2", "Andres", "andres@gmail.com", "andres"));
        Carro verde= new Carro(Carro.Color.Negro, "XX3");
        verde.agregarConductor(new Conductor("C3", "Pedro", "pedro@gmail.com", "pedro"));
        Carro blanco= new Carro(Carro.Color.BLANCO, "XX4");
        blanco.agregarConductor(new Conductor("C4", "Ana", "ana@gmail.com", "ana"));

        juego.agregarCarroACarril(1,rojo);
        juego.agregarCarroACarril(2,azul);
        juego.agregarCarroACarril(3,verde);
        juego.agregarCarroACarril(4,blanco);

        Podium podium =juego.iniciarJuego();
        System.out.println(podium);

    }
}