import java.util.*;

public class LinkedListPrac {

    public void retLinkedItems()
    {
        LinkedList lst=new LinkedList();
        lst.add("Faiza");
        lst.add("Huma");
        lst.add("ID 52");

        System.out.println(lst);
        IterName(lst);
        System.out.println("----For each---");
        getForEach(lst);

    }

    public void IterName(LinkedList lst)
    {
        Iterator it=lst.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public void getForEach(LinkedList lst)
    {
        for(Object o:lst)
        {
            System.out.println(o);
        }
    }





}
