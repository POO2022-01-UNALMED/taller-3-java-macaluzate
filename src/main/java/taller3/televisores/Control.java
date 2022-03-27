package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
		
	}
	public void canalDown() {
		tv.canalDown();
		
	}
	public void volumenUp() {
		tv.volumenUp();
		
	}
	public void volumenOff() {
		tv.volumenDown();
	
	}
	
	public void setCanal(int canal) {
		if ((canal>=1 && canal<=120) && this.tv.getEstado()== true) {
			this.tv.setCanal(canal);
		}
	}
	
	public  void enlazar(TV tv) {
		this.tv=tv;
		tv.control=this;
	}
	public void setTv(TV tv) {
		this.tv=tv;
			
	}
	public TV getTv() {
		return tv;
		
	}
}
