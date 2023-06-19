
public class Main {



    public static void main(String[] args) {

        String[] food = {"pizza","sushi","hamburger","salad","fruits"};
        String[] items = {"phone","computer","tv","beach","football"};

//        breakFood(food,"sushi");
//        breakFood(items,"beach");
//        continueFood(food,"sushi");
//        continueFood(items,"football");

//        System.out.println(recursionFactorial(5)); // 5! = 5 * 4 * 3 * 2 * 1

        //              start             middle                          end
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //System.out.println(binarySearch(numbers,70,0,numbers.length-1));

        //7
        // middle = 0 + (19 - 0)/2 = 9
        // numbers[9] (10) == 7 false
        // binarySearch(numbers,7,0,8);
        // middle = 0 + (8 - 0)/2 = 4
        // numbers[4] (5) == 7 false
        // binarySearch(numbers,7,5,8);
        // middle = 5 + (8 - 5)/2 = 6
        // numbers[6] (7) == 7

        //70
        // middle = 0 + (19 - 0)/2 = 9
        // numbers[9] (10) == 70 false
        // binarySearch(number,70,10,19);
        // middle = 10 + (19 - 10)/2 = 14
        // numbers[14] (15) == 70 false
        // binarySearch(numbers,70,15,19);
        // middle = 15 + (19 - 15)/2 = 17
        // numbers[17] (18) == 70 false
        // binarySearch(numbers,70,18,19);
        // middle = 18 + (19 - 18)/2 = 18;
        // numbers[18] (19) == 70 false
        // binarySearch(arr,toFind,19,19);
        // middle = 19 + ( 19 - 19)/2 = 19;
        // numbers[19] (20) == 70 false;
        // binarySearch(arr,toFind,20,19);

        int result = 1; // 1 * 5 * 24

        for (int i = 5; i > 1; i--) {
            result *= i;
        }

        System.out.println(result);



    }
    public static boolean binarySearch(int[] arr, int toFind, int start, int end){
        System.out.println("I'm still looking");
        if (start > end){
            return false;
        }
        int middle = start + (end - start)/2;
        if(arr[middle] == toFind){
            return true;
        }else if(arr[middle] > toFind){
            return binarySearch(arr,toFind,start,middle-1);
        }else{
            return binarySearch(arr,toFind,middle+1,end);
        }
    }
    public static void breakFood(String[] arr, String breakingPoint){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(breakingPoint)){
                break;
            }
            str +="\"" + arr[i] + "\", ";
        }
        System.out.println(str.substring(0,str.length()-2));
    }

    public static void continueFood(String[] arr, String dismissedFood){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(dismissedFood)){
                continue;
            }
            str += "\"" + arr[i] + "\", ";
        }
        System.out.println(str.substring(0,str.length()-2));
    }

    public static String breakExample(int breakingPoint){
        for (int i = 1; i <= 10; i++) {
            if(i > breakingPoint){
                break;
            }
            System.out.println(i);
        }
        System.out.println("hashuv");
        return "finished succesfully";
    }

    public static void continueExample(int dismiss){
        for (int i = 1; i <= 10; i++) {
            if(i == dismiss){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void recursionInfinite(int x){
        System.out.println(x);
        recursionInfinite(++x);
    }

    public static int recursionFactorial(int x){
        if(x >= 1){
            return x * recursionFactorial(x-1);
        }else{
            return 1;
        }
    }

    public static int calc(int number1, int number2, char symbol){
        switch (symbol){
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '/':
                if(number2 == 0){
                    System.out.println("can't divide by zero");
                    return 0;
                }else{
                    return number1 / number2;
                }
            case '*':
                return number1 * number2;
            default:
                System.out.println("wrong symbol");
                return 0;
        }
    }

    public static void print(){
        System.out.println();
    }
    public static void print(int x){
        System.out.println(x);
    }

    public static void print(String x){
        System.out.println(x);
    }

    public static void print(boolean x){
        System.out.println(x);
    }




}

