package src;


public class Dinero implements IDinero {
    private int fCantidad;
    private String fMoneda;
    public Dinero(int cantidad, String moneda) {
        fCantidad = cantidad;
        fMoneda = moneda;
    }
    
    public int cantidad() {
        return fCantidad;
    }
    
    public String moneda() {
        return fMoneda;
    }

	@Override
	public IDinero add(IDinero d) {
		// TODO Auto-generated method stub
		if (((Dinero)d).moneda().equals(this.fMoneda)){
            return new Dinero(this.fCantidad + ((Dinero) d).cantidad(),this.fMoneda);
		}else{
			return new BolsaDinero(this,(Dinero)d);
		}
	}
	public boolean equals(Object objeto) {
            if(objeto instanceof Dinero)
            {
                return (this.fCantidad == ((Dinero) objeto).cantidad()
                        && this.fMoneda.equals(((Dinero) objeto).moneda()));
            }else{
                return false;
            }
        }
}
