class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        if(b == 0)
            return a;

        return getSum( a ^ b, (a & b) << 1);
    }

    public static void main(String[] args){
        SumOfTwoIntegers obj = new SumOfTwoIntegers();

        if (args.length > 1){
            System.out.println(obj.getSum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }
        else 
            System.out.println(obj.getSum(1,2));
    }
}