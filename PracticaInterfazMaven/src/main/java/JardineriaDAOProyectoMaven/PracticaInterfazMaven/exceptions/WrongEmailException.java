package JardineriaDAOProyectoMaven.PracticaInterfazMaven.exceptions;

public class WrongEmailException extends Exception{

	@Override
	public String getMessage() {
		return "Email incorrecto.";
	}

	
}
