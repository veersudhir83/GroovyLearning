#!/usr/bin/env groovy
/**
 * @ Maintainer sudheer veeravalli<veersudhir83@gmail.com>
 */

import groovy.json.JsonSlurper

import Utils
java.lang.String something = "testing"
def utils = new Utils();
utils.printSomething(something)

//def project = "veersudhir83/devops-web-maven"
//command = ["curl", "-X", "GET", "-H", "application/vnd.github.loki-preview+json", "https://api.github.com/repos/${project}/branches"]
//fullRepoDetails = command.execute().text


fullRepoDetails = '''
{
  "branch": {
    "name": "PREDIX_CLOUD_DEPLOY",
    "commit": {
      "sha": "8a7b255a335276d6c8e47377effe56761b25089a",
      "url": "https://api.github.com/repos/veersudhir83/devops-web-maven/commits/8a7b255a335276d6c8e47377effe56761b25089a"
    }
  },
  "branch": {
    "name": "master",
    "commit": {
      "sha": "262fbe5ee0b9440e1fec6f77fb5bdc03407abbd2",
      "url": "https://api.github.com/repos/veersudhir83/devops-web-maven/commits/262fbe5ee0b9440e1fec6f77fb5bdc03407abbd2"
    }
  }
}'''

println fullRepoDetails
jsonSlurper = new JsonSlurper()
def resultData = jsonSlurper.parseText(fullRepoDetails)
resultData.branch.each
{
    println it.value
}