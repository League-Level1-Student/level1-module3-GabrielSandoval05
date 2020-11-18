package _05_netflix;

public class Netflix {

	public static void main(String[] args) {
	
		//1.
		Movie Moana = new Movie("Moana", 5);
		
		Movie List = new Movie ("Schindler's List", 5);
		
		Movie pets = new Movie ("Secret life of pets", 3);
		
		Movie twilight = new Movie("Twilight", 1);
		
		Movie aladdin = new Movie("Aladdin", 4);
		
		//2.
		Moana.getTicketPrice();
		
		//3.
		NetflixQueue queue = new NetflixQueue();
		//4.
		queue.addMovie(Moana);
		queue.addMovie(aladdin);
		queue.addMovie(twilight);
		queue.addMovie(pets);
		queue.addMovie(List);
		//5.
		queue.printMovies();
		//6.
		queue.getBestMovie();
		System.out.println("The best movie is " + queue.getBestMovie());
		//7.
		queue.sortMoviesByRating();
		System.out.println("The Second Best Movie is " + queue.getMovie(2));
		
	}
	
	
	
}
