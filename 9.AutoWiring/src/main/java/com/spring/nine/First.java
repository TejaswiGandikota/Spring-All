package com.spring.nine;

public class First {
	private Second second;
        
        public First() {
		super();
		// TODO Auto-generated constructor stub
	}

		public First(Second second) {
		super();
		this.second = second;
	}

		public Second getSecond() {
		return second;
	}

	public void setSecond(Second second) {
		this.second = second;
	}

		public void print()
        {
        	System.out.println("Id:" + second.getId());
        	System.out.println("Name:" + second.getName());
        }
}
