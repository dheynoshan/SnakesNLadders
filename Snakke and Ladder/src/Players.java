public class Players{
	private int id = 0;
	private int position = 0;
	
	public Players(int id) {
		this.id = id;
	}
	
	public void changePosition(int position) {
		this.position = this.position + position;
	}
	
	public int getPosition() {
		return position;
	}
	public int getId() {
		return id;
	}
	
	public void goTo(int position) {
		this.position = position;
	}
	
	
}
