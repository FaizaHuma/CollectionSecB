import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

    public void retSetValue()
    {
        Set st=new TreeSet();

        st.add("Faiza Huma 52");
        st.add("This is a Set demo");
        st.add("Faiza Huma 52");
        st.add("Faiza Huma 52");
        st.add("Faiza Huma 52");
        System.out.println(st);
        System.out.println("----For each----");
        retForEach(st);
    }

    public void retForEach(Set st)
    {
        for(Object ob:st)
        {
            System.out.println(ob);
        }
    }

    public ArrayList getdata(){

        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

}
