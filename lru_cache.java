//LRU cache
class LRUCache
{
    static LinkedHashMap<Integer,Integer> map;
    static int capacity;
    LRUCache(int cap)
    {
        this.capacity=cap;
        map=new LinkedHashMap<Integer,Integer>(cap,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size()>capacity;
            }
    };
    }

    // This method works in O(1)
    public static int get(int key)
    {
        // your code here
        return map.getOrDefault(key,-1);
    }

    // This method works in O(1)
    public static void set(int key, int value)
    {
        // your code here
        map.put(key,value);
    }
}