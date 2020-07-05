//print anagrams together
class Solution {
    public List<List<String>> Anagrams(String[] arr) {
         HashMap<String, List<String> > map = new HashMap<>(); 
         List<List<String>> list=new ArrayList<>();
        // loop over all words 
        for (int i = 0; i < arr.length; i++) { 
  
            // convert to char array, sort and 
            // then re-convert to string 
            String word = arr[i]; 
            char[] letters = word.toCharArray(); 
            Arrays.sort(letters); 
            String newWord = new String(letters); 
  
            // calculate hashcode of string 
            // after sorting 
            if (map.containsKey(newWord)) { 
  
                map.get(newWord).add(word); 
            } 
            else { 
  
                // This is the first time we are 
                // adding a word for a specific 
                // hashcode 
                List<String> words = new ArrayList<>(); 
                words.add(word); 
                map.put(newWord, words); 
            } 
        } 
  
        // print all the values where size is > 1 
        // If you want to print non-anagrams, 
        // just print the values having size = 1 
        for (String s : map.keySet()) { 
            List<String> values = map.get(s); 
                list.add(values); 
        } 
        map.clear();
        return list;
    }
}