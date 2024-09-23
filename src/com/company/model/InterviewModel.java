package com.company.model;
import com.company.dto.Candidate;

import java.util.LinkedList;
import java.util.Queue;

public class InterviewModel {
    static Queue<Candidate> candidateQueue;

    public InterviewModel() {
        candidateQueue = new LinkedList<>();
    }

    // add a candidate
    public void addCandidate(Candidate candidate) {
        candidateQueue.add(candidate);
        System.out.println(candidate.getName() + " has been added to the queue.");
    }

    // Process the next candidate in the queue
    public void processNextCandidate() {
        Candidate candidate = candidateQueue.poll();
        if (candidate != null) {
            System.out.println("Processing candidate: " + candidate);
        } else {
            System.out.println("No more candidates in the queue.");
        }
    }

    // Check if the queue is empty
    public boolean isQueueEmpty() {
        return candidateQueue.isEmpty();
    }


    public int waitingCandidates() {
        return candidateQueue.size();
    }


    public void proceedChoice(int n) {
        if (n==1){

        }
        if (n==2){

        }
    }
}