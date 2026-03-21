public class StringLength {
    public static int lengthCal(String str, int i){
        try{
            str.charAt(i);
           return  lengthCal(str, i+1);
        } catch (Exception e){
            return i;
        }
    }

    public static void main(String[] args) {
        String str = "Rupesh";
        System.out.println(lengthCal(str, 0));
    }
}
