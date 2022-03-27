package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio= 500;
	private boolean estado;
	private int volumen = 1;
	Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca= marca;
		this.estado= estado;
		this.numTV++;
		
	//Set
	}
	public void setMarca(Marca marca) {
		this.marca= marca;
	}
	public void setControl(Control control) {
		this.control = control;
		
	}
	public void setVolumen(int volumen) {
		if( estado== true && volumen<=7 && volumen>=1) {
		this.volumen = volumen;
		}
	}
	public void setPrecio(int precio) {
		this.precio = precio;
		
	}
	public void setCanal(int canal) {
		if (estado == true && canal>=1 && canal<=120){
		this.canal = canal;
		}
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	
	
	//Get
	
	
	public Marca getMarca() {
		return marca;
		
	}
	public Control getControl() {
		return control;
		
	}
	public int getVolumen() {
		return volumen;
		
		
	}
	public int getPrecio() {
		return precio;
		
	}
	public int getCanal() {
		return canal;
		
	}
	public static int getNumTv() {
		return numTV;
	}
		
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
		
	}
	public boolean getEstado() {
		return estado;
		
	}
	public void canalUp(){
		if (this.estado == true &&  canal<120) {
			canal++;
			
		}
	}
	public void canalDown(){
		
		if(this.estado == true && canal>1) {
			canal --;
			
			
		}
	
	}
	public void volumenUp() {
		if( this.estado== true && this.volumen>7 ) {
			volumen++;
			
		}
	}
	public void volumenDown() {
		if (this.estado == true && this.volumen>1) {
			volumen--;
			
		}
	 } 
	
	
}



