public class StepUpTest {
    public static void main(String[] args) {
        //Для задания 1
        System.out.println(abs(-6)); //Проверка отрицательного числа
        System.out.println(abs(18)); //Проверка положительного числа
        System.out.println(abs(0)); //Проверка для 0, т.к. является граничным значением в условии
        //Для задания 2
        System.out.println(safeDiv(5,0));
        System.out.println(safeDiv(8,2));
        System.out.println(safeDiv(0,3));
        //Для задания 3
        System.out.println(max(5,7)); //Определение большего числа из положительных
        System.out.println(max(8,-1)); //Определение большего числа из положительного и отрицательного
        System.out.println(max(-8,-1)); //Определение большего числа из двух отрицательных
        System.out.println(max(8,8)); //Определение большего числа из одинаковых (проверка определенной ситуации, что не сломается))
        //Для задания 4
        System.out.println(makeDecision(8,-1)); //Проверка с отрицательным числом, знак больше
        System.out.println(makeDecision(5,5)); //Проверка равных чисел
        System.out.println(makeDecision(5,7)); //Проверка с положительными числами, знак меньше
        //Для задания 5
        System.out.println(max3(5,7,7));
        System.out.println(max3(5,7,9));
        System.out.println(max3(8,-1,4));
        System.out.println(max3(1,3,2));
        //Для задания 6
        System.out.println(sum3(1,1,1));
        System.out.println(sum3(5,7,2));
        System.out.println(sum3(8,-1,4));
        //Для задания 7
        System.out.println(sum2(5,7));
        System.out.println(sum2(8,-1));
        //Для задания 8
        System.out.println(is35(15));
        System.out.println(is35(9));
        System.out.println(is35(10));
        System.out.println(is35(8));
        //Для задания 9
        System.out.println(magic6(5,7));
        System.out.println(magic6(8,2));
        System.out.println(magic6(1,6));
        //Для задания 10
        System.out.println(age(1));
        System.out.println(age(2));
        System.out.println(age(3));
        System.out.println(age(4));
        System.out.println(age(5));
        System.out.println(age(6));
        System.out.println(age(7));
        System.out.println(age(8));
        System.out.println(age(9));
        System.out.println(age(10));
        System.out.println(age(111111));
        System.out.println(age(12));
        System.out.println(age(113));
        System.out.println(age(14));
        System.out.println(age(115));
        System.out.println(age(16));
        System.out.println(age(17));
        System.out.println(age(18));
        System.out.println(age(19));
        System.out.println(age(20));
        System.out.println(age(121));
        System.out.println(age(22));
        System.out.println(age(23));
        System.out.println(age(124));
        System.out.println(age(125));
        //Для задания 11
        System.out.println(day(5));
        System.out.println(day(1));
        System.out.println(day(15));
        //Для задания 12
        printDays("Четверг");
        System.out.println("-----------");
        printDays("Чг");
    }
    //Задание по разделу 4, Часть 2: Классы и методы #1
    public static int abs(int x){
       if (x<0) x=-x; //Если число х меньше 0, то инвертируем
       return x;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #2
    public static int safeDiv(int x, int y){
        if (y==0) return 0; //Ставлю условие проверки на ноль в делителе сразу, что тбы не было попытки деления и не упало с ошибкой
        else return (x/y);
    }
    //Задание по разделу 4, Часть 2: Классы и методы #3
    public static int max(int x, int y){
        if (x>y) return x;
        else return y;
        //Или
        //return x>y?x:y;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #4
    public static String makeDecision(int x, int y){
        String res = "==";
        if (x>y) return res= x +" > " + y;
        else if (x<y) return res =  x +" < " + y;
        else return res = x +" == " + y;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #5
    public static int max3(int x, int y, int z){
        if ((x>y)&&(x>z)) return x;
        else if ((y>x)&&(y>z)) return y;
        else return z;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #6
    public static boolean sum3(int x, int y, int z){
        boolean res=true;
        if ((x+y==z)||(y+z==x)||(x+z==y)) res=true;
        else res=false;
        return res;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #7
    public static int sum2(int x, int y){
        int sumxy = x + y;
        if ((10<=sumxy)&&(sumxy<=19)) sumxy =20;
        return sumxy;
        //Или
        //if ((10<=(x+y))&&((x+y)<=19)) return 20;
        //return (x+y);
    }
    //Задание по разделу 4, Часть 2: Классы и методы #8
    public static boolean is35(int x){
        boolean res=true;
        if ((x%3==0)||(x%5==0)) { //Проверяем, что хотя бы одно из условий выполняется, т.е. или на 3 или на 5 делится без остатка
            if ((x%3==0)&&(x%5==0)) res=false; //Если одно из чисел да, делит без остатка, то проверяем, делится ли число одновременно на 3 и 5
            else res=true;
        }
        else res=false;
        return res;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #9
    public static boolean magic6(int x, int y){
        boolean res=true;
        if ((x==6||y==6||x+y==6||x-y==6||y-x==6)) res=true;
        else res=false;
        return res;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #10
    public static String age(int x){
        String resAge="";
        if (10<=(x%100)&&(x%100)<=14) {
            switch (x%100){
                case 10: resAge = x + " лет"; break;
                case 11: resAge = x + " лет"; break;
                case 12: resAge = x + " лет"; break;
                case 13: resAge = x + " лет"; break;
                case 14: resAge = x + " лет"; break;
        }}
        else
            switch (x%10){
                case 1: resAge = x + " год"; break;
                case 2: resAge = x + " годa"; break;
                case 3: resAge = x + " годa"; break;
                case 4: resAge = x + " годa"; break;
                default: resAge = x + " лет";
        }
        return resAge;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #11
    public static String day(int x){
        String str = "";
        switch (x){
            case 1: str = "Понедельник"; break;
            case 2: str = "Вторник"; break;
            case 3: str = "Среда"; break;
            case 4: str = "Четверг"; break;
            case 5: str = "Пятница"; break;
            case 6: str = "Суббота"; break;
            case 7: str = "Воскресенье"; break;
            default: str = "Это не день недели.";
        }
        return str;
    }
    //Задание по разделу 4, Часть 2: Классы и методы #12
    public static void printDays(String x){
        switch (x){
            case "Понедельник": System.out.println("Понедельник");
            case "Вторник": System.out.println("Вторник");
            case "Среда": System.out.println("Среда");
            case "Четверг": System.out.println("Четверг");
            case "Пятница": System.out.println("Пятница");
            case "Суббота": System.out.println("Суббота");
            case  "Воскресенье": System.out.println("Воскресенье"); break;
            default: System.out.println("Это не день недели.");
        }
    }
}
