public class integerToRoman {
    public static void main(String[] args) {
        int num =1230;
        String result = "";
        String[] roman = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"  };
        int [] value= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for(int i=0; i<value.length;  i++){
            while (num!=0) {
                if(num >= value[i]){
                    result+= roman[i];
                    num-= value[i];
                } else{
                    i++;
                }
            }
        }
        System.out.println(result);
    }
}
