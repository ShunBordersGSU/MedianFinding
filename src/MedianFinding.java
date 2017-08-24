
public class MedianFinding {


    public static void main(String[] args) {

        //Creating the Median Algorithm object, and its equal sized, sorted, lists, and each lists' elements.
        MedianAlgorithms MA = new MedianAlgorithms();

        //Printing the Median Algorithm object's equal sized, sorted, lists.
        MA.printArrays();

        //Merging the lists.
        MA.merge();

        //Find the median of combined lists.
        MA.findMedian();

    }

}
