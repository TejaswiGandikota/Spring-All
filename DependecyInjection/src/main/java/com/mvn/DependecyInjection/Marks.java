package com.mvn.DependecyInjection;

public class Marks {
        private int Maths;
        private int Physics;
        private int Chemistry;

		/*
		 * public Marks() {
		 * 
		 * } public Marks(int Maths, int Physics, int Chemistry) { this.Maths = Maths;
		 * this.Physics = Physics; this.Chemistry = Chemistry; }
		 */
        public void setMaths(int Maths)
        {
        	this.Maths = Maths;
        }
        public void setPhysics(int Physics)
        {
        	this.Physics = Physics;
        }
        public void setChemistry(int Chemistry)
        {
        	this.Chemistry = Chemistry;
        }
        public int getMaths()
        {
        	return this.Maths;
        }
        public int getPhysics()
        {
        	return this.Physics;
        }
        public int getChemistry()
        {
        	return this.Chemistry;
        }
}
