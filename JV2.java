import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Arrays;
public class JV2{

    public static void main(String[] args){
        Scanner vsk = new Scanner(System.in);
        //Z1
        System.out.println("Введите символы");
		String a = vsk.next();
		System.out.println("Введите количество повторений");
		int b = vsk.nextInt();
        System.out.printf(repeat(a, b));
        
        //Z2
        System.out.println("Введите размер массива");
    	int razm = vsk.nextInt();
    	int mas[] = new int[razm];
    	System.out.println("Введите числа массива");
        for (int i1 = 0; i1 < razm; i1++) 
        {
        	mas[i1] = vsk.nextInt();
    	}
        System.out.println(differenceMaxMin(mas));
        
        //Z3
        System.out.println("Введите размер массива");
    	int razm1 = vsk.nextInt();
    	int mas1[] = new int[razm1];
    	System.out.println("Введите числа массива");
        for (int i2 = 0; i2 < razm1; i2++) 
        {
        	mas1[i2] = vsk.nextInt();
    	}
        System.out.println(isAvgWhole(mas1, razm1));
        
        //Z4
        System.out.println("Введите размер массива");
    	int razm2 = vsk.nextInt();
    	int mas2[] = new int[razm2];
    	System.out.println("Введите числа массива");
        for (int i3 = 0; i3 < razm2; i3++) 
        {
        	mas2[i3] = vsk.nextInt();
    	}
		int[] mas3 = culumativeSum(mas2);
        for (int element: mas3) 
        {
        	System.out.print(element);
        	System.out.print(" ");
        }

        //Z5
        System.out.println("Введите число");
		String a1 = vsk.next();
        System.out.println(getDecimalPlacec(a1));
        
        //Z6
        System.out.println("Введите число");
        int a2 = vsk.nextInt();
        System.out.println(Fibonacci(a2));

        //Z7
        System.out.println("Введите почтовый индекс:");
        String a3 = vsk.next();
        System.out.println(isValid(a3));

        //Z8
        System.out.println("Введите первое слово");
        String prkr1 = vsk.next();
        System.out.println("Введите второе слово");
        String prkr2 = vsk.next();
        System.out.println(isStrangePair(prkr1, prkr2));

        //Z9
        System.out.println("Введите слово");
        String w1 = vsk.next();
        System.out.println("Введите префикс или суффикс");
        String w2 = vsk.next();
        if (w2.charAt(0) == '-')
        {
            System.out.println(isSuffix(w1, w2));
        }
        else
        {
            System.out.println(isPrefix(w1, w2));
        }

        //Z10
        System.out.println("Введите число");
		int zen = vsk.nextInt();
		System.out.println(boxSeq(zen));
	}
//z1
public static String repeat(String a, int b) {
    String smm = "";
    for (int i = 0; i < a.length(); i++)
    {
        char d = a.charAt(i);
        for (int j = 0; j < b; j++)
        {
            smm = smm + d;
        }
    }
    return smm;
    }
//z2
public static int differenceMaxMin(int[] mas) {
    Arrays.sort(mas);
    return mas[mas.length - 1] - mas[0];
    }
//z3
public static boolean isAvgWhole(int[] mas1, int razm1) {
        int smm1 = 0;
        for (int nisd : mas1)
        {
            smm1 += nisd;
        }
        if (smm1 % razm1 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
//z4
public static int[] culumativeSum(int[] mas2) {
    int[] rezmas = new int[mas2.length];
    for(int i4 = 0; i4 < mas2.length; i4++) {
        int smm2 = 0;
        for(int i5 = i4; i5 >= 0; i5--) {
            smm2 += mas2[i5];
        }
        rezmas[i4] = smm2;
    }
    return rezmas;
}
//z5
public static int getDecimalPlacec(String a1) {
    if (a1.contains("."))
        {
            return a1.length() - 1 - a1.indexOf('.');
        }
        else
        {
            return 0;
        }
    }
//z6
public static int Fibonacci(int a2) {
    int m = 0;
    int n = 1;
    int rez = n;
    if (a2 == 1)
    {
        return 0;
    }
    if (a2 == 2) 
    {
        return 1;
    }
    for(int y = 2; y < a2 + 2; y++) {
        rez = n;
        rez = rez + m;
        m = n;
        n = rez;
    }
    return rez;
    }
//z7
public static boolean isValid(String a3) {
    for(int iu = 0; iu < a3.length(); iu++)
        if((int)a3.charAt(iu) < 48 || (int)a3.charAt(iu) > 57)
            return false;
    if (a3.length() == 5)  
    {
        return true;
    }
    else
    {
        return false;
    }
}
//z8
public static boolean isStrangePair(String prkr1, String prkr2) {
    if (prkr1.charAt(0) == prkr2.charAt(prkr2.length()-1) 
    && prkr1.charAt(prkr1.length()-1) == prkr2.charAt(0))
    {
        return true;
    }
    else
    {
        return false;
    }
    }
//z9
public static boolean isPrefix(String w1, String prefix) {
    if (w1.substring(0, prefix.length() - 1)
    .equals(prefix.substring(0, prefix.length() - 1)))
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static boolean isSuffix(String w1, String suffix) {
    if (w1.substring(w1.length() - suffix.length() 
    + 1, w1.length()).equals(suffix.substring(1, suffix.length())))
    {
        return true;
    }
    else
    {
        return false;
    }
}
//10
public static int boxSeq(int zen) {
        if (zen % 2 == 0)
        {
            return zen;
        }
        else
        {
            return zen+2;
        }
    }
}
