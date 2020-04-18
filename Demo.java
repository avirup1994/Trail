class A{

    void call(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print(sum);
          
    }

    public static void main(String args[])
    {
        int arr[]={-3,2,3};
        A ob=new A();
        ob.call(arr);
    }
}