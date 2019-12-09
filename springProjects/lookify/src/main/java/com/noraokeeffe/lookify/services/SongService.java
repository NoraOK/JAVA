package com.noraokeeffe.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.noraokeeffe.lookify.models.Song;
import com.noraokeeffe.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepo;
	
	public SongService (SongRepository songRepo) {
		this.songRepo = songRepo;
	}
	public List<Song> allSongs(){
		return songRepo.findAll();
	}
	public Song create(Song song) {
		return songRepo.save(song);
	}
	public Song findSong(Long id) {;
		Optional<Song> optionalSong=songRepo.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		}else{
			return null;
		}
	}
	public Song createSong(Song song) {
		return songRepo.save(song);
	}
	public void deleteSong(Long id) {
		Song song = findSong(id);
		songRepo.delete(song);
	}
	public List<Song> topTen() {
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	public List<Song> findArtistSongs(String search) {
		return songRepo.findByArtistContaining(search);
	}
	
	
}
