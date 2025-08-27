public class estadistica{
    private double [] n;

    public estadistica(){
        this.n = new double[10];
    }
    public void agregarNum(double [] num){
        this.n = num;
    }
    public double promedio(){
        double p=0;
        for (int i = 0; i < this.n.length; i++) {
            p=this.n[i]+p;
        }
        p=p/this.n.length;
        return p;
    }
    public double desviacion(){
        double prom=promedio();
        double s=0;
        for (int i = 0; i < this.n.length; i++) {
            s=(this.n[i]-prom)*(this.n[i]-prom)+s;
        }
        
        return Math.sqrt(s/((this.n.length)-1));
    }
}