package util;

import com.alibaba.fastjson.JSON;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.*;
import com.atlassian.jira.rest.client.api.domain.input.*;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * @author ansiqi
 */
public class JiraUtil {
    private static final Logger logger = LoggerFactory.getLogger(JiraUtil.class);
    private static final String url = "https://jira.corp.100.me";
    static String user = "ansiqi";
    static String pwd = "Autotest1002";

    private static final String KEY = "TESTINFRA-39";

    public static void main(String[] args) {
        getIssue(KEY);

    }

    public static Issue getIssue(String issueKey) {
        JiraRestClient restClient = loginJira(url, user, pwd);
        Issue issue = restClient.getIssueClient().getIssue(issueKey).claim();
        System.out.println(JSON.toJSONString(issue));
//        logger.info(JSON.toJSONString(issue));
        return issue;
    }

    private static JiraRestClient loginJira(String url, String userName, String pwd) {
        AsynchronousJiraRestClientFactory asynchronousJiraRestClientFactory = new AsynchronousJiraRestClientFactory();
        JiraRestClient jiraRestClient = asynchronousJiraRestClientFactory.createWithBasicHttpAuthentication(URI.create(url), userName, pwd);
        return jiraRestClient;
    }
}
