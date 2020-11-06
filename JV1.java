import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.stream.Stream;
public class JV{

    public static void main(String[] args){
        Scanner vst = new Scanner(System.in);
        //Z1
        System.out.println("Введите 1 число");
        int a = vst.nextInt();
        System.out.println("Введите 2 число");
        int b = vst.nextInt();
        System.out.println(remainder(a, b));

        //Z2
        System.out.println("Введите основание треугольника");
        int c  = vst.nextInt();
        System.out.println("Введите высоту треугольника");
        int d = vst.nextInt();
        System.out.println(triArea(c, d));

        //Z3
        System.out.println("Введите кол-во кур");
        int e  = vst.nextInt();
        System.out.println("Введите кол-во коров");
        int f = vst.nextInt();
        System.out.println("Введите кол-во свиней");
        int g = vst.nextInt();
        System.out.println(animals(e, f, g));

        //Z4
        System.out.println("Введите значение prob");
        float prob = vst.nextFloat();
        System.out.println("Введите значение prize");
        float prize = vst.nextFloat();
        System.out.println("Введите значение pay");
        float pay = vst.nextFloat();
        System.out.println(profitableGamble(prob, prize, pay));

        //Z5
        System.out.println("Введите первое значение");
        int h = vst.nextInt();
        System.out.println("Введите второе значение");
        int i = vst.nextInt();
        System.out.println("Введите третье значение");
        int j = vst.nextInt();
        System.out.println(operation(h, i, j));

        //Z6
        System.out.println("Введите символ");
        String k = vst.next();
        System.out.println(ctoa(k));

        //Z7
        System.out.println("Введите значение");
        int m = vst.nextInt();
        System.out.println(addUpTo(m));

        //Z8
        System.out.println("Введите первую сторону треугольника");
        int p = vst.nextInt();
        System.out.println("Введите вторую сторону треугольника");
        int q = vst.nextInt();
        System.out.println(nextEdge(p, q));

        //Z9
        System.out.println("Укажите размер массива: ");
    	int size = vst.nextInt();
    	int array[] = new int[size];
    	System.out.println("Введите массив чисел:");
    	for (int w = 0; w < size; w++) {
        	array[w] = vst.nextInt();}
        System.out.printf("Сумма кубов: %d", sumOfCubes(array));

        //Z10
        System.out.println("Введите a");
        int s = vst.nextInt();
        System.out.println("Введите b");
        int t = vst.nextInt();
        System.out.println("Введите c");
        int u = vst.nextInt();
        System.out.println(abcmath(s, t, u));
    }
//z1
public static int remainder(int a, int b){
    return a % b;
}
//z2
public static int triArea(int c, int d){
    return (c*d)/2;
}
//z3
public static int animals(int e, int f, int g){
    return (e*2)+(f*4)+(g*4);
}
//z4
public static boolean profitableGamble(float prob, float prize, float pay){
    boolean rg;
    if (prob*prize > pay)
    {
        rg=true;
    }
    else
    {
        rg=false;
    }
return rg;
}
//z5
public static String operation(int h, int i, int j){
    String rw;
    if (i+j==h)
    {
        rw="plus";
    }
    else if (i-j==h)
    {
        rw="minus";
    }
    else if (i*j==h)
    {
        rw="umnozh";
    }
    else if (i/j==h)
    {
        rw="delen";
    }
    else
    {
        rw="none";
    }
    return rw;
}
//z6
public static int ctoa(String k){
    char l = k.charAt(0);
    return (int) l;
}
//z7
public static int addUpTo(int m){
    int n=0;
    for (int o=1; o<=m; o++)
    n=n+o;
    return n;
}
//z8
public static int nextEdge(int p, int q){
    int r;
    r = p + q - 1;
    return r;
}
//z9
public static int sumOfCubes(int[] array) {
    int sum = 0;
    for(int i = 0; i < array.length; i++)
        sum += Math.pow(array[i], 3);
    return sum;
}
//z10
public static boolean abcmath(int s, int t, int u){
    int result = s;
    for (int v = 0; v < t; v++) {
        result = result + result;
    }
    if (result % u == 0)
    {
        return true;
    }
        else
        {
            return false;
        }
}
}
