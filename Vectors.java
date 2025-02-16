import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.Vector;

public class Vectors {

    public static void main(String args[]){

       Vector<Integer> vec=new Vector<>(2);
       System.out.println(vec.capacity()); // output 2
       Vector<Integer> vec1=new Vector<>();
        System.out.println(vec1.capacity()); // output 10

        Vector<Integer> vec3=new Vector<>(2,2);
        System.out.println(vec1.capacity()); // curr output 2 is

       vec3.add(3);
       vec3.add(3);
       vec3.add(3);
       System.out.println(vec3.capacity()); //output 4 as it is incresed by 2

        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        System.out.println(vec1.capacity()); //output 20 initaly 10 but 11 new element add so the size got double

        // vector is thread syncronized
        Vector<Integer> vec4=new Vector<>();
        Thread  th=new Thread(
                ()->{
                    for(int i=0;i<1000;i++){

                       vec4.add(i);
                    }
                }

        );
        Thread  th2=new Thread(
                ()->{
                    for(int i=0;i<1000;i++){

                        vec4.add(i);
                    }
                }

        );
        th.start();
        th2.start();
        try{
            th.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println(vec4.size()); // synchronized result 2000 as  vector is thread safe

        ArrayList<Integer> list=new ArrayList<>();
        Thread  thlist=new Thread(
                ()->{
                    for(int i=0;i<1000;i++){

                        list.add(i);
                    }
                }
        );
        Thread  thlist2=new Thread(
                ()->{
                    for(int i=0;i<1000;i++){

                        list.add(i);
                    }
                }
        );
        thlist.start();
        thlist2.start();
        try{
            thlist.join();
            thlist2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println(list.size()); // unsyncornized result   as arraylist is not thread safe



    }

}
