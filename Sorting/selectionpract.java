public class selectionpract {

    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void print(int arr[]){

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[])
    {
        int arr[]={7,4,1,2};

        selection(arr);

        print(arr);
    }
    
}
