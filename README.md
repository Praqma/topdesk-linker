# topdesk-linker (Jira Plugin)
The idea behind this plugin is to add an entry to the issue views More Actions menu entry.

The entry will look for a number of links based on a link type(preferred) or a naming convention of the link. It will
collect all of the links. 

For each link it will generate an HTTP POST request and send it to a defined end point. The POST request is intended to
update the end point with the status of the Jira issue. 

## Getting started
We should use our 2016 code camp and see if we can implement this. A skeleton has been created, which adds a menu entry.

Now we should actually make it do something.

* Collect all the linked issues by link type (TopDesk)
* Generate a POST request for each and send it into the great unknown

Don't worry about responses yet. 
Don't worry about actually hitting an end point yet.
 
* Extra Credit 1: Determine how to show the menu entry conditionally. Say based on a role?
* Extra Credit 2: Refresh the Icon of each link after the status is sent.

# Where to start

## Clone

Clone this.

## Install the [Atlassian SDK](https://developer.atlassian.com/jiradev/getting-started/getting-started-with-plugins2) 

Here are the SDK commands you'll use immediately:

* atlas-run   -- installs this plugin into the product and starts it on localhost
* atlas-debug -- same as atlas-run, but allows a debugger to attach at port 5005
* atlas-cli   -- after atlas-run or atlas-debug, opens a Maven command line window:
                 - 'pi' reinstalls the plugin into the running product instance
* atlas-help  -- prints description for all commands in the SDK

## Install the Web Fragment Finder
This free plugin will give you some hints as to the different UI components in Jira. After you have started up the development
instance by running atlas-run you can install this [free plugin](https://marketplace.atlassian.com/plugins/com.wittified.webfragment-finder/cloud/overview)

## Look at these pages
These may be relevant

* [Web Section](https://developer.atlassian.com/jiradev/jira-platform/building-jira-add-ons/jira-plugins2-overview/jira-plugin-module-types/web-section-plugin-module)
* [Web Items](https://developer.atlassian.com/jiradev/jira-platform/building-jira-add-ons/jira-plugins2-overview/jira-plugin-module-types/web-item-plugin-module)
* [Issue Link Renderer](https://developer.atlassian.com/jiradev/jira-platform/building-jira-add-ons/jira-plugins2-overview/jira-plugin-module-types/issue-link-renderer-plugin-module)
* [Rest Module](https://developer.atlassian.com/jiradev/jira-platform/building-jira-add-ons/jira-plugins2-overview/jira-plugin-module-types/rest-plugin-module-type)
* [Webwork Module](https://developer.atlassian.com/jiradev/jira-platform/building-jira-add-ons/jira-plugins2-overview/jira-plugin-module-types/rest-plugin-module-type)
