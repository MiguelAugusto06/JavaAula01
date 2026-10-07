import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Operadores relacionais:  > < >= <=
        //boolean teste = 11 >= 15;
        //System.out.println(teste);

        //Operadores booleanos (logicos)
        // V and V = V (&&)
        // F or V = V (||)

        //boolean comparador = 10 > 5 || 10 < 5;
        //System.out.println(comparador);

        //EXERCÍCIO - 01 - Ficha RH

//        String nome = "Paulo";
//        String cargo = "Recepcionista";
//        int idade = 26;
//
//        System.out.println("---Ficha do funcionário---");
//        System.out.println("Nome: " + nome);
//        System.out.println("Idade: " + idade);
//        System.out.println("Cargo: " + cargo);
//
//        //EXERCÍCIO - 02 - Área do terreno
//
//        double largura = 25;
//        double comprimento = 50;
//        double area;
//        area = (largura * comprimento) / 2;
//
//        System.out.println("A área do seu terreno é de " + area + " metros quadrados.");
//
//        //EXERCÍCIO - 03 - Conversor de moedas
//
//        double valorConvertido = 1000;
//        double valorEmDol;
//        valorEmDol = valorConvertido * 4.98; // não esquecer o "."
//
//        System.out.println("Você converteu " + valorConvertido + "R$ em " + valorEmDol + " dólares.");

        //EXERCÍCIO - 04

//        double vComanda = 235.99;
//        double taxa;
//        taxa = vComanda / 10;
//        double vPago;
//        vPago = vComanda + taxa;

//        System.out.println("O valor a ser pago é " + vPago + " R$");
//        System.out.println("A taxa de serviço cobrada foi de: " + taxa + " R$ sobre o valor de: " + vComanda + "R$");

        //5. Folha de Pagamento

//        double valorHora = 10.5;
//        int horasTrabalhadas = 60;
//        double salarioBruto;
//        salarioBruto = valorHora * horasTrabalhadas;
//        double taxa;
//        taxa = salarioBruto * 0.06;
//        double salarioLiquido;
//        salarioLiquido = salarioBruto - taxa;
//
//        System.out.println("O salário desse mês foi de: " + salarioLiquido + " R$");

        //6. Consumo logistica

//        double distancia = 100;
//        double consumo;
//        consumo = distancia * 3;
//
//        System.out.println("O consumo será de: " + consumo + " L");
//
//        double preco = 5;
//        double custoTransporte;
//        custoTransporte = consumo * preco;
//        System.out.println("O custo do transporte será de: " + custoTransporte);

        //7. organizaçao de estoque

//        int pecas = 767;
//        int capacidadeCaixa = 30;
//        double caixasUsadas = pecas / 30;
//        System.out.println("Foram usadas: " + caixasUsadas + " caixas");
//
//        int pecasFora;
//        pecasFora = pecas % capacidadeCaixa;
//        System.out.println( + pecasFora + " Peças ficaram de fora");

        //9. Precificação em cascata

//        double custoDeProducao = 70.7;
//        double imposto = custoDeProducao * 0.2;
//        double custoLiquido = custoDeProducao - imposto;
//        double margemDeLucro = (custoDeProducao - imposto) + (custoDeProducao * 0.15);
//        double custoFinal = custoDeProducao + margemDeLucro;
//        System.out.println("Custo inicial: R$" + custoDeProducao);
//        System.out.println("Imposto: R$" + imposto);
//        System.out.println("Preço final: R$" + custoFinal);

        //10. conversor de segundos

        int segundosTotais = 23456;
        int horas = segundosTotais / 3600;
        int minutos = segundosTotais % 60;
        LocalTime tempo = LocalTime.of(horas, minutos);
        System.out.println(tempo);

//        LocalDateTime tempo = LocalDateTime.now();
//        System.out.println(tempo);


//        int minutos = segundos % 60;
//        System.out.println(minutos + " Minutos");
//
//        int horas = segundos / 3600;
//        System.out.println(horas + " Horas");
//
//        int segundosSobrando = (segundos % 3600) / 60;
//        System.out.println(segundosSobrando + " Segundos");

//        double minutos = segundos / 60;
//        System.out.println(minutos + " Minutos");
//
//        double horas = minutos / 60;
//        System.out.println(horas + " Horas");



    }
}
