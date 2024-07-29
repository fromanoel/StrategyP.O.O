public class App {
    public static void main(String[] args) throws Exception {

        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        
        DescontoStrategy descontoStrategy = new DescontoClienteVIP();

        calculadoraDescontos.setDescontoStrategy(descontoStrategy);

        calculadoraDescontos.valorConsumo(1000);

        







        descontoStrategy = new DescontoClienteRegular();

        calculadoraDescontos.setDescontoStrategy(descontoStrategy);
        
        calculadoraDescontos.valorConsumo(1200);

        descontoStrategy = new DescontoFuncionario();

        calculadoraDescontos.setDescontoStrategy(descontoStrategy);
        
        calculadoraDescontos.valorConsumo(200);

    }
}
