public class EletricaFactory implements TransporteFactory {
    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }

    @Override
    public Moto criarMoto() {
        return new MotoEletrica();
    }
}
