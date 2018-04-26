import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		int numTareas = 20;
		int numRob = 3;
		List<RobotFactory> robots = new ArrayList<RobotFactory>(numRob);
		List<Tarea> tareasPendientes = new ArrayList<Tarea>(numTareas);
		List<Tarea> tareasListas = new ArrayList<Tarea>(numTareas);
		
		for(int i=0;i<= numTareas/4;i++) {
			tareasPendientes.add(new cocinarHamburguesa());
			tareasPendientes.add(new lavarRopa());
			tareasPendientes.add(new DefenderHogar());
			tareasPendientes.add(new Patrullar());
		}
		
		for(int i = 0;i<=numRob/3;i++) {
			robots.add(new Robot1());
			robots.add(new RobotRapido());
			robots.add(new RobotLento());
		}
		
		

	}

}
