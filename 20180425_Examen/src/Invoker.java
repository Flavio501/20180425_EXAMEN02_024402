import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	int IDrob;
	int numTareas;
	List<Tarea> tareasPendientes = new ArrayList<Tarea>(numTareas);
	List<Tarea> tareasListas = new ArrayList<Tarea>(numTareas);
	
	public Invoker() {
		this.IDrob = (int) Math.ceil(Math.random() * 100);
	}
	
	public void addTarea(Tarea t) {
		tareasPendientes.add(t);
	}
	
	public void terminarTarea(Tarea t) {
		t.terminarTarea();
		tareasPendientes.remove(t);
		tareasListas.add(t);
	}
	
}