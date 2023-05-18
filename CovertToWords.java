public class CovertToWords {
    public static String convertToWordd(int num){
        if(num==0){
            return "Zero";
        }
        if(num<0){
            return "MInus"+convertToWordd(Math.abs(num));
        }
        String words="";
        if(num/100000>0){
            words=words+convertToWordd(num/100000)+"lac";
            num=num%100000;
        }
        if(num/1000>0){
            words=words+convertToWordd(num/1000)+"thousand";
            num=num%1000;
        }
        if(num/100>0){
            words=words+convertToWordd(num/100)+"hunderd";
            num=num%100;
        }
        if(num>0){
            String[]unitMaps={"zero","one","two","three","four","five","six","seven",
            "eight","nine","ten","eleven","twelve","thirteen","fourteen",
            "fifteen","sixteen","seventeen","eighteen","nineteen"};

            String[]tensMap={"zero","ten","twenty","fourty","fifty","sixty","seventy","eighty","ninety"};

        if(num<20){
            words=words+" "+unitMaps[num];
        }else{
            words=words+" "+tensMap[num/10];
            if(num%10>0){
                words=words+" "+unitMaps[num%10];
            }
        }
        }
        return words;
    }
    public static void main(String[] args) {
        int num = 114321; // Replace with your desired number

        String words = convertToWordd(num);
        System.out.println("Number in words: " + words);
    }
    
}
