public class BubbleSort
{
    public void swap(int[] swappable, int a, int b)
    {
        int temp = swappable[a];

        swappable[a] = swappable[b];

        swappable[b] = temp;
    }

    public int[] copy(int[] toCopy)
    {
        int[] copied = new int[toCopy.length];

        for(int i = 0; i < toCopy.length; i++)
        {
            copied[i] = toCopy[i];
        }

        return copied;
    }

    public void sort(int[] unsorted)
    {
        // Make sure the array is long enough for the next instructions in order not to get into an ArrayOutOfBoundsException.
        if(unsorted.length <= 1)
        {
            return;
        }

        for(int o = 0; o < unsorted.length; o++)
        {
            for(int i = 0; i+1 < unsorted.length; i++)
            {
                if(unsorted[i] > unsorted[i+1])
                {
                    swap(unsorted, i, i+1);
                }
            }
        }
    }

    public void print(int[] array)
    {
        System.out.println();
        System.out.println();

        for(int i : array)
        {
            System.out.print("| " + i + " ");
        }
    }
}
