class UndergroundSystem {

	HashMap<String, List<Double>> timeTaken;
	HashMap<Integer, String> checkInData;
    public UndergroundSystem() {
    	timeTaken = new HashMap();
    	checkInData = new HashMap<Integer, String>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkInData.put(id, stationName);
        List<Double> list = new ArrayList<Double>();
        list.add((double)t);
        timeTaken.put(id+"", list);
    }
    
    public void checkOut(int id, String stationName, int t) {
	        String one = checkInData.get(id);
	        List<Double> start = timeTaken.get(id+"");
	        double count = t-start.get(0);
	        List<Double> list = new ArrayList<Double>();
	        list.add(count);
	        if(timeTaken.containsKey(one+"|"+stationName)){
	        	list.addAll(timeTaken.get(one+"|"+stationName));
	        }
	        timeTaken.put(one+"|"+stationName, list);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        List<Double> list = timeTaken.get(startStation+"|"+endStation);
        double sum = 0;
        for(Double a: list)
        	sum = sum+a;
        return sum/list.size();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */