public class App {
    public static void main(String[] args) throws Exception {

        TransporteFactory combustaoFactory = new CombustaoFactory();
        Carro carro = combustaoFactory.criarCarro();
        Moto moto = combustaoFactory.criarMoto();

        carro.exibirInfoCarro();
        moto.exibirInfoMoto();

        TransporteFactory eletricaFactory = new EletricaFactory();
        carro = eletricaFactory.criarCarro();
        moto = eletricaFactory.criarMoto();

        carro.exibirInfoCarro();
        moto.exibirInfoMoto();
    }
}
