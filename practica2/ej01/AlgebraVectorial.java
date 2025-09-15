package practica2.ej01;

public class AlgebraVectorial {
    private double x,y,z;
    public AlgebraVectorial(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public AlgebraVectorial(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double magnitud(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    public AlgebraVectorial suma(AlgebraVectorial n){
        return new AlgebraVectorial(x+n.x,y+n.y,z+n.z);
    }
    public AlgebraVectorial resta(AlgebraVectorial n){
        return new AlgebraVectorial(x-n.x,y-n.y,z-n.z);
    }
    public double punto(AlgebraVectorial n){
        return x*n.x+y*n.y+z*n.z;
    }
    public AlgebraVectorial cruz(AlgebraVectorial n){
        return new AlgebraVectorial(y*n.z-z*n.y,z*n.x-x*n.z,x*n.y-y*n.x);
    }
    public boolean Perpendicular(AlgebraVectorial n){
        return Math.abs(punto((n)))==0;
    }
    public boolean Paralelo(AlgebraVectorial n){
        AlgebraVectorial lacruz = this.cruz(n);
        return Math.abs(lacruz.x)==0 && Math.abs(lacruz.y)==0 && Math.abs(lacruz.z)==0;
    }
    public AlgebraVectorial proyecSobre(AlgebraVectorial b){
        double test = this.punto(b)/(b.magnitud()*b.magnitud());
        return new AlgebraVectorial(b.x*test,b.y*test,b.z*test);
    }
    public double compEn(AlgebraVectorial b){
        return this.punto(b)/b.magnitud();
    }
     @Override
     public String toString(){
         return String.format("(%.1f, %.1f, %.1f)", x, y, z);
     }
}
