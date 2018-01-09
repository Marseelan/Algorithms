public class HeapSort {

    HeapSort() {
        int a[] = {23,15,6,17,50,32,12,18};
        buildHeap(a);
        printArray(a);
    }

    void printArray(int a[]) {
        for(int i = 0 ; i < a.length ; i++) System.out.print(a[i] +" ");
        System.out.println("--------");
    }

    public void maxHeapify(int[] a,int i) {
        int left = 2*i+1 , right = 2*i+2;
        int largest = i; 
        if(left < a.length - 1 && a[left] > a[i]) largest = left;
        else largest = i;
        if(right < a.length - 1 && a[right] > a[largest]) largest = right;
        if(largest != i) {
            exch(a,largest,i);
            maxHeapify(a,largest);
        }
    }

    private void buildHeap(int[] a) {
        for(int i = a.length / 2 - 1; i >= 0 ; i--) {
            maxHeapify(a, i);
        }
    }
    
    private void exch(int[] a,int i , int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        new HeapSort();
    }

}