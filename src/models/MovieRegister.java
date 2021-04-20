package models;

public class MovieRegister {

	private String title;
	private String synopsis;
	private String genre;
	private String whereWatch;
	private boolean alreadyWatched;
	private int avaliation;
	
	public MovieRegister(
			String title,
			String synopsis,
			String genre,
			String whereWatch,
			boolean alreadyWatched,
			int avaliation
	) {
		this.title = title;
		this.synopsis = synopsis;
		this.genre = genre;
		this.whereWatch = whereWatch;
		this.alreadyWatched = alreadyWatched;
		this.avaliation = avaliation;
	}
	
	@Override
	public String toString() {
		String alreadyWatchedString = alreadyWatched ? "Yes" : "No";
		
		String toReturn = "Movie Title: " + title + "\n"
		+ "Movie Synopsis: " + synopsis + "\n"
		+ "Movie Genre: " + genre + "\n"
		+ "Where Watch: " + whereWatch + "\n"
		+ "Already Watched: " + alreadyWatchedString + "\n"
		+ "Movie Avaliation: " + avaliation + " stars";
		return toReturn;
	}
}
