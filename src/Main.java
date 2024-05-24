import Classes.*;
import Interfaces.Forma;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        ArrayList<String> lista = new ArrayList();
        lista.add("coisa coisada");
        lista.add("coisa não muito coisada mas ainda assim coisada");
        lista.forEach(System.out::println);
        System.out.println("2 e 3");
        Cachorro cachorro1 = new Cachorro("Mel");
        Animal animal = new Animal();
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Classes.Cachorro.
        } else {
            System.out.println("O objeto não é um Classes.Cachorro.");
        }
        System.out.println("4");
        Produto produto1 = new Produto("Sabão",5.99);
        Produto produto2 = new Produto("Refrigerante",11.99);
        Produto produto3 = new Produto("Caneta",1.50);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double soma = 0;
        for(int i=0; i<listaProdutos.size();i++){
            soma += listaProdutos.get(i).getPreco();
        }
        System.out.println(soma);
        double media = soma / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + media);

        System.out.println("5");
        ArrayList<Forma> listaFormas = new ArrayList<>();

        Forma circulo1 = new Circulo(3);
        Forma quadrado1 = new Quadrado(5);
        Forma circulo2 = new Circulo(10);

        listaFormas.add(circulo1);
        listaFormas.add(circulo2);
        listaFormas.add(quadrado1);
        for(int i=0; i<listaFormas.size(); i++){
            System.out.println("Area da forma: "+(i+1)+" "+listaFormas.get(i).calcularArea());

        }

        System.out.println("6");
        ContaBancaria conta1 = new ContaBancaria(43976,50.31);
        ContaBancaria conta2 = new ContaBancaria(29384, 103.09);
        ContaBancaria conta3 = new ContaBancaria(38109,8020.83);
        ContaBancaria conta4 = new ContaBancaria(90213,2083720849);
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);
        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("A conta com maior saldo é : "+contaMaiorSaldo.getId());
    }
}