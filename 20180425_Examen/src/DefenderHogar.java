import java.sql.Timestamp;

public class DefenderHogar extends Tarea{
	int tiempoRequerido = 2500;
	
	public DefenderHogar() {
	}
	
	@Override
	public Tarea terminarTarea() {
		this.terminada = true;
		this.horaFin = new Timestamp(System.currentTimeMillis());
		this.Descripcion = ("Hogar defendido por " + this.NombreRobot +" en " + this.horaFin);
		return this;
	}
}
