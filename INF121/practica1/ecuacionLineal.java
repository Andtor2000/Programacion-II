public class ecuacionLineal{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public ecuacionLineal(double a, double b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public boolean tieneSolucion(){
        double r=this.a*this.d-this.b*this.c;
        if(r==0){
            return false;
        }else{
            return true;
        }
    }
    public double getX(){
        double x=(((this.e*this.d)-(this.b*this.f))/((this.a*this.d)-(this.b*this.c)));
        return x;
    }
    public double getY(){
        double y=(((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c)));
        return y;
    }

}