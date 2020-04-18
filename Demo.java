class A{

    int call(int arr[],int start,int end,int n)
    {
        int mid=start+(end-start)/2;
        if(start<=end)
        {
            if(arr[mid]==n)
            {
                return mid;
            }
            else if(arr[mid]>n)
            {
                return call(arr, 0, , n);
            }
            else{
                return call(arr, mid+1, end, n);
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,5,7,8,12};
        A ob=new A();
        int res=ob.call(arr, 0, arr.length-1,8);
        System.out.print(res);
    }
}