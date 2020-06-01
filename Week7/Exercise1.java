package Week7;

public class Exercise1 {
    public static int product(String... numbers){
        int[] argsX=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            argsX[i]=Integer.parseInt(numbers[i]);
        }
        int product=1;
        for(int a:argsX){
            product*=a;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.print("The series of integers are: ");
            for(int i=0;i<args.length;i++){
                if(i<args.length-2) {
                    System.out.print(args[i] + ", ");
                }else {
                    if(i<args.length-1){
                        System.out.print(args[i]+" and ");
                    }else {
                        System.out.println(args[i]);
                    }
                }
            }
            for(int i=2;i<args.length;i++) {
                String[] eachArgs=new String[i];
                for(int j=0;j<i;j++){
                    eachArgs[j]= args[j];
                }
                System.out.printf("The product of first %d integers is %d\n", i,product(eachArgs));
            }
        System.out.printf("The product of all series integers is %d", product(args));

    }
}
