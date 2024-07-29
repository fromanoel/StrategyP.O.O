public class CalculadoraDescontos {
    
    private DescontoStrategy descontoStrategy;

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public Double valorConsumo(double consumo){
        return descontoStrategy.calcularDesconto(consumo);
    }
}
