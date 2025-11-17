package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {

    private List<Track> tracks;

    public CompactDisc(String title, String category, double cost, List<Track> tracks) {
        super(title, cost, category);
        this.tracks = new ArrayList<>(tracks);
    }

    public List<Track> getTracks() {
        return new ArrayList<>(tracks);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTracks: " + this.tracks;
    }

    public int totalLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }
}
