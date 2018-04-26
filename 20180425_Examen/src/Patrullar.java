import java.sql.Timestamp;

public class Patrullar extends Tarea{
	int tiempoRequerido = 3000;
	
	public Patrullar() {

	}
	
	@Override
	public Tarea terminarTarea() {
		this.terminada = true;
		this.horaFin = new Timestamp(System.currentTimeMillis());
		this.Descripcion = ("Vecindario patrullado por " + this.NombreRobot +" en " + this.horaFin);
		return this;
	}
}
