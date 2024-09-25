class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> list = new ArrayList<Long>();
        factorial(1,1,n,list);
        return list;
    }
    public static void factorial(long i,long f, long n, ArrayList<Long> list)
    {
        if(i>n || f>n)
            return;
        list.add(f);
        factorial(i+1,f*(i+1),n,list);
        return;
    }
}
