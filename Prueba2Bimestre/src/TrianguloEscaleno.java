
public class TrianguloEscaleno extends HerenciaFiguras implements  Figuras {
    private double ladoa;
    private double ladob;
    private double ladoc;

    public TrianguloEscaleno(String nombre) {
        super(nombre);
    }
    
    

    @Override
    public double calcularArea(double a, double b, double c) {
       double s = (ladoa + ladob + ladoc)/2;
       double resultadoAreaEscaleno = Math.sqrt(s*(s-ladoa)*(s-ladob)*(s-ladoc));
      return resultadoAreaEscaleno;         
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2, double lado3) {
        double resultadoPerimetroEscaleno =ladoa + ladob + ladoc;
        
        return resultadoPerimetroEscaleno;
    }

    @Override
    public double calcularAltura(double lado1, double lado2, double lado3) {
       double s = (ladoa + ladob + ladoc)/2;
       double resultadoAreaEscaleno = Math.sqrt(s*(s-ladoa)*(s-ladob)*(s-ladoc));
       
       double resultadoAlturaEscaleno = (2/ladoa)*Math.sqrt(resultadoAreaEscaleno);
        return resultadoAlturaEscaleno ;
    }

    public double getLadoa() {
        return ladoa;
    }

    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }

    public double getLadoc() {
        return ladoc;
    }

    public void setLadoc(double ladoc) {
        this.ladoc = ladoc;
    }

    @Override
    public double calcularArea(double ladoa, double ladob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "TrianguloEscaleno{" + "ladoa=" + ladoa + ", ladob=" + ladob + ", ladoc=" + ladoc + '}';
    }
    
    
    
}
