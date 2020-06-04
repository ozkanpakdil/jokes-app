package com.hardik.chucknorrisjokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements JokeService{
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke(){
		return chuckNorrisQuotes.getRandomQuote();
	}
}
