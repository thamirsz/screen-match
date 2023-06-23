package br.com.alura.screenmatch.modelos;

public class Movie {
    private String name;
   private int releaseYear;
   private boolean includedInPlan;
   private   double sumOfRatings;
    private int totalRatings;
    private int lengthInMinutes;

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void showDataSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void rate (double rating){
        sumOfRatings += rating;
        totalRatings++;

    }
   public double getAverage(){
        return sumOfRatings/totalRatings;
    }
    
}
