public class OTPGeneratorUnique {
    public static int otp(){
        return 100000+(int)(Math.random()*900000);
    }
    public static boolean checkOtpUnique(int[] otpArray) {
        for(int i = 0; i<otpArray.length; i++ ){
            for(int j = 0; j<otpArray.length; j++){
                if(otpArray[j] == otpArray[i] && j!=i){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] otpArray = new int[10];
        for(int i = 0; i<otpArray.length; i++){
            otpArray[i] = otp() ;
        }
        System.out.println("Is all the elements in the array unique?, " + checkOtpUnique(otpArray));
    }
}
