class Solution {
    public int lengthOfLastWord(String s) {
                  String ns=s.trim();
        int count =0;
        for(int i=ns.length()-1;i>=0;i--){
            if(ns.charAt(i)!=' '){
                count ++;

            }
            else{
                break;
            
                
            }
           
            
    
       }
        return count;
        
        
    }
}