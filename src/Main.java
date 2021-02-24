public class Main
{
    public static void main(String[] args)
    {
        int[] unsorted = new int[]{5,5,99,-22,0,2,3,4};

        BubbleSort bS = new BubbleSort();

        bS.print(unsorted);
        bS.sort(unsorted);
        bS.print(unsorted);
    }
}
