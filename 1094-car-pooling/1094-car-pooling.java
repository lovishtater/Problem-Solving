class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<pair> pq1 = new PriorityQueue<>(Comparator.comparing(pair::getTime));
		PriorityQueue<pair> pq2 = new PriorityQueue<>(Comparator.comparing(pair::getTime));
	
		for (int i = 0; i < trips.length; i++) {
			int pass = trips[i][0];
			int startTime = trips[i][1];
			int endTime = trips[i][2];
			pq1.add(new pair(startTime, pass));
			pq2.add(new pair(endTime, pass));
		}
		boolean flag = false;
		while (pq1.size() != 0) {
			pair p1 = pq1.peek();
			pair p2 = pq2.peek();
			if (p1.time < p2.time) {
				pq1.poll();
				capacity -= p1.passengers;
				if (capacity < 0) {
					flag = true;
					break;
				}
			} else {
				pq2.poll();
				capacity += p2.passengers;
			}
		}
		if (flag) {
			return false;
		} else {
			return true;
		}
    }
}

class pair {
	int time;
	int passengers;

	pair(int time, int passengers) {
		this.time = time;
		this.passengers = passengers;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
}