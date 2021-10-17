package negocio;

import java.util.List;

import entidad.Coche;
import persistencia.PersonalDaoMySql;
import persistencia.interfaces.DaoCoche;

public class GestorCoche {

		DaoCoche cocheDao=new PersonalDaoMySql();
			
		public boolean alta(Coche p) {
			if((p.getMatricula().length() == 7)&&(p.getMarca().length()>0)&&(p.getModelo().length()>0)) {
				boolean alta = cocheDao.alta(p);
				return alta;
			}
			return false;
		}
		
		public boolean baja(String matricula) {
			boolean baja = cocheDao.baja(matricula);
			return baja;
		}
		
		public Coche obtener(String matricula) {
			Coche coche=cocheDao.obtener(matricula);
			return coche;
		}
		
		public boolean modificar(Coche p) {
			if((p.getMatricula().length() == 7)&&(p.getMarca().length()>0)&&(p.getModelo().length()>0)) {
				boolean modificado = cocheDao.modificar(p);
				return modificado;
			}
			return false;
		}
		
		public List<Coche> listar() {
			List<Coche> listaCoches= cocheDao.listar(); 
			return listaCoches;
		}

}
