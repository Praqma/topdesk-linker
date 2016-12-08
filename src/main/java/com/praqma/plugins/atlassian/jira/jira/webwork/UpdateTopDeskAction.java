package com.praqma.plugins.atlassian.jira.jira.webwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

public class UpdateTopDeskAction extends JiraWebActionSupport {

    private static final Logger log = LoggerFactory.getLogger(UpdateTopDeskAction.class);
    
    String issue;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
    
    @Override
    public String execute() throws Exception {
        log.warn("IT WORKZZZZZZZZZZZ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if (issue == null) {
            log.warn("it's fucking null");
        } else {
            log.warn("TADA!!");
            log.warn(issue);
        }
        
        return super.execute(); //returns SUCCESS
    }
}
