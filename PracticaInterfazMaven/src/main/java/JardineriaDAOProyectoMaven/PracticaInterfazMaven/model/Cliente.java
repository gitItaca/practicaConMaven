package JardineriaDAOProyectoMaven.PracticaInterfazMaven.model;

public class Cliente {

	public enum Documentacion {
		DNI("Documento Nacional de Identidad."),
		NIE("Numero de Identidad de Extranjero.");
		
		private final String nombreDocumento;

		private Documentacion(String nombreDocumento) {
			this.nombreDocumento = nombreDocumento;
		}
		public String getNombreDocumento() {
			return nombreDocumento;
		}			
	}//FIN enum
	
	private int codigo_cliente;
	private String nombre_cliente;
	private String nombre_contacto;
	private String apellido_contacto;
	private String telefono;
	private String fax;
	private String linea_direccion1;
	private String linea_direccion2;
	private String ciudad;
	private String region;
	private String pais;
	private String codigo_postal;
	private int codigo_empleado_rep_ventas;
	private double limite_credito;	
	
	private Documentacion tipoDocumentacion;
	private String DNI;
	private String email;
	private String password;
	
	
//CONSTRUCTOR
	public Cliente(int codigo_cliente, String nombre_cliente, String nombre_contacto, String apellido_contacto,
			String telefono, String fax, String linea_direccion1, String linea_direccion2, String ciudad, String region,
			String pais, String codigo_postal, int codigo_empleado_rep_ventas, double limite_credito) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre_cliente = nombre_cliente;
		this.nombre_contacto = nombre_contacto;
		this.apellido_contacto = apellido_contacto;
		this.telefono = telefono;
		this.fax = fax;
		this.linea_direccion1 = linea_direccion1;
		this.linea_direccion2 = linea_direccion2;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.codigo_postal = codigo_postal;
		this.codigo_empleado_rep_ventas = codigo_empleado_rep_ventas;
		this.limite_credito = limite_credito;
	}
	//Constructor practica2
	/*public Cliente(int codigo_cliente, String nombre_contacto, String apellido_contacto,
			String telefono) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre_contacto = nombre_contacto;
		this.apellido_contacto = apellido_contacto;
		this.telefono = telefono;
	}*/
	
	public Cliente(int codigo_cliente, String nombre_contacto, String apellido_contacto,
			String telefono, Documentacion tipoDocumentacion, String DNI,
			String email, String password) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre_contacto = nombre_contacto;
		this.apellido_contacto = apellido_contacto;
		this.telefono = telefono;
		this.tipoDocumentacion = tipoDocumentacion;
		this.DNI = DNI;
		this.email = email;
		this.password = password;
		
	}

//GETTERS AND SETTERS
	public int getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getNombre_contacto() {
		return nombre_contacto;
	}
	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}

	public String getApellido_contacto() {
		return apellido_contacto;
	}
	public void setApellido_contacto(String apellido_contacto) {
		this.apellido_contacto = apellido_contacto;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLinea_direccion1() {
		return linea_direccion1;
	}
	public void setLinea_direccion1(String linea_direccion1) {
		this.linea_direccion1 = linea_direccion1;
	}

	public String getLinea_direccion2() {
		return linea_direccion2;
	}
	public void setLinea_direccion2(String linea_direccion2) {
		this.linea_direccion2 = linea_direccion2;
	}

	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public int getCodigo_empleado_rep_ventas() {
		return codigo_empleado_rep_ventas;
	}
	public void setCodigo_empleado_rep_ventas(int codigo_empleado_rep_ventas) {
		this.codigo_empleado_rep_ventas = codigo_empleado_rep_ventas;
	}

	public double getLimite_credito() {
		return limite_credito;
	}
	public void setLimite_credito(double limite_credito) {
		this.limite_credito = limite_credito;
	}

	public Documentacion getTipoDocumentacion() {
		return tipoDocumentacion;
	}
	public void setTipoDocumentacion(Documentacion tipoDocumentacion) {
		this.tipoDocumentacion = tipoDocumentacion;
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cliente [codigo_cliente=" + codigo_cliente + ", nombre_cliente=" + nombre_cliente + ", nombre_contacto="
				+ nombre_contacto + ", apellido_contacto=" + apellido_contacto + ", telefono=" + telefono + ", fax="
				+ fax + ", linea_direccion1=" + linea_direccion1 + ", linea_direccion2=" + linea_direccion2
				+ ", ciudad=" + ciudad + ", region=" + region + ", pais=" + pais + ", codigo_postal=" + codigo_postal
				+ ", codigo_empleado_rep_ventas=" + codigo_empleado_rep_ventas + ", limite_credito=" + limite_credito
				+ ", tipoDocumentacion=" + tipoDocumentacion + ", DNI=" + DNI + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
}
