
public class Curandero extends Personaje{

	@Override
	public int atacar() {
		int da�oGolpe=getArma().getDa�o();
		if (getArma().getTipo()==400) {
			da�oGolpe=da�oGolpe+getDa�oEspecial();
		}
		return 0;
	}

}
