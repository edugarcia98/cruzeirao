package sistema.modelos;

import java.util.List;

public class PartidaFutebol 
{
	private List <Gol> golsMandantes;
	private List <Gol> golsVisitantes;
	private List <Gol> golsPenaltyMandantes;
	private List <Gol> golsPenaltyVisitantes;
	private List <Cartao> cartoesMandantes;
	private List <Cartao> cartoesVisitantes;
	
	//gets e sets
	public List<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	public void setGolsMandantes(List<Gol> golsMandantes) {
		this.golsMandantes = golsMandantes;
	}
	public List<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void setGolsVisitantes(List<Gol> golsVisitantes) {
		this.golsVisitantes = golsVisitantes;
	}
	public List<Gol> getGolsPenaltyMandantes() {
		return golsPenaltyMandantes;
	}
	public void setGolsPenaltyMandantes(List<Gol> golsPenaltyMandantes) {
		this.golsPenaltyMandantes = golsPenaltyMandantes;
	}
	public List<Gol> getGolsPenaltyVisitantes() {
		return golsPenaltyVisitantes;
	}
	public void setGolsPenaltyVisitantes(List<Gol> golsPenaltyVisitantes) {
		this.golsPenaltyVisitantes = golsPenaltyVisitantes;
	}
	public List<Cartao> getCartoesMandantes() {
		return cartoesMandantes;
	}
	public void setCartoesMandantes(List<Cartao> cartoesMandantes) {
		this.cartoesMandantes = cartoesMandantes;
	}
	public List<Cartao> getCartoesVisitantes() {
		return cartoesVisitantes;
	}
	public void setCartoesVisitantes(List<Cartao> cartoesVisitantes) {
		this.cartoesVisitantes = cartoesVisitantes;
	}
	
	
}
