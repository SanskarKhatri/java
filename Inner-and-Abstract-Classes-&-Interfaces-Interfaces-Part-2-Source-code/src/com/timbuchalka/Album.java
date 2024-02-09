package com.timbuchalka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if(songs.findSong(title) == null) {
            this.songs.addSong(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        return songs.findSong(title);
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.getSongs().size())) {
            playList.add(this.songs.getSongs().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public Song findSong(String title) {
            for(Song i : songs) {
                if(i.getTitle().equalsIgnoreCase(title)) {
                    return i;
                }
            }
            return null;
        }

    }



















}
