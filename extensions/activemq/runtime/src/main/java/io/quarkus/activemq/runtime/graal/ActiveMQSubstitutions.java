package io.quarkus.activemq.runtime.graal;

import org.apache.activemq.filter.XPathExpression.XPathEvaluator;

import com.oracle.svm.core.annotate.TargetClass;

public class ActiveMQSubstitutions {
}

@TargetClass(XPathEvaluator.class)
final class Target_org_apache_activemq_filter_XalanXPathEvaluator {

    //    @Substitute
    //    public Target_org_apache_activemq_filter_XalanXPathEvaluator() {
    //
    //    }

    //    @Substitute
    //    public boolean evaluate(Message message) throws JMSException {
    //        return false;
    //    }
}
