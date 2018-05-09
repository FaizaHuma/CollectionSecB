import java.security.PublicKey;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



       /* LinkedListPrac lp=new LinkedListPrac();
        lp.retLinkedItems();;*/

       /*Setdemo sd=new Setdemo();
       sd.retSetValue();*/

       /*ListSecBPrac lb=new ListSecBPrac();
       ArrayList<Integer>ar=lb.getInteger();
        for(Integer ig:ar)
        {
            System.out.println(ig);
        }*/


       Student_Controller sc=new Student_Controller();
       /*for(Student st1:sc.getStudentList())
       {
           System.out.print(st1.getStudentID());
           System.out.println(st1.getStudentname());
       }*/

      for(Computer_Student cs1:sc.retCompStudent())
       {
           System.out.print(cs1.getSec());
           System.out.println(cs1.getCompStID());
       }


      /*MapPractice mp=new MapPractice();
      mp.getMap();*/

    }
}
