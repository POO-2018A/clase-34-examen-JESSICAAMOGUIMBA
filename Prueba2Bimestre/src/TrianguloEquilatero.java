
public class TrianguloEquilatero extends HerenciaFiguras implements  Figuras {
    private double ladoa;
    private double ladob;
    private double ladoc;

    public TrianguloEquilatero(String nombre) {
        super(nombre);
    }
    
    

    @Override
    public double calcularArea(double a, double b, double c) {
       double resultadoAreaEquilatero = (Math.sqrt(3*ladoa)/2)*Math.pow(2, ladoa);
      return resultadoAreaEquilatero;         
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2, double lado3) {
        double resultadoPerimetroEquilatero = 3*ladoa;
        
        return resultadoPerimetroEquilatero;
    }

    @Override
    public double calcularAltura(double lado1, double lado2, double lado3) {
       double resultadoAlturaEquilatero = Math.sqrt(3*ladoa)/2;
        return resultadoAlturaEquilatero ;
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
        return "TrianguloEquilatero{" + "ladoa=" + ladoa + ", ladob=" + ladob + ", ladoc=" + ladoc + '}';
    }
    
    
    
}
