class NumberOfSteps {
    public int numberOfSteps(int num) {
        int rum=0;
        while(num>0){
            if(num%2==0){
                num=num/2;
                rum++;
            }
            else{
                num=num-1;
                rum++;
            }
        }
        return rum;
    }
}
