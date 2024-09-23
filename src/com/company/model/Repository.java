package com.company.model;

import com.company.dto.Candidate;

public class Repository {

   public  static void initialCnadidates(){
        Candidate c1 = new Candidate("ayush", 1);
        Candidate c2 = new Candidate("piyush", 2);
        InterviewModel.candidateQueue.offer(c2);
        InterviewModel.candidateQueue.offer(c1);
    }
}
