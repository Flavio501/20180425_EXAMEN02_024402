
public class RobotRapido extends RobotFactory{

	public RobotRapido() {
		this.IDrob = (int) (Math.ceil(Math.random() * 100));
	}
	
	@Override
	public Tarea iniciarTarea(Tarea t) {
		t.NombreRobot = this.IDrob;
		t.tiempoRequerido = t.tiempoRequerido - 100;
		return t;
		
	}
}