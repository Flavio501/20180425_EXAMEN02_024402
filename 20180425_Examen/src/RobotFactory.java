
public abstract class RobotFactory {
	
	int IDrob;
	
	public Tarea realizarTarea(Tarea t) throws Exception {

		t = iniciarTarea(t);
		Thread.sleep(t.tiempoRequerido);
		return t.terminarTarea();
		
	}
	
	public abstract Tarea iniciarTarea(Tarea t);
}
