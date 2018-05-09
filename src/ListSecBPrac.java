import java.util.*;

public class ListSecBPrac {
    public void getListItems()

    {

        List lst=new ArrayList();
        lst.add("A");
        lst.add("B");
        lst.add("B");
        lst.add("D");

        System.out.println(lst);
        getIteratedItems(lst);
    }

    public void getIteratedItems(List lst)
    {
        Iterator it=lst.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public ArrayList<Integer>getInteger()
    {
        ArrayList<Integer>integers=new ArrayList<>();

        integers.add(52);
        integers.add(78);

        return integers;
    }

}
