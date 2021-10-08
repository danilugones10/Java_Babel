
public class Mago extends Personaje{

	@Override
	public int atacar() {
		int dañoGolpe=getArma().getDaño();
		if (getArma().getTipo()==300) {
			dañoGolpe=dañoGolpe+getDañoEspecial();
		}
		return dañoGolpe;
	}

}
