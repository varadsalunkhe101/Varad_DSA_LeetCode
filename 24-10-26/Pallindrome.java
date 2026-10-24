class Pallindrome {
    public boolean isPalindrome(int x) {
        int digit=x;
        int vigit;
        int rev=0;
        int og=x;

        while(x>0){
            digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev==og;
    }
}
