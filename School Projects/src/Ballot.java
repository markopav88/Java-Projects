public class Ballot {
    private String candidate;
    /**
     The constructor below is for the Ballot class that initializes a Ballot object with a candidate name.
     @param candidate the name of the candidate the ballot is cast for
     */
    public Ballot(String candidate) {
        this.candidate = candidate;
    }

    public String getCandidate() {
        return candidate;
    }
}

