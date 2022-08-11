package adapter_pattern;

public class PenAdapter implements Pen {
	
	CelloPen cp = new CelloPen();
	

	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		System.out.println("PenAdapter is working!");
		cp.mark(str);
		

	}

}
