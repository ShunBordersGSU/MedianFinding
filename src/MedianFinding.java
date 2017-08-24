import java.util.ArrayList;
public class MedianFinding {

    public static void main(String[] args) {
        //generating an arraylist with a size of between 5 and 15
        final int size= (int) ( 5 +(Math.random()*10));

        //generating a starting int of value between 0 and 9
        int k= (int) (Math.random()*10);

        //populating the arraylist
        ArrayList<Integer> l1= new ArrayList<Integer>();
        for (int i=0; i< size; i++){
            l1.add(k);

            //each subsequent value is between +0-14 greater than the previous
            k+=(int) (Math.random()*15);
        }

        //generating a starting int of value between 0 and 9 for the second list
        k= (int) (Math.random()*10);

        //populating the arraylist
        ArrayList<Integer> l2= new ArrayList<Integer>();
        for (int l=0; l< size; l++){
            l2.add(k);
            k+=(int) (Math.random()*15);
        }

        //printing the lists to the console for display
        boolean control=false;
        for (int m=0; m<size; m++){
            if (!control){
                if (m==0){
                    System.out.println("LIST1: ");
                    System.out.print(l1.get(m)+" ");
                }
                else if (!(m==(size-1))){
                    System.out.print(l1.get(m)+" ");
                }
                else if( m==size-1){
                    System.out.print(l1.get(m)+" ");
                    control=true;
                    m=0;
                }
            }
            if (control){
                if (m==0){
                    System.out.println("\nLIST2: ");
                    System.out.print(l2.get(m)+" ");
                }
                else if (!(m==(size-1))){
                    System.out.print(l2.get(m)+" ");
                }
                else if( m==size-1){
                    System.out.print(l2.get(m)+" ");
                }
            }
        }
        //combination of both lists
        ArrayList<Integer> l3= new ArrayList<Integer>();
        //merging the lists
        l3=merge(l1,l2);

        //printing the lists to the console for display
        for (int n=0; n<l3.size(); n++){
            if (n==0){
                System.out.println("\nCombined List: ");
                System.out.print(l3.get(n)+" ");
            }
            else
                System.out.print(l3.get(n)+" ");
        }

        double Median;

        //finding the median of the combined lists
        double rightMedian = (double) (l3.get(((l3.size()-1)/2)));
        double leftMedian = (double) (l3.get((l3.size()/2)));
        Median = (rightMedian+leftMedian)/2;

        System.out.println("\nMedian: "+Median);

    }

    private static ArrayList<Integer> merge(ArrayList<Integer> List1, ArrayList<Integer> List2) {
        //combination lists
        ArrayList<Integer> array = new ArrayList<Integer>();

        //merging algorithm
        while ((List1.isEmpty()==false) && (List2.isEmpty()==false)){
            if(List1.get(0)<List2.get(0)){
                array.add(List1.get(0));
                List1.remove(0);
            }
            else if(List1.get(0)>List2.get(0)){
                array.add(List2.get(0));
                List2.remove(0);
            }
            else{
                array.add(List1.get(0));
                array.add(List2.get(0));
                List1.remove(0);
                List2.remove(0);
            }
        }

        if (List1.isEmpty()){
            array.addAll(List2);
        }
        else
            array.addAll(List1);

        return array;
    }

}
