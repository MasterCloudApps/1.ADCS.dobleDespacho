package es.codeurjc.mastercloudapps.adcs.v1.bad;

public class Hombre extends Persona {

	public void recibirPalmada(Recepcionista recepcionista) {
		System.out.println("---------- Soy un hombre lleno de vanidad");
		recepcionista.recibirPropina(3);
	}	
	
}
