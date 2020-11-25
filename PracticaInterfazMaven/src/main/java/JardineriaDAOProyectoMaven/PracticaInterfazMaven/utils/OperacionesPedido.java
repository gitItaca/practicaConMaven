package JardineriaDAOProyectoMaven.PracticaInterfazMaven.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import JardineriaDAOProyectoMaven.PracticaInterfazMaven.dao.ClienteDao;
import JardineriaDAOProyectoMaven.PracticaInterfazMaven.exceptions.ClientNotFoundException;
import JardineriaDAOProyectoMaven.PracticaInterfazMaven.exceptions.WrongFechaMinimaPedidoException;
import JardineriaDAOProyectoMaven.PracticaInterfazMaven.exceptions.WrongOrderDayCreationException;
import JardineriaDAOProyectoMaven.PracticaInterfazMaven.model.Cliente;
import JardineriaDAOProyectoMaven.PracticaInterfazMaven.model.Pedido;

public class OperacionesPedido {

	
	public static Pedido crearPedido(int id_pedido, Calendar f_pedido, Calendar f_esperada, Calendar f_entrega, int id_cliente) throws Exception{
				
		Calendar fechaActual = new GregorianCalendar();
		Calendar fechaMinimaEsperada = new GregorianCalendar();
		fechaMinimaEsperada = f_pedido;
				
		//Comprobar la fecha actual del pedido.
		if((f_pedido.get(Calendar.DAY_OF_MONTH) == fechaActual.get(Calendar.DAY_OF_MONTH)) 
				&& (f_pedido.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH))
				&& (f_pedido.get(Calendar.YEAR) == f_pedido.get(Calendar.YEAR))) {			
		}else throw new WrongOrderDayCreationException(); 	//"La fecha del pedido tiene que ser el dia de hoy."
		//Comprobar la fecha esperada del pedido.
		fechaMinimaEsperada.add(Calendar.DAY_OF_MONTH, 3);
		//System.out.println(fechaActual.get(Calendar.DAY_OF_MONTH) + " today - " + f_esperada.get(Calendar.DAY_OF_MONTH) + " - " + fechaMinimaEsperada.get(Calendar.DAY_OF_MONTH));
		if(f_esperada.before(fechaMinimaEsperada)) {
			throw new WrongFechaMinimaPedidoException(); 	//"La fecha de entrega esperada no puede ser anterior a tres dias despues de la fecha de creacion."
		}		
		fechaMinimaEsperada.add(Calendar.DAY_OF_MONTH, -3);
		//Comprobar el codigo del cliente.
		ClienteDao cDao = new ClienteDao();
		boolean existeCliente = false;
		List <Cliente> clientesSaved = cDao.getAll();
		for (Cliente clienteSaved : clientesSaved) {
			if(id_cliente == clienteSaved.getCodigo_cliente()) {
				existeCliente = true;
			}
		}
		if(existeCliente == false) {
			throw new ClientNotFoundException(); 			//"El cliente del pedido no existe en la base de datos."
		}

		return new Pedido(id_pedido, f_pedido, f_esperada, f_entrega, id_cliente);
	}
	
	
}
