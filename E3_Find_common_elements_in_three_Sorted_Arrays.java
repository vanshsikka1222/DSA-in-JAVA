public class E3_Find_common_elements_in_three_Sorted_Arrays {
    //MOST Efficient Approach : Binary SEARCH
    //Creating Binary Search Function
    public static boolean binarySearch(int arr[] , int n, int key) {
        int l = 0;
        int h = n - 1;
        while(l <= h) {
            int mid = (l + h)/2;
            if(arr[mid] == key) {
                return true;
            }
            else if(arr[mid] > key) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return false;
    }
    //Creating Function to Find out COMMON Elements
    public static void findCommonElemets (int a[], int b[], int c[]) {
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;
        System.out.println("COMMON ELEMENTS in all 3 arrays are: ");
        //Iterate on Array 1
        for(int i = 0; i < n1; i++) {
            //If in SORTED Array adjacent 2 elemenyt are equal 
            //No need to search that again using BINARY SEARCH
            if(i != 0 && a[i] == a[i - 1]) {
                continue;
            }
            //Check if ELEMENT is present in ARRAY 2 and 3
            if(binarySearch(b, n2, a[i]) && binarySearch(c, n3, a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5,6,7};
        int a2[] = {1,3,5,7};
        int a3[] = {1,2,3,4,5};
        
        findCommonElemets(a1, a2, a3);
    }
}


