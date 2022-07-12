import java.util.LinkedList;

public class Test {



    static int  Fibonachi(int num){

        int n1 = 0, n2 = 1, n3 = 0;

        for(int i =2; i < num; i++){

            n3 = n1 +n2;
            n1 = n2;
            n2 = n3;

        }

        return n3;
    }

    static void reversstring(String str){
         String revers = "";
         for(int i=str.length() -1; i >= 0; i--){
             revers = revers +  str.charAt(i);
         }
         if(revers.equals(str)){
             System.out.println(revers + " " + str);
         } else {
            System.out.println(revers + "this is " + str);

         }


    }
    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    public static void angram(String str1, String str2){
         int count =0;
         if(str1.length() == str2.length()){
             for(int i = 0 ; i < str1.length(); i ++){
                 for(int j = 0 ; j< str2.length(); j++){
                     if(str1.charAt(i) == str2.charAt(j)){
                         count++;
                     }


                 }

             }

         }
         if(count == str2.length()){
             System.out.println("goood");
         } else{
             System.out.println("not good");
         }
    }

    static void rectamgel(){
         String star = "*";
         int hight = 5;
         int wigth = 0;

         for(int i = 0; i <= hight; i++) {
             for (int j = 0; j <= wigth; j++) {
                // if(wigth != 7) {
                     System.out.print(star);
              //   } else{
                  //   break;
              //   }

             }
             System.out.print("\n");
             wigth++;
         }

    }

    static void repalcenum(int x, int y){

        x = x - y;
        y = y + x;
        x = y -x;



        System.out.print(x + " " + y);
    }
     public static void reverslinkedlist(){
         LinkedList<Integer> ll = new LinkedList<>();
         ll.add(1);
         ll.add(2);
         ll.add(3);
         System.out.print(ll);
         LinkedList<Integer> ll2 = new LinkedList<>();
         ll.descendingIterator().forEachRemaining(ll2::add);
         System.out.print(ll2);

     }
    public static void main(String args[]){

        int index =  Fibonachi(12);
        reversstring("david");
        rectamgel();
   long n =    factorial(3);
   System.out.print(n);
      //  angram("harpo","opraj");
        reverslinkedlist();
     //   repalcenum(7,10);

       // System.out.println(rev);
    }

}
