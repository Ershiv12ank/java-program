public class timeToWord {
    public String timeToWord(int H, int M)
    {
        // code here
        String Minute[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
                "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","thirty",
                "forty","fifty"};
        String s="";

        if(M==0){
            s=Minute[H]+" "+Minute[M]+"o' clock";
            return s;
        }

        else if(M<=20){
            if(M==15){
                s="quarter past six"+Minute[H+1];
                return s;
            }
            s=Minute[H]+" "+Minute[M]+" minutes past six";
        }
        else if (M>20 && M<30){
            int n=M-20;
            s="twenty-"+Minute[n]+" minutes past "+Minute[H+1];
            return s;
        }
        else if(M==30){
            s="half past "+Minute[H];
            return s;
        }
        else if (M>30 && M<40){
            int  p=60-M;
            int m=p%10;

            s="twenty "+Minute[m]+" minutes to "+ Minute[H+1];
        }
        else if (M>=40 && M<45){
            int p=60-M;
            s=Minute[p-1]+" minutes to "+Minute[H+1];
            return s;
        }
        else if(M==45){
            s="quarter to"+Minute[H+1];
            return s;
        }

        else if (M>45 && M<60){
            int p=60-M;
            s=Minute[p]+" minutes to "+Minute[H+1];
            return s;
        }
        return s;

    }

    public static void main(String[] args) {
        timeToWord obj=new timeToWord();
        obj.timeToWord(3,40);
        System.out.println(obj.timeToWord(8,33));
    }
}
