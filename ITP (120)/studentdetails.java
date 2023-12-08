  import java.util.Scanner;
   
  class studentdetails
     {
        public static void main(String args[])
        
         {
         String name; /* student name*/
         String cname,sname; /* college name and state name*/
         int zip; /* zip code */
         long tpno; /* telephone number*/
         String cmajor; /* course name*/
         
         Scanner s=new Scanner(System.in);
         System.out.println("enter your name");
         name=s.next();
         System.out.println("enter your address-city,state and zip");
         cname=s.next();
         sname=s.next();
         zip=s.nextInt();
        
         System.out.println("enter your telephone number");
         tpno=s.nextLong();
         System.out.println("enter your course name");
         cmajor=s.next();
         
         System.out.println(" student details are\n");
         System.out.println(name+"\n"+cname+"\t"+sname+"\t"+zip+"\n"+tpno+"\n"+cmajor);
         
         }// end of main
     
   }// end of class