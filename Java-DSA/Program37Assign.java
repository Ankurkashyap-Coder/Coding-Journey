public class Program37Assign {
    
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int sum=0;
        for(int[] i : accounts){ // Inhance for loop which start from 0 till accounts length
            sum=0;
            for(int j : i){ // Also,  a inhance for loop which takes value of that index e.g. if Array is [[1,2,3], [2,3,4]] then j value is 1 for 1st iteration
                sum += j;
            }
                if(sum > result){
                    result = sum;
                }
            }
             return result;
        }
    }


