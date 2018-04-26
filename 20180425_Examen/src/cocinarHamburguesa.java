import java.sql.Timestamp;

public class cocinarHamburguesa extends Tarea{
	
	int tiempoRequerido = 1500;
	
	@Override
	public Tarea terminarTarea() {
		this.terminada = true;
		this.horaFin = new Timestamp(System.currentTimeMillis());
		this.Descripcion = ("Hamburguesa preparada por " + this.NombreRobot +" en " + this.horaFin);
		return this;
	}
	
}
