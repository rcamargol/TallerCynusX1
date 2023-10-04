package co.edu.unbosque.model;

public  class Desterrado extends SerCynus {
	private boolean tieneAlmaFalsa;
    private boolean puedeSentir;
    private boolean seArrastra;
    private String ubicacion;
    
   
	public Desterrado(String nombre, int edad, boolean tieneAlmaFalsa, boolean puedeSentir, boolean seArrastra,
			String ubicación) {
		super(nombre, edad);
		this.tieneAlmaFalsa = tieneAlmaFalsa;
		this.puedeSentir = puedeSentir;
		this.seArrastra = seArrastra;
		
	}
	public Desterrado(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String habitarPlaneta() {
        return "Los Desterrados habitan en el extremo sur del planeta. No pueden sentir a nadie más que a sí mismos. Se arrastran de un lugar a otro.";
    }
    public boolean tieneAlmaFalsa() {
        return tieneAlmaFalsa;
    }
    public boolean puedeSentir() {
        return puedeSentir;
    }
    public boolean seArrastra() {
        return seArrastra;
    }
    public String getUbicacion() {
        return ubicacion;
    }
}
