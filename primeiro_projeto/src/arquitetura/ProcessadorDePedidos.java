package arquitetura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProcessadorDePedidos {
	
	static class Pedido{
		
		private String nome;
		private Double valor;
		private String endereco;
		
		public Pedido(String nome, Double valor, String endereco) {
			this.nome = nome;
			this.valor = valor;
			this.endereco = endereco;
		}
		
		public String getNome() {
			return nome;
		}
		public Double getValor() {
			return valor;
		}
		public String getEndereco() {
			return endereco;
		}
		
		public void aplicarDesconto(DescontoStrategy desconto) {
			desconto.calcularDesconto(this.getValor());
		}

		@Override
		public String toString() {
			return "Pedido [nome=" + nome + ", valor=" + valor + ", endereco=" + endereco + "]";
		}
	}
	
	interface DescontoStrategy{
		void calcularDesconto(Double valor);
	}
	static class DescontoClienteComum implements DescontoStrategy{
		@Override
		public void calcularDesconto(Double valor) {
			valor -= valor * (15 / 100);
		}
	}
	static class DescontoClienteVip implements DescontoStrategy{
		@Override
		public void calcularDesconto(Double valor) {
			valor -= valor * (50 / 100);
		}
	}
	
	interface Notificador{
		void mandarNotificacao();
	}
	static class EmailNotificador implements Notificador{
		@Override
		public void mandarNotificacao() {
			System.out.println("Email enviado!");
		}
	}
	static class SmsNotificador implements Notificador{
		@Override
		public void mandarNotificacao() {
			System.out.println("Sms enviado!");
		}
	}
	
	interface Pagamento{
		void efetuarPagamento();
	}
	static class CartaoPagamento implements Pagamento{
		@Override
		public void efetuarPagamento() {
			System.out.println("Pagamento via cartão efetuado!");
		}
	}
	static class BoletoPagamento implements Pagamento{
		@Override
		public void efetuarPagamento() {
			System.out.println("Pagamento via boleto efetuado!");
		}
	}
	static class PixPagamento implements Pagamento{
		@Override
		public void efetuarPagamento() {
			System.out.println("Pagamento via pix efetuado!");
		}
	}
	
	static class PedidoRepository{
		private String documento;

		public PedidoRepository(String documento) {
			this.documento = documento;
		}
		
		public String getDocumento() {
			return documento;
		}
		
		 void salvarPedido(String toString) throws IOException{
			 try ( FileWriter fw = new FileWriter(this.getDocumento())){
		           BufferedWriter bw = new BufferedWriter(fw);
		           bw.write(toString);
			}
		 }
	}
	
	public static void main(String[] args) throws IOException {
		
		Pedido pedido = new Pedido("MacFeliz", 50.00, "Rua jasmim, 223");
		DescontoStrategy desconto = new DescontoClienteVip();
		pedido.aplicarDesconto(desconto);
		Notificador notificar = new EmailNotificador();
		notificar.mandarNotificacao();
		Pagamento pagar = new PixPagamento();
		pagar.efetuarPagamento();
		PedidoRepository salvar = new PedidoRepository("documento.txt");
		salvar.salvarPedido(pedido.toString());
	}
	
}
