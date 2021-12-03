//Overloading

public class Matematika {
    
    public static int kurang(int a, int b){
        return a - b;
    }
    
    public static double kurang(int a, double b){
        return (double)a - b;
    }
    
    public static void main(String[] args) {
        int x = Matematika.kurang(10, 3);
        System.out.println(x);
        double y = Matematika.kurang(2, 0.5);
        System.out.println(y);
    }
}
