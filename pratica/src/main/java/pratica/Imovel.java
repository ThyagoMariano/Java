package pratica;

public class Imovel {

		private String registro;
		private Double aluguel;
		private boolean alugado;
		
		public Imovel(String registro, Double aluguel, boolean alugado) {
			super();
			this.registro = registro;
			this.aluguel = aluguel;
			this.alugado = alugado;
		}

		public String getRegistro() {
			return registro;
		}

		public void setRegistro(String registro) {
			this.registro = registro;
		}

		public Double getAluguel() {
			return aluguel;
		}

		public void setAluguel(Double aluguel) {
			this.aluguel = aluguel;
		}

		public boolean isAlugado() {
			return alugado;
		}

		public void setAlugado(boolean alugado) {
			this.alugado = alugado;
		}
		
		
}
