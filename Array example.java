public class ArrayExample{
    public static void main(String[]args)
    {
        int[]marks={85,90,78,92,88};
        int total=0;
        double average;
        System.out.println("student Marks:");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("subject" +(i+1)+":"+marks[i]);
            total=total+marks[i];
        }
        average=(double)total/marks.length;
        System.out.println("\nTotal Marks=" +total);
        System.out.println("Average Marks=" +average);
    }
}