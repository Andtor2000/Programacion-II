package practica2.ej02;
public class VectorEn3D {
    private double x,y,z;
    
    public VectorEn3D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public VectorEn3D add(VectorEn3D b){
        return new VectorEn3D(x+b.x,y+b.y,z+b.z);
    }
    public VectorEn3D escalarR(double r){
        return new VectorEn3D(r*x,r*y,r*z);
    }
    public double magnitud(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    public VectorEn3D normal(){
        double mag=magnitud();
        return new VectorEn3D(x/mag,y/mag,z/mag);
    }
    public double escalar(VectorEn3D b){
        return x*b.x+y*b.y+z*b.z;
    }
    public VectorEn3D vectorial(VectorEn3D n){
        return new VectorEn3D(y*n.z-z*n.y,z*n.x-x*n.z,x*n.y-y*n.x);
    }
    @Override
    public String toString(){
        return String.format("(%.1f, %.1f, %.1f)", x, y, z);
    }
}
