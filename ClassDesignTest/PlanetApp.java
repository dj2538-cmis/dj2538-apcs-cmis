package ClassDesignTest;

public class PlanetApp
    {
        private int maxPopulation;
        private double percentSpaceMarines;
        private double maxSpaceMarinesPerStarDestoryer;
        private int nPlanets;
        private int radius;
        private int SpaceMarines;
        private int StarDestoryers;
        private double namenum;
        private String name;
        private String rank;
        
        public PlanetApp()
          {
            String[] name = {"Beta", "Alpha", "Gamma", "Delta"};
            String[] rank = {"Friendly", "Hostile", "Ally"};
            namenum = ((double)Math.random());
            maxPopulation = 1;
            percentSpaceMarines = 1.00;
            maxSpaceMarinesPerStarDestoryer = 1;
            radius = 1;
            SpaceMarines =1;
            StarDestoryers =1;
            
          } // end constructor 
          
        public PlanetApp(int maxPopulation,double percentSpaceMarines,double maxSpaceMarinesPerStarDestoryer,
                         int nPlanets, int radius, int SpaceMarines, int StarDestoryers, String name, String rank)
          {
           this.maxPopulation = maxPopulation;
           this.percentSpaceMarines = percentSpaceMarines;
           this.maxSpaceMarinesPerStarDestoryer = maxSpaceMarinesPerStarDestoryer;
           this.radius = radius;
           this.SpaceMarines = SpaceMarines;
           this.StarDestoryers = StarDestoryers;
           this.name = name;
           this.rank = rank;
           
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output = "Name: "+ name + "   " + namenum + "\n" +
                    "Relationship: " + rank + "\n" +
                    "Radius: " + radius + "\n" +
                    "Population: " + maxPopulation + "\n" +
                    "Space Marines as percent of Pop.: " + percentSpaceMarines+"\n" +
                    "Space Marines: " + SpaceMarines + "\n" + 
                    "Star Destroyers: " + StarDestoryers + "\n" +
                    "Space Marines per star destroyer: " + maxSpaceMarinesPerStarDestoryer + "\n";
           return output; 
          }
    }
    