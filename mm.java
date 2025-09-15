import java.util.Scanner;
class mm
{
    public static void main(String[] args)
    {
        // // String web;
        //  Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the name of Website");
        // web=sc.nextLine();

        // if(web.substring(0,web.indexOf(":")).equals("http")){
        //     System.out.println("Protocol=Hyper Text Markup Language");
        // }
        //  else if(web.substring(0,web.indexOf(":"))=="https"){
        //     System.out.println("Protocol=Hyper Text Markup Language With Sercurity");
        // }
        //  else if(web.substring(0,web.indexOf(":"))=="ftp"){
        //     System.out.println("Protocol=File Transfer Protocol");
        // }
int n;
Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
n =sc.nextInt();
   

// String  result= n%2==0?"the no is even ":"the number is odd";
//         System.out.println(result);

// switch(n){
//     case 1:
//         System.out.println("monday");
//         break;
//     case 2:
//     System.out.println("tuesday");
//     break;
//     case 3:
//     System.out.println("wednesday");
//     break;
//     case 4:
//     System.out.println("thrusday");
//     break;
//     case 5:
//     System.out.println("friday");
//     break;
//     case 6:
//     System.out.println("saturday");
//     break;
//     case 7:
//     System.out.println("sunday");
//     break;
//     default:
//     System.out.println("wrong day4");
// }
//new version of switch
// 'switch(n){
//     case 1->
//         System.out.println("monday");

//     case 2->
//     System.out.println("tuesday");
   
//     case 3->
//     System.out.println("wednesday");
  
//     case 4->
//     System.out.println("thrusday");

//     case 5->
//     System.out.println("friday");
   
//     case 6->
//     System.out.println("saturday");
   
//     case 7->
//     System.out.println("sunday");
  
//     default->
//     System.out.println("wrong day !!");
// }'

//another wayof these
String result = "       ";
result = switch(n){
    case 1->  "monday";
    case 2->
    "tuesday";

    case 3->
    "wednesday";
  
    case 4->
    "thrusday";

    case 5->
    "friday";
   
    case 6->
   "saturday";
   
    case 7->
    "sunday";
  
    default->
    ("wrong day !!");
};

System.out.println(result);
    }

}