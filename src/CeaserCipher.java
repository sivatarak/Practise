public class CeaserCipher {

    public static void main (String [] args){

       String org = "middle-Outz";
       String encryp = " ";
       int m=0;
       char[] str1 = new char[m];

       int k =2;
       for(int i=0;i<org.length();i++){

           if(org.charAt(i)=='-'){
               System.out.print('-');
               continue;
           }
          int as =  org.charAt(i)+k;
           String str = new Character((char) as).toString();
          str1=str.toCharArray();
          m++;

       }

    }

}
