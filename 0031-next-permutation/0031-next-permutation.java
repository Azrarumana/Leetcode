class Solution {
    public void nextPermutation(int[] a) {
        int ind1=-1;
        int ind2=-1;
        int n=a.length;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<a[i+1]){
            ind1=i;
            break;
        }
        }
        if(ind1==-1)
        {
            reverse(a,0);
        }
        else{
            for(int i=n-1;i>=0;i--)
            {
                if(a[i]>a[ind1]){
                ind2=i;
                break;
            }
            }
            swap(a,ind1,ind2);
            reverse(a,ind1+1);
        }
    }
        void swap(int[] a,int i,int j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        void reverse(int[] a,int start)
        {
            int i=start;
            int j=a.length-1;
            while(i<j)
            {
                swap(a,i,j);
                i++;
                j--;
            }
        }
        }
        
   