class Solution {
    public void createSubset(int[] nums,int i, List<List<Integer>> result,List<Integer> subList ) {
        // base case
        if (i == nums.length) {   
        result.add(new ArrayList<>(subList));
        return; 
        }
        //recursion
        subList.add(nums[i]);
        createSubset(nums,i+1,result,subList);
        //backtrack
        subList.remove(subList.size()-1);
        createSubset(nums,i+1,result,subList);
        }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
         List<Integer> subList =  new ArrayList<>();
        //recursion
        createSubset(nums,0,result,subList);
        return result;
    }
}
