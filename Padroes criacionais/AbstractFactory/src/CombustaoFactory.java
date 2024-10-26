public class CombustaoFactory implements TransporteFactory {
    @Override
    public Carro criarCarro() {
        return new CarroCombustao();
    }

    @Override
    public Moto criarMoto() {
        return new MotoCombustao();
    }
}
