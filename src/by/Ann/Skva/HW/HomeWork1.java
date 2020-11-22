package by.Ann.Skva.HW;

public class HomeWork1 {
    public static void main(String[] args) {
        int w = 29878;
        byte b = 67;
        short c = 3788;
        long d = 78999398;
        double n = 33.979737873d;
        float p = 1331331441.0f;
        char f = 'U';
        boolean k = true;


        System.out.println(c * b - w);
        System.out.println(d < w);
        System.out.println(w != b);
        System.out.println(n % c + b * c);


        int r = 12; //circle radius
        System.out.println("The circumference is " + Math.PI * 2 * r);
        System.out.println("The area of the circle is " + Math.PI * r * r);


        int weather = 18;
        if(weather<10) {
            System.out.println("Сегодня холодно, надень куртку.");
        }
        else if(weather < 15) {
            System.out.println("Надень ветровку.");
        }
        else if(weather<20) {
            System.out.println("Надень свитер");
        }
        else if(weather<30){
            System.out.println("Надень свитер");
        }
        else{
            System.out.println("Ужасная жара, оставайся дома.");
        }


        int salary1 = 2100;
        int salary2 = 4500;
        int salary3 = 1200;
        int max = salary1;
        int min = salary1;
        if(salary2<min)
            min = salary2;
        if(salary3<min)
            min = salary3;
        if(salary2>max)
            max = salary2;
        if(salary3>max)
            max = salary3;
        System.out.println("Разница: " + (max-min));

        int i;
        int h = 3;
        int l = 4;
        for(i = 0; i < l; i++){
            System.out.println(h);
            h *= 3;
        }

        double startSum = 4000.0;
        double proc = 0.15;
        double years = 4;
        double tax = 0.01;
        for(i = 0; i<years; i++) {
            double money = startSum * proc - startSum * tax;
            System.out.println(money);
            startSum += money;
        }
    }
}