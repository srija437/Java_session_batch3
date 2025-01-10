class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            String strOne = words[i];
            for(int j = 0; j < words.length; j++) {
                String strTwo = words[j];
                if(i!=j&& strOne.length()<strTwo.length()){
                    ifSubstring(strOne, strTwo) == true) {
                        list.add(strOne);
                        break;

                    }
                }
            }
        }
        public boolean ifSubstring(String strOne, String strTwo) {
            for(int i = 0; i < strTwo.length; i++) {
                if(strOne.equals(strTwo.substring(0,5) +1))
            return true;
            }
        }
    }
}