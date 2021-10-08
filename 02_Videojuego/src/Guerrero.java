
public class Guerrero extends Personaje{

	@Override
	public int atacar() {
		int dañoGolpe=getArma().getDaño();
		if (getArma().getTipo()==100) {
			dañoGolpe=dañoGolpe+getDañoEspecial();
		}
		if (getArma().getTipo()==200) {
			dañoGolpe=dañoGolpe+getDañoEspecial();
		}
		return dañoGolpe;
	}
	
	
}
