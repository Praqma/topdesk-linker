package com.praqma.plugins.atlassian.jira.jira.webwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

public class UpdateTopDeskAction extends JiraWebActionSupport {

    private static final Logger log = LoggerFactory.getLogger(UpdateTopDeskAction.class);
    
    @Override
    public String execute() throws Exception {
        log.warn("IT WORKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return super.execute(); //returns SUCCESS
    }
}
