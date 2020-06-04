package services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements JokeService{
	private final JokeService chuckNorrisQuotes;
	
	public ChuckNorrisJokeService(JokeService chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke(){
		return chuckNorrisQuotes.getRandomQuote();
	}
}
