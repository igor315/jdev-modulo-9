package aula.poo;
/**
 * Live extra do professor Alex do curso Jdev Treinamentos sobre Orientação a Objetos na prática
 */
import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação Objeto");
		produto1.setValor(BigDecimal.valueOf(99.90));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Módulo Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Módulo Spring Boot API REST");
		produto3.setValor(BigDecimal.valueOf(300));
		
		Produto produto4 = new Produto();
		produto4.setId(3L);
		produto4.setNome("Módulo Hibernate");
		produto4.setValor(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Igor Santos");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.addProduto(produto3);
		venda.addProduto(produto4);
		
		venda.getValorTotal();
		
//		System.out.println("Descricao da Venda : " + venda.getDescricaoVenda() + " e o total: " + venda.getValorTotal());
		
		System.out.println("Valor da variável total venda: " + venda.getValorTotal());
	}

}
