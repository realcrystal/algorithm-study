class BinaryGap {
    public int solution(int N) {
        int result = 0;
        String binary = "";
        while(N != 0){
            binary = N % 2 + binary;
            N = N / 2;
        }
        
        int cmp = 0;
        for(int i = 1; i < binary.length(); i++){
            if(Character.getNumericValue(binary.charAt(i)) == 0 ){
                cmp++;
            }else{
                if(result < cmp) result = cmp;
                cmp = 0;
            }
        }

        return result;
    }
}
