package lecture01.exam;

public class Sum {

    public int sumRange(int start, int end)
    {
        int sum = 0;
        if (end < start)
            System.out.println("ERROR: Invalid Range");
        else
            for (int num = start; num <= end; num++)
                sum += num;
        return sum;
    }




}
