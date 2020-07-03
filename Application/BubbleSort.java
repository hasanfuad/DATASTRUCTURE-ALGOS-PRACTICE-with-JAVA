
package javaapplication1;

public class BubbleSort {
//    
//    public void sort(int array[])
//    {
//        for(int i = 0; i< array.length; i++){
//        for(int j = 1; j< array.length; j++){
//            if(array[j] < array[j-1]){
//                int temp = array[j];
//                array[j] = array[j-1];
//                array[j-1] = temp;

//                swap(array,j,j-1);
//            }
//        }
//        }
//    }
//    private void swap(int array[], int index1, int index2){
//    
//        int temp = array[index1];
//        array[index1] = array[index2];
//         array[index2] = temp;
//    }
    
        public void sort(int array[]){
             boolean isSorted;   
            for(int i = 0; i<array.length; i++){
                isSorted = true;
                for(int j = 1; j<array.length; j++){
                    
                    if(array[j] < array[j-1]){
                        swap(array, j, j-1);
                        isSorted = false;
                }
                    if(isSorted){
                    return;
                    }
            }
        }
}
            public void swap(int [] array,int index1,int index2){
                int temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }
}






