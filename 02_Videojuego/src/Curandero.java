
public class Curandero extends Personaje{

	@Override
	public int atacar() {
		int dañoGolpe=getArma().getDaño();
		if (getArma().getTipo()==400) {
			dañoGolpe=dañoGolpe+getDañoEspecial();
		}
		return 0;
	}

}
