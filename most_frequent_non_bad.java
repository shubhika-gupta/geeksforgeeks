//Non bad word frequenty
class Solution{
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    static String MostFrequent(String p, List<String> taboo) 
    {
        // code here
        String res="";
        for(int i=0;i<p.length();i++){
            char c=Character.toLowerCase(p.charAt(i));
            res+=c+"";
        }
        HashMap<String,Integer> map=new HashMap<>();
        String s[]=res.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for(int i=0;i<s.length;i++)
        map.put(s[i],map.getOrDefault(s[i],0)+1);
        HashMap<String,Integer> m=sortByValue(map);
        int max=-1;
        for (Map.Entry<String, Integer> en : m.entrySet()){
            if(taboo.contains(en.getKey()))
            continue;
            max=Math.max(max,en.getValue());
        }
        for (Map.Entry<String, Integer> en : m.entrySet()){
        if (Objects.equals(max, en.getValue())&&!taboo.contains(en.getKey())) {
            return en.getKey();
        }
        }
        return "";
    }
}