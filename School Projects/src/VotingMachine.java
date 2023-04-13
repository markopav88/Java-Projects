import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> votes;

    public VotingMachine() {
        votes = new HashMap<>();
        //votes = new HashMap<>();, makes a new empty HashMap is created to store the votes in the election.
        // The keys in the map will be the names of the candidates and the values will be the number of votes each candidate has received.
    }

    public void castVote(Ballot ballot) {
        String candidate = ballot.getCandidate();
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }
    /**
     The castVote method allows a voting machine to store a vote.
     It retrieves the candidate name from the input Ballot object and updates the count of votes for that candidate in the map of votes (votes).
     If the candidate has not received any votes yet, a new entry is added to the map with a vote count of 1.
     @return an updated voting machine with the newly cast vote stored
     */
    public Map<String, Integer> getVotes() {
        return votes;
    }

    public void clearVotes() {
        votes.clear();
    }
}

