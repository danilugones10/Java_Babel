
public class Mago extends Personaje{

	@Override
	public int atacar() {
		int da�oGolpe=getArma().getDa�o();
		if (getArma().getTipo()==300) {
			da�oGolpe=da�oGolpe+getDa�oEspecial();
		}
		return da�oGolpe;
	}

}
