# topdesk-linker
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
Install the [Atlassian SDK](https://developer.atlassian.com/jiradev/getting-started/getting-started-with-plugins2) 

Here are the SDK commands you'll use immediately:

* atlas-run   -- installs this plugin into the product and starts it on localhost
* atlas-debug -- same as atlas-run, but allows a debugger to attach at port 5005
* atlas-cli   -- after atlas-run or atlas-debug, opens a Maven command line window:
                 - 'pi' reinstalls the plugin into the running product instance
* atlas-help  -- prints description for all commands in the SDK

