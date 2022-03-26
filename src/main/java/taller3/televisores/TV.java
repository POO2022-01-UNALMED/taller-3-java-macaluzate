package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio= 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	public static int NumTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca= marca;
		this.estado= estado;
		NumTV ++;
		
	//Set
	}
	public void setMarca(Marca marca) {
		this.marca= marca;
	}
	public void setControl(Control control) {
		this.control = control;
		
	}
	public void setVolumen(int volumen) {
		if( estado== true && volumen<7 && volumen>0) {
		this.volumen = volumen;
		}
	}
	public void setPrecio(int precio) {
		this.precio = precio;
		
	}
	public void setCanal(int canal) {
		if (estado == true && canal>0 && canal<120){
		this.canal = canal;
		}
	}
	public void setNumTV( int Num) {
		NumTV = Num;
		
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
		return NumTV;
	}
		
	public void TurnOn() {
		estado = true;
	}
	public void TurnOff() {
		estado = false;
		
	}
	public boolean getEstado() {
		return estado;
		
	}
	public void CanalUp(){
		if (estado == true && canal>0 && canal<120) {
			canal++;
			
		}
	}
	public void CanalDown(){
		
		if(estado == true && canal<=120) {
			canal --;
			
			
		}
	
	}
	public void VolumenUp() {
		if( estado== true && volumen>0 ) {
			volumen++;
			
		}
	}
	public void VolumenDown() {
		if (estado == true && volumen<7) {
			volumen--;
			
		}
	 } 
	
	
}



