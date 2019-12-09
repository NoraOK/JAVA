package com.noraokeeffe.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.noraokeeffe.lookify.models.Song;
import com.noraokeeffe.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService songServ;

	public SongController(SongService songServ) {
		this.songServ = songServ;
	}
	
	@RequestMapping("/")
	public String index() {
		return "/songs/index.jsp";
	}
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songServ.allSongs();
		model.addAttribute("songs", songs);
		return "/songs/search.jsp";
	}
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "/songs/new.jsp";
	}
	@RequestMapping(value="/song_create", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "/songs/new.jsp";
		}else {
			songServ.createSong(song);
			return "redirect:/dashboard";
		}
	}
	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = songServ.findSong(id);
		model.addAttribute("song", song);
		return "/songs/show.jsp";
	}
	@RequestMapping(value="/song_delete/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		songServ.deleteSong(id);
		return "redirect:/dashboard";
	}
	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
		model.addAttribute("songs", songServ.topTen());
		return "/songs/topTen.jsp";
	}
	@RequestMapping("/search")
	public String search(@RequestParam("search") String search, Model model) {
		List<Song> songs = songServ.findArtistSongs(search);
		model.addAttribute("song", songs);
		return "redirect:/search/" + search;
	}
	@RequestMapping("/search/{search}")
	public String searchSong(@PathVariable("search") String search, Model model) {
		List<Song> songs = songServ.findArtistSongs(search);
		model.addAttribute("songs", songs);
		return "/songs/results.jsp";
	}


}
