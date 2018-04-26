import java.sql.Timestamp;

public abstract class Tarea {
	public int NombreRobot;
	public String Descripcion;
	int tiempoRequerido;
	Timestamp horaFin;
	boolean terminada = false;
	
	//public abstract String Descripcion();

	public abstract Tarea terminarTarea();
}
