package com.company.viewModel;

import com.company.model.InterviewModel;
import com.company.model.Repository;
import com.company.view.InterviewPanelView;

public class InterviewViewModel {
    private static InterviewPanelView interviewPanelView = new InterviewPanelView();
    private static InterviewModel interviewModel = new InterviewModel();
    void start(){
        interviewPanelView.start();
        // initializing
        Repository.initialCnadidates();
        int choice = interviewPanelView.takeInputChoice();
        interviewModel.proceedChoice(choice);
    }

}
