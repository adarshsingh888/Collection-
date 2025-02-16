import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Main
{
    public static void main (String[]args)
    {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);
        list.addLast(4);
        list.getFirst();
        list.getLast();
      //  System.out.println(list);
        list.add(0,-1); // add by index
        list.addAll(Arrays.asList(5,6,7,8,9));
        list.remove(1); // remove element at index 1
     //   list.removeAll(list); // remove all inside the ( list )
        System.out.println(list);

        list.removeIf(Main::remove); //remove element which is even
        list.removeIf(x -> x % 2 == 1 ); // remove element which is odd
        System.out.println(list);// remove element by condition
        LinkedList<String> animal=new LinkedList<>(Arrays.asList("Dog","Tiger","Lion"));
        LinkedList<String> animaltoremove= new LinkedList<>(Arrays.asList("Dog","Tiger"));
        animal.removeAll(animaltoremove);  // remove all elements of animaltoremove from animal
        System.out.println(animal);
       // System.out.println(list.get(2)); // by index

        Integer arr[]={99,88,77,66,55,44,33,22,11}; // non-primative array
        ArrayList<Integer> arrlist=new ArrayList<>(Arrays.asList(arr)); // primative array can not be used
        LinkedList<Integer> linklist=new LinkedList<>(arrlist);



        System.out.println(linklist);



    }
    public static boolean remove(int x){
        if(x % 2==0){
            return true;
        }
        return false;
    }
}