ERPE
=====================

[![Build Status](https://travis-ci.org/masterdany88/erpe.svg?branch=master)](https://travis-ci.org/masterdany88/erpe) 

Prerequisites
-------------

 * Maven 3 (run `mvn --version` on the command line to check)
 * An unzipped copy of WildFly 10 (Optional)

More detailed instructions can be found in our [Setup Tutorial](tutorial-guide/SETUP.adoc)

Build and deploy (production mode)
----------------

To build a .war file and deploy it to the local running WildFly instance:

    % mvn clean package wildfly:deploy

Once the above command has completed, you should be able to access the app at the following URL:

    http://localhost:8080/erpe

More detailed instructions can be found [here](tutorial-guide/RUN.adoc)

Code and Refresh (development mode)
----------------

Using GWT's Super Dev Mode, it is possible to instantly view changes to client-side code by simply refreshing the browser window. 
=======
    http://localhost:8080/erpe

Code and Refresh (development mode)
-----------------------------------

Using GWT's Super Dev Mode, it is possible to instantly view changes to client-side code simply by refreshing the browser window. 

If you're using the Google Plugin for Eclipse or IntelliJ Ultimate Edition follow [these instructions](http://docs.jboss.org/errai/latest/errai/reference/html_single/#_running_and_debugging_in_your_ide_using_gwt_tooling) to start development mode.

Alternatively, you should be able to start the demo in development mode with this single command:

    % mvn clean gwt:run

When the GWT Dev Mode window opens, press "Launch Default Browser" to start the app. You can now debug client-side code directly in the browser using source maps (make sure source maps are enabled in your browser). Alternatively, you can also configure a debug environment for Eclipse by installing

- newest gwt plugin for Eclipse: https://github.com/gwt-plugins/gwt-eclipse-plugin
- the Google Plugin for Eclipse: https://developers.google.com/eclipse/docs/download
- the SDBG plugin: http://sdbg.github.io/

To debug server-side code, set up a remote debugger on port 8001.
Then:
* Run `mvn clean gwt:debug`
* Start your remote debugger
* Press "Launch Default Browser"

See our development guide [here](tutorial-guide/DEVELOP.adoc) for more instructions on setting up dev mode and other details.


Tests
-----------------------------------

You can run unit tests by running the following command at the command prompt:

    mvn clean test

You can run integration tests by running the following command at the command prompt:

    mvn clean verify -P integration-test
    
    
Troubleshooting
---------------

Here are some resources that may help if you encounter difficulties:
* [email: daniel korbel](masterdany88 at gmail.com)
* [FAQ](tutorial-guide/FAQ.adoc)
* [Forum](https://community.jboss.org/en/errai)
* IRC : #errai @ freenode
