package src;
import java.util.Vector;


public class BolsaDinero implements IDinero {
    
    private Vector fDineros= new Vector();
    
    /*
    void appendMoney(Dinero m){
        fDineros.add(m);
    }*/
    
    public BolsaDinero(Dinero d1, Dinero d2) {
        //appendMoney(d1);
        //appendMoney(d2);
    	aniadirDinero(d1);
    	aniadirDinero(d2);
    }
    
    public BolsaDinero(Dinero bolsa[]) {
        for (int i= 0; i < bolsa.length; i++)
            aniadirDinero(bolsa[i]);
    }
    
    
	@Override
	public IDinero add(IDinero d) {
		// TODO Auto-generated method stub
		if(d instanceof Dinero){
			aniadirDinero((Dinero) d);
		}
		
		return this;
	}
        
        public Vector vector(){
            return fDineros;
        }
        
        void aniadirDinero(Dinero m)
        {
            boolean encontrado = false;
            for(Object dinero : fDineros)
            {
                if(((Dinero) dinero).moneda().equals(m.moneda()))
                {
                    encontrado = true;
                    ((Dinero) dinero).add(m);
                }
            }
            
            if(!encontrado)
            {
                fDineros.add(m);
            }
        }
        
   public boolean BolsaEquals(Object objeto){
        if (objeto instanceof Vector) {
        return this.fDineros.equals(objeto);
        }else{
        	return false;
        }
   }
   
   
}
