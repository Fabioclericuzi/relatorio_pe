package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enuns.StatusPedido;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date hrCompra;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItensPedido> itens = new ArrayList();
	
	public Pedido(Date hrCompra, StatusPedido status, Cliente cliente) {
		this.hrCompra = hrCompra;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getHrCompra() {
		return hrCompra;
	}

	public void setHrCompra(Date hrCompra) {
		this.hrCompra = hrCompra;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(ItensPedido item) {
		itens.add(item);
	}
	public void removeItem(ItensPedido item) {
		itens.remove(item);
	}

	public List<ItensPedido> getItens() {
		return itens;
	}

	public double total() {
		double sum = 0.0;
		for (ItensPedido item : itens) {
			sum += item.subtotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hora do pedido: ");
		sb.append(sdf.format(hrCompra) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido: \n ");
		for(ItensPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Valor total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
		
		
	}
	
	
}

	
