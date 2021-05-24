package pratica;

public class Corretor {

	private String cresci;
	private Double corretagem;
	
	public Corretor(String cresci, Double corretagem) {
		super();
		this.cresci = cresci;
		this.corretagem = corretagem;
	}

	public String getCresci() {
		return cresci;
	}

	public void setCresci(String cresci) {
		this.cresci = cresci;
	}

	public Double getCorretagem() {
		return corretagem;
	}

	public void setCorretagem(Double corretagem) {
		this.corretagem = corretagem;
	}
	
	
}
