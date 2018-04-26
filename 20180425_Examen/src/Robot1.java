
public class Robot1 extends RobotFactory{

	public Robot1() {
		this.IDrob = (int) (Math.ceil(Math.random() * 100));
	}
	
	@Override
	public Tarea iniciarTarea(Tarea t) {
		t.NombreRobot = this.IDrob;
		return t;
		
	}

}
