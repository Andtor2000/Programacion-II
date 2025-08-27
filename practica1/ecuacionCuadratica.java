public class ecuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public ecuacionCuadratica(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminante(){
        return (this.b*this.b)-4*(this.a*this.c);
    }
    public double getRaiz1(){
        if(getDiscriminante()>=0){
            return (-this.b+Math.sqrt(getDiscriminante()))/2*this.a;
        }else{
            return 0;
        }
    }
    public double getRaiz2(){
        if(getDiscriminante()>=0){
            return (-this.b-Math.sqrt(getDiscriminante()))/2*this.a;
        }else{
            return 0;
        }
    }
}
