public class Problem5MathTime {
    public static void main(String[] args) {
        double x, a, b, c;

        a=1;
        b=6;
        c=-16;

        x = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.print(x);

        x = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.print("\n"+ x);

    }
}
