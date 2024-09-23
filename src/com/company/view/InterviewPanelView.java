package com.company.view;

import com.company.dto.Candidate;
import static java.lang.System.*;
import java.util.Scanner;

public class InterviewPanelView {
    private static Scanner sc = new Scanner(in);
    public Candidate inputOfCandidate() {
      String name =   addTheCandidateName();
      int id = addTheCandidateId();

        Candidate newCandidate = new Candidate(name, id);
        return newCandidate;


    }

    public  int takeInputChoice() {
        out.println("Enter your choice");
        int choice = addTheCandidateId();
        return choice;
    }

    private String addTheCandidateName() {
            String name = sc.nextLine();
        return name;
    }

    private int addTheCandidateId(){
        boolean flag = true;

        try
        {
            while (flag){
                int id = sc.nextInt();
                if(id>0) return id;
            }
        }
        catch (Exception e){
            out.println("please have a valid id");
        }
    return 121;
    }


    public void start() {
        out.println("Welcome to the online interview Pannel");
        String options = """
                1. See the numbers of candidates in the interview Pannel
                2. Process the Next Candidate
                3. Which candidate is next to interview
                4. exit
                """;
    }
}
