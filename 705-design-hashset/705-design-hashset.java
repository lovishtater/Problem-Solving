class MyHashSet extends HashSet<Integer>
{
    List<Integer> hs;
    public MyHashSet() 
    {
        hs=new ArrayList<>();
	}
    
    public void add(int key) 
    {
        if(!contains(key))
            hs.add(key);
    }
    
    public void remove(int key) 
    {
        hs.remove(new Integer(key));
    }
    
    public boolean contains(int key) 
    {
        for(Integer val:hs)
        {
            if(val==key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */