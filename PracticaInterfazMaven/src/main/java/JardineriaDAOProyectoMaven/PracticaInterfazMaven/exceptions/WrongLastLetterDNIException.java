package JardineriaDAOProyectoMaven.PracticaInterfazMaven.exceptions;

public class WrongLastLetterDNIException extends Exception{

	@Override
	public String getMessage() {
		return "El ultimo digito tiene que ser una letra, la 'ñ' esta excluida.";
	}
}
