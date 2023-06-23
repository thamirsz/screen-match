import br.com.alura.screenmatch.modelos.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setLengthInMinutes(180);

        myMovie.showDataSheet();
        myMovie.rate(10);
        myMovie.rate(8);
        myMovie.rate(5);
        System.out.println("total de avaliações: " + myMovie.getTotalRatings();
        System.out.println(myMovie.getAverage());

    }

}
