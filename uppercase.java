public class uppercase {

    // public static String toUppercase(String str){
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);

    //     for(int i = 1 ; i<str.length() ; i++){
    //         if(str.charAt(i) == ' ' && i<str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //         }else{
    //             sb.append(str.charAt(i));   
    //         }
    //     }
    //    return sb.toString();
    // }
     // System.out.println(toUppercase(str));
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ; i<str.length();i++){
            int c = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                c++;
                i++;
            }
            sb.append(str.charAt(i));
            if(c>1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbbccccddddd";
      
       System.out.println(compress(str));
    }
}
