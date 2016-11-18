package ut.com.praqma.plugins.atlassian.jira;

import org.junit.Test;
import com.praqma.plugins.atlassian.jira.api.MyPluginComponent;
import com.praqma.plugins.atlassian.jira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}