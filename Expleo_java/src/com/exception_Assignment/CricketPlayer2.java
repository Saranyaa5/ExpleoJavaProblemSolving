package com.exception_Assignment;
import java.util.Arrays;
import java.util.Scanner;

class InvalidAverageException extends Exception {
    public InvalidAverageException(String message) {
        super(message);
    }
}

class CricketPlayer2{
    private String name;
    private int noOfInnings;
    private int noTimesNotOut;
    private int totalRuns;
    private double batAvg;

    public CricketPlayer2(String name, int noOfInnings, int noTimesNotOut, int totalRuns) throws InvalidAverageException {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noTimesNotOut = noTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = avg(noOfInnings, noTimesNotOut, totalRuns);
    }

    private static double avg(int noOfInnings, int noTimesNotOut, int totalRuns) throws InvalidAverageException {
        int timesOut = noOfInnings - noTimesNotOut;
        if (timesOut == 0) {
            throw new InvalidAverageException("Batting Average cannot be calculated as player was never out.");
        }
        return (double) totalRuns / timesOut;
    }

    public static void sortPlayer(CricketPlayer2[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.batAvg, p1.batAvg));
    }

    public void display() {
        System.out.printf("%-15s %-10d %-15d %-10d %-10.2f%n", name, noOfInnings, noTimesNotOut, totalRuns, batAvg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of players: ");
        int n = sc.nextInt();
        CricketPlayer2[] players = new CricketPlayer2[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nEnter details for player " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("No. of Innings: ");
                int innings = sc.nextInt();
                System.out.print("No. of Times Not Out: ");
                int notOut = sc.nextInt();
                System.out.print("Total Runs: ");
                int runs = sc.nextInt();

                players[i] = new CricketPlayer2(name, innings, notOut, runs);
            } catch (InvalidAverageException e) {
                System.out.println(e.getMessage());
                i--; 
            }
        }

        CricketPlayer2.sortPlayer(players);

        System.out.println("\nSorted Player List (by Batting Average):");
        System.out.printf("%-15s %-10s %-15s %-10s %-10s%n", "Name", "Innings", "Not Out", "Runs", "Bat Avg\n");
        

        for (CricketPlayer2 player : players) {
            player.display();
        }
        

        sc.close();
    }
}
