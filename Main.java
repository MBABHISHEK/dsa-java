

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){

            List <String> in =new ArrayList<String>();
            in.add("10");
            in.add("hai");
           Object a= in.get(0);
        System.out.println(in.size());

        Iterator itr = in.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());


    }
}