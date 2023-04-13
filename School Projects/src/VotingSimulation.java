import java.util.Map.Entry;
import java.util.Scanner;
//Marko Pavic
//3-14-2023
//Project Voting Sim
//Prof Johnson SD1

public class VotingSimulation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a two-round election simulator");
        System.out.print("Enter the number of Candidates: ");
        int numCandidates = input.nextInt();
        while (numCandidates <= 1) {
            System.out.println("You must have at least two candidates to have an election");
            System.out.print("Enter the number of candidates: ");
            numCandidates = input.nextInt();
            //allows for numerical input to base number of candidates
        }

        System.out.print("Enter the number of voters: ");
        int numVoters = input.nextInt();

        System.out.print("How many times would you like to run this simulation program?: ");
        int numRuns = input.nextInt();

        for (int run = 0; run < numRuns; run++) {
            System.out.println("Run " + (run + 1) + ":");

            Voter[] voters = new Voter[numVoters];
            for (int i = 0; i < numVoters; i++) {
                voters[i] = new Voter(i);
            }
            /**
             This code above ^ creates an array of Voter objects with the specified number of voters (numVoters).
             For each index in the array, a new Voter object is created and initialized with the corresponding voter ID (i).
             @param numVoters the number of voters to be created and stored in the array
             @return an array of Voter objects, each with a unique voter ID
             */

            VotingMachine votingMachine = new VotingMachine();
            for (Voter voter : voters) {
                Ballot ballot = voter.vote(numCandidates);
                votingMachine.castVote(ballot);
            }

            System.out.println("The votes for each candidate in the first round are: " + votingMachine.getVotes());

            // Determine the top two candidates
            /**

             This code below finds the two candidates with the highest number of votes in a voting machine.
             It loops through each entry in the map of votes (obtained from the method votingMachine.getVotes().entrySet())
             and updates the top two candidates (topCandidate1 and topCandidate2) as necessary.
             @param votingMachine the voting machine object containing the map of votes
             @return the top two candidates (topCandidate1 and topCandidate2) as Entry objects,
             each with a candidate name (key) and the number of votes (value)
             */
            Entry<String, Integer> topCandidate1 = null;
            Entry<String, Integer> topCandidate2 = null;
            for (Entry<String, Integer> entry : votingMachine.getVotes().entrySet()) {
                if (topCandidate1 == null || entry.getValue() > topCandidate1.getValue()) {
                    topCandidate2 = topCandidate1;
                    topCandidate1 = entry;
                } else if (topCandidate2 == null || entry.getValue() > topCandidate2.getValue()) {
                    topCandidate2 = entry;
                }
            }

            System.out.println("The top two candidates are " + topCandidate1.getKey() + " and " + topCandidate2.getKey() + ".");

            // Second round of voting
            /**
             This clears the votes in a voting machine and allows each voter to cast a new vote.
             It first clears the votes by calling votingMachine.clearVotes().
             Then, for each voter in the array of voters, a ballot is obtained by calling voter.vote(2).
             The candidate name on the ballot is checked and if it is "B", the ballot is updated
             to have the name of the second-highest candidate (topCandidate2).
             Otherwise, the ballot is updated to have the name of the highest candidate (topCandidate1).
             */

            /**Finally, the updated ballot is cast by calling votingMachine.castVote(ballot).
             @param voters the array of Voter objects that will cast their votes
             @param votingMachine the voting machine that will store the cast votes
             @return an updated voting machine with all voters having cast their new votes */

            votingMachine.clearVotes();
            for (Voter voter : voters) {
                Ballot ballot = voter.vote(2);
                String candidate = ballot.getCandidate();
                if (candidate.equals("B")) {
                    ballot = new Ballot(topCandidate2.getKey());
                } else {
                    ballot = new Ballot(topCandidate1.getKey());
                }
                votingMachine.castVote(ballot);
            }


            System.out.println("The votes for each candidate in the second round are: " + votingMachine.getVotes());

            // Determine the winner
            /**
             This code retrieves the number of votes for the two highest candidates (topCandidate1 and topCandidate2) in a voting machine.
             It uses the votingMachine.getVotes().get(key) method to retrieve the number of votes for each candidate,
             where key is the candidate name.
             @param votingMachine the voting machine that stores the votes
             @param topCandidate1 the first candidate with the highest number of votes
             @param topCandidate2 the second candidate with the highest number of votes
             @return the number of votes for each of the two highest candidates
             */
            int votesForCandidate1 = votingMachine.getVotes().get(topCandidate1.getKey());
            int votesForCandidate2 = votingMachine.getVotes().get(topCandidate2.getKey());
            System.out.println("The winner is " + ((votesForCandidate1 > votesForCandidate2) ? topCandidate1.getKey() : topCandidate2.getKey()));
            System.out.println();
        }
    }}
