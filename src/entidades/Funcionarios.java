package entidades;

public class Funcionarios {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionarios(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void PorcetagemDeAumento(double porcetagem){
		salario = salario + salario*porcetagem/100; 
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Dados do funcionario\n id: " + id + ", nome: " + nome + ", salario: " + String.format("%.2f", salario)+"\n";
	}
	
}
