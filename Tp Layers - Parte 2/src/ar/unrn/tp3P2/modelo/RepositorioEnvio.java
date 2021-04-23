package ar.unrn.tp3P2.modelo;

public interface RepositorioEnvio {
	
	void enviar(String destinatarioEmail, String tituloEmail, String cuerpoEmail);
	
}
