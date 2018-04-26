import java.sql.Timestamp;

public class lavarRopa extends Tarea{
	int tiempoRequerido = 2000;
	
	public lavarRopa() {
	
	}
	
	@Override
	public Tarea terminarTarea() {
		this.terminada = true;
		this.horaFin = new Timestamp(System.currentTimeMillis());
		this.Descripcion = ("Ropa lavada por " + this.NombreRobot +" en " + this.horaFin);
		return this;
	}
}
