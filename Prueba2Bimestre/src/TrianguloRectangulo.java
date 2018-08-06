
public class TrianguloRectangulo extends HerenciaFiguras implements  Figuras {
    
     private double ladoa;
    private double ladob;
    private double ladoc;
    
       public TrianguloRectangulo(String nombre) {
        super(nombre);
    }

    public TrianguloRectangulo(double ladoa, double ladob, double ladoc, String nombre) {
        super(nombre);
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    

    @Override
    public double calcularArea(double a, double b) {
       double resultadoAreaRectangulo = (ladob*ladoa)/2;
      return resultadoAreaRectangulo;         
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2, double lado3) {
        double resultadoPerimetroRectangulo = ladoa+ladob+ladoc;
        
        return resultadoPerimetroRectangulo;
    }

    @Override
    public double calcularAltura(double lado1, double lado2, double lado3) {
       double resultadoAlturaRectangulo = (ladoa*ladob)/ladoc;
        return resultadoAlturaRectangulo ;
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
    public double calcularArea(double a, double b, double c) {
    return 0;    
    }

   

    
    
    

  
}
