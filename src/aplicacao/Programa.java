package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItensPedido;
import entidades.Pedido;
import entidades.Produto;
import enuns.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dtNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dtNascimento);
		
		System.out.println("Dados do pedido: ");
		System.out.print("Status do pedido: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens nesse pedido: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Item #" + i + "Dados do item: ");
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String NomeProduto = sc.nextLine();
			System.out.println("Preço do produto: ");
			double PrecoProduto = sc.nextDouble();
			
			Produto produto = new Produto(NomeProduto, PrecoProduto);
			
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItensPedido itenspedido = new ItensPedido(quantidade, PrecoProduto,produto);
			
			pedido.addItem(itenspedido);
			
			
		}
		System.out.println();
		System.out.println("Relatório do pedido: ");
		System.out.println(pedido);
		
		sc.close();
		
	}

}
