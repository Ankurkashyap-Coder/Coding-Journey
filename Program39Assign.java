import java.util.List;
import java.util.ArrayList;
class Program39Assign {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result = new ArrayList<>(); 
       int temp;
       int max = 0;
       for(int i=0;i<candies.length;i++){
        max = candies[i] > max ? candies[i] : max;
       }
       for(int i=0 ; i<candies.length;i++){
        temp = candies[i];
        if((temp + extraCandies) >= max ){
             result.add(true);   
            }
            else{
                result.add(false);
            }        
            }

            return result; 
       }
       
    }

