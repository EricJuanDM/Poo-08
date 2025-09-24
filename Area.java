public class Area {

    public Area(){
    }

    public int area(int lado){
        return lado * lado;
    }
    
    public float area(float base, float altura){
        return base * altura;
    }

    public double area(double raio){
        return Math.PI * (raio * raio);
    }
}