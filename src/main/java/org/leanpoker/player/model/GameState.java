package org.leanpoker.player.model;

import java.util.List;

public class GameState {
    private int tournamentId;
    private int gameId;
    private int round;
    private int betIndex;
    private int smallBlind;
    private int currentBuyIn;
    private int pot;
    private int minimumRaise;
    private int dealerId;
    private int orbits;
    private int inActionId;
    private List<PokerBot> allBots;
    private List<Card> communityCards;

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getBetIndex() {
        return betIndex;
    }

    public void setBetIndex(int betIndex) {
        this.betIndex = betIndex;
    }

    public int getSmallBlind() {
        return smallBlind;
    }

    public void setSmallBlind(int smallBlind) {
        this.smallBlind = smallBlind;
    }

    public int getCurrentBuyIn() {
        return currentBuyIn;
    }

    public void setCurrentBuyIn(int currentBuyIn) {
        this.currentBuyIn = currentBuyIn;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getMinimumRaise() {
        return minimumRaise;
    }

    public void setMinimumRaise(int minimumRaise) {
        this.minimumRaise = minimumRaise;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public int getOrbits() {
        return orbits;
    }

    public void setOrbits(int orbits) {
        this.orbits = orbits;
    }

    public int getInActionId() {
        return inActionId;
    }

    public void setInActionId(int inActionId) {
        this.inActionId = inActionId;
    }

    public List<PokerBot> getAllBots() {
        return allBots;
    }

    public void setAllBots(List<PokerBot> allBots) {
        this.allBots = allBots;
    }

    public List<Card> getCommunityCards() {
        return communityCards;
    }

    public void setCommunityCards(List<Card> communityCards) {
        this.communityCards = communityCards;
    }

   
}
