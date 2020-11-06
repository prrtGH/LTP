import java.util.Scanner;
import java.util.stream.Stream;
public class JV3{

    public static void main(String[] args){
        Scanner ngnk = new Scanner(System.in);
        int[] mass;
        int[] mass1;
    //Z1
    System.out.println("Введите значения a, b и c:");
	int a = ngnk.nextInt();
	int b = ngnk.nextInt();
    int c = ngnk.nextInt();
    System.out.println(solutions(a, b, c));
    
    //Z2
    System.out.println("Введите строку");
	String zen = ngnk.nextLine();
    System.out.println(findZip(zen));
    
    //Z3
    System.out.println("Введите число");
    int a1 = ngnk.nextInt();
    System.out.println(checkPerfect(a1));
    
    //Z4
    System.out.println("Введите строку");
    String zen1 = ngnk.nextLine();
    System.out.println(flipEndChars(zen1));

    //Z5
    System.out.println("Введите строку");
    String zen2 = ngnk.nextLine();
    System.out.println(isValidHexCode(zen2));

    //Z6
    System.out.print("Введите размер первого массива");
    mass = new int[ngnk.nextInt()];
    System.out.println("Введите первый массив");
    for (int i = 0; i < mass.length; i++) 
    {
    mass[i] = ngnk.nextInt();
    }
    System.out.print("Введите размер второго массива");
    mass1 = new int[ngnk.nextInt()];
    System.out.println("Введите второй массив");
    for (int i = 0; i < mass1.length; i++) 
    {
        mass1[i] = ngnk.nextInt();
    }
    System.out.println(same(mass, mass1));

    //Z7
    System.out.println("Введите число");
	int a12 = ngnk.nextInt();
    System.out.println(isKaprekar(a12));
    
    //Z8
    System.out.println("Введите двоичное число");
	String rezk = ngnk.next();
    System.out.println(longestZero(rezk));
    
    //Z9
    System.out.println("Введите число");
	int w3 = ngnk.nextInt();
    System.out.println(nextPrime(w3));
    
    //Z10
		System.out.println("Введите a");
		int e = ngnk.nextInt();
		System.out.println("Введите b");
		int v = ngnk.nextInt();
		System.out.println("Введите c");
        int n = ngnk.nextInt();
        System.out.println(rightTriangle(e, v, n));
}
//z1
public static int solutions(int a, int b, int c) {
    int rez = b * b - 4 * a * c;
    if(rez == 0)
        {
            return 1;
        }
        else if (rez > 0)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
//z2
public static int findZip(String zen) {
    return zen.indexOf("zip", zen.indexOf("zip") + 1);
    }
//z3
public static boolean checkPerfect(int a1) {
    int rez1 = 0;
    for (int i = 1; i < a1; i++)
    {
        if (a1 % i == 0)
        rez1 = rez1 + i;
    }
    if(rez1 == a1)
    {
        return true;
    }
    else
    {
        return false;
    }
    }
//z4
public static String flipEndChars(String zen1) {
    if(zen1.length() < 2)
    {
        return "Incompatible";
    }
    if (zen1.charAt(0) == zen1.charAt(zen1.length() - 1))
    {
        return "Twos a pair";
    }
    zen1 = zen1.charAt(zen1.length() - 1) +
    zen1.substring(1, zen1.length() - 1) + zen1.charAt(0);
    return zen1;
    }
//z5
public static boolean isValidHexCode(String zen2) {
    if (zen2.matches("(#[a-f-A-F-0-9]{1,6})"))
    {
        return true;
    }
    else
    {
        return false;
    }
    }
//z6
public static boolean same(int[] mass, int[] mass1) {
    int rezz = 0;
        for (int y = 0; i < mass.length; i++)
            for (int j = 0; j <= i; j++) 
            {
                if (i == j)
                rezz++;
                if (mass[i] == mass[j])
                    break;
            }
        for (int i = 0; i < mass1.length; i++)
            for (int j = 0; j <= i; j++) 
            {
                if (i == j)
                rezz--;
                if (mass1[i] == mass1[j])
                    break;
            }
        return (rezz == 0);
    }
//z7
public static boolean isKaprekar(int a12) {
    String rezz1 = "" + (int) Math.pow(a12, 2);
    int kprkr = 0;
    if (rezz1.length() > 1) 
    {
        for (int i = 1; i < rezz1.length(); i++) 
        {
            kprkr = Integer.parseInt(rezz1.substring(0, i)) 
            + Integer.parseInt(rezz1.substring(i, rezz1.length()));
            if (kprkr == a12)
            {
                return true;
            }
        }
    }
    return false;
}
//z8
public static String longestZero(String rezk) {
        String[] rezkmas = rezk.split("1");
        String itg = "";
        for (String vlk : rezkmas)
        {
            if (vlk.length() > itg.length())
            {
                itg = vlk;
            }
        }
        return itg;
    }
//z9
public static int nextPrime(int w3) {
    if(w3 < 2)
    {
        w3 = 2;
    }
    while(true) 
    {
        boolean fg = false;
        for(int i = 2; i < w3; i++) 
        {
            if(w3 % i == 0)
            {
                fg = true;
                break;
            }
        }
        if(!fg)
        {
            return w3;
        }
        else
        {
            w3++;
        }
    }
    }
//z10
public static boolean rightTriangle(int e, int v, int n) {
    return (n * n == e * e + v * v || e * e == v * v + n * n || v * v == e * e + n * n);
}
}
