package JardineriaDAOProyectoMaven.PracticaInterfazMaven.exceptions;

public class DuplicateCodeException extends Exception{
	@Override
	public String getMessage() {
		return "El codigo ya esta siendo utilizado.";
	}
}
