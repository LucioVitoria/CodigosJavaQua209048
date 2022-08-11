package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;



public class Program {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in).useLocale(Locale.US);
        
		Carro carro;
        Cliente cliente; 
       
       ArrayList<Carro> carros = new ArrayList<>();
       char opt;
       
       System.out.println("Deseja Cadastrar um veiculo?(s/n): ");
       opt = sc.next().charAt(0);
       
       while(Character.toLowerCase(opt) == 's') {
       
       
       try {
    	  carro = new Carro();
    	   cliente = new Cliente();
    	   
       System.out.print("Entre com o nome do cliente: ");
       cliente.setNome(sc.nextLine());
       
       System.out.print("Entre com o Telefone do cliente: ");
       cliente.setTelefone(sc.nextLine());
       
       System.out.print("Entre com o entereço do cliente: ");
       cliente.setEndereco(sc.nextLine());
       
       System.out.print("Entre com o CPF do cliente: ");
       cliente.setCpf(sc.nextLine());
       
       
       carro.setCliente(cliente);
       
       System.out.println("\n****Veiculo****\n");
       
       
       System.out.print("Entre com o modelo do Veiculo: ");
       carro.setModelo(sc.nextLine());
       
       
       System.out.print("Entre com o ano do Veiculo: ");
       carro.setAno(sc.nextInt());
      
       
       
       sc.nextLine();
       System.out.print("Entre com a cor do Veiculo: ");
       carro.setCor(sc.nextLine());
       
       System.out.print("Entre com o tipo do Veiculo (hatch/sedan/camin) : ");
       carro.setTipo(sc.nextLine());
       
       System.out.print("Veiculo novo ou usado: ");
       carro.setEstadoConservacao(sc.nextLine());
       
       
       System.out.print("Entre com o tipo do cambio (m/a): ");
       carro.setCambio(sc.next().charAt(0));
       
       System.out.print("Entre com o Tipo do combustivel: ");
       carro.setTipoCombustivel(sc.next().charAt(0));
       
       System.out.print("Entre com o valor do Veiculo: ");
       carro.ValorCompra(sc.nextDouble());
       
       System.out.println("Dados do carro cadastrado com o valor de venda:\n");
      // System.out.println(carro);
       
       
       carros.add(carro);
       
       }catch (Exception e) {
    	   System.out.println(e.getMessage());
       }
       
       
       
       
	System.out.println("Deseja Cadastrar um veiculo?(s/n): ");
       opt = sc.next().charAt(0);
       }
       
      //System.out.println(carros.get(0));
       
       for(Carro listaCarros : carros) {
    	   System.out.println(listaCarros);
       }
       
	   System.out.println("ok! nao quer cadastrar tudo bem.");
       
       sc.close();
	
	}
}
