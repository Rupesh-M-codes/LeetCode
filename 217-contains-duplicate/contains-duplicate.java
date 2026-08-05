class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean result = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int digit : nums){
            if(map.containsKey(digit)){
                map.put(digit,(digit+1));
                result = true;
            }else{
                map.put(digit,0);
            }
        }
        return result;
    }
}