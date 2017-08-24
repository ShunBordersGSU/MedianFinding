import java.util.ArrayList;

public class MedianAlgorithms {

    private ArrayList<Integer> List1;
    private ArrayList<Integer> List2;
    private ArrayList<Integer> List;
    private int size;

    public MedianAlgorithms() {
        //Setting a size of between 5 and 15 for both lists..
        size = (int) (5 + (Math.random() * 10));

        //Generating a starting int of value between 0 and 9 for the first.
        int k = (int) (Math.random() * 10);

        //Populating the first list.
        this.List1 = new ArrayList<Integer>();
        for (int i = 0; i < this.size; i++) {
            this.List1.add(k);

            //Each subsequent value is between +0-14 greater than the previous.
            k += (int) (Math.random() * 15);
        }

        //Generating a starting int of value between 0 and 9 for the second list.
        k = (int) (Math.random() * 10);

        //Populating the second list.
        this.List2 = new ArrayList<Integer>();
        for (int l = 0; l < this.size; l++) {
            List2.add(k);
            k += (int) (Math.random() * 15);
        }

        this.List = new ArrayList<Integer>();
    }

    public void printArrays() {
        //Printing the lists to the console for display
        boolean control = false;
        for (int m = 0; m < this.size; m++) {
            if (!control) {
                if (m == 0) {
                    System.out.println("LIST1: ");
                    System.out.print(this.List1.get(m) + " ");
                } else if (!(m == (this.size - 1))) {
                    System.out.print(this.List1.get(m) + " ");
                } else if (m == this.size - 1) {
                    System.out.print(this.List1.get(m) + " ");
                    control = true;
                    m = 0;
                }
            }
            if (control) {
                if (m == 0) {
                    System.out.println("\nLIST2: ");
                    System.out.print(this.List2.get(m) + " ");
                } else if (!(m == (this.size - 1))) {
                    System.out.print(this.List2.get(m) + " ");
                } else if (m == this.size - 1) {
                    System.out.print(this.List2.get(m) + " ");
                }
            }
        }
    }

    public void findMedian() {
        //Printing the lists to the console for display.
        for (int n = 0; n < this.List.size(); n++) {
            if (n == 0) {
                System.out.println("\nCombined List: ");
                System.out.print(this.List.get(n) + " ");
            } else
                System.out.print(this.List.get(n) + " ");
        }

        double Median;

        //Finding the median of the combined lists. (Combined lists will have two median numbers. Therefore, an
        //average needs to be computed from the two numbers.)
        double rightMedian = (double) (this.List.get(((this.List.size() - 1) / 2)));
        double leftMedian = (double) (this.List.get((this.List.size() / 2)));
        Median = (rightMedian + leftMedian) / 2;

        System.out.println("\nMedian: " + Median);
    }

    public void merge() {
        //Merging the two equal sized and sorted lists.
        while ((!this.List1.isEmpty()) && (!this.List2.isEmpty())) {
            if (this.List1.get(0) < this.List2.get(0)) {
                this.List.add(this.List1.get(0));
                List1.remove(0);
            } else if (this.List1.get(0) > this.List2.get(0)) {
                this.List.add(this.List2.get(0));
                this.List2.remove(0);
            } else {
                this.List.add(List1.get(0));
                this.List.add(List2.get(0));
                this.List1.remove(0);
                this.List2.remove(0);
            }
        }

        if (this.List1.isEmpty()) {
            this.List.addAll(this.List2);
        } else
            this.List.addAll(this.List1);
    }
}
