
public class TrianguloIsosceles extends HerenciaFiguras implements  Figuras {
    
    private double ladoa;
    private double ladob;
    private double ladoc; 
    
    public TrianguloIsosceles(String nombre) {
        super(nombre);
    }
    
    

    @Override
    public double calcularArea(double a, double b, double c) {
       double s = (ladob*Math.sqrt((Math.pow(2,ladoa)-((Math.pow(2,ladob)/4)))) )/2;
       double resultadoAreaIsosceles = Math.sqrt(s*(s-ladoa)*(s-ladob)*(s-ladoc));
      return resultadoAreaIsosceles;         
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2, double lado3) {
        double resultadoPerimetroIsosceles =2* ladoa + ladob;
        
        return resultadoPerimetroIsosceles;
    }

    @Override
    public double calcularAltura(double lado1, double lado2, double lado3) {
      
       double resultadoAreaIsosceles = Math.sqrt(Math.pow(2,ladoa)-((Math.pow(2,ladob)/4)));
       
       return resultadoAreaIsosceles ;
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
    
    

}
