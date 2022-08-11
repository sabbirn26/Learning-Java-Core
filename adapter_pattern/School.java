package adapter_pattern;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pa = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		
		aw.setP(pa);

		aw.writeAssignment("Writing the assignment!");

	}

}
