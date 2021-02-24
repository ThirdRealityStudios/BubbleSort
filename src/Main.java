public class Main
{
    public static void main(String[] args)
    {
        int[] unsorted = new int[]{0,2,3,4};

        BubbleSort bS = new BubbleSort();

        int[] sorted = bS.sort(unsorted);

        bS.print(sorted);
    }
}
