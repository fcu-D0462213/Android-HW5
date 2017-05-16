package com.example.hw5;

/**
 * Created by 路人 on 2017/5/14.
 */

public class AlbumPut {
    private int hostTeam;
    private String hostName;
    private String hostScore;
    private int guestTeam;
    private String guestName;
    private String guestScore;

    public AlbumPut(int hostTeam, String hostName, String hostScore, int guestTeam, String guestName, String guestScore) {
        this.hostTeam = hostTeam;
        this.hostName = hostName;
        this.hostScore = hostScore;
        this.guestTeam = guestTeam;
        this.guestName = guestName;
        this.guestScore = guestScore;
    }

    public int getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(int hostTeam) {
        this.hostTeam = hostTeam;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostScore() {
        return hostScore;
    }

    public void setHostScore(String hostScore) {
        this.hostScore = hostScore;
    }

    public int getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(int guestTeam) {
        this.guestTeam = guestTeam;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(String guestScore) {
        this.guestScore = guestScore;
    }
}
