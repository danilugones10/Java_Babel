
public class Guerrero extends Personaje{

	@Override
	public int atacar() {
		int da�oGolpe=getArma().getDa�o();
		if (getArma().getTipo()==100) {
			da�oGolpe=da�oGolpe+getDa�oEspecial();
		}
		if (getArma().getTipo()==200) {
			da�oGolpe=da�oGolpe+getDa�oEspecial();
		}
		return da�oGolpe;
	}
	
	
}
