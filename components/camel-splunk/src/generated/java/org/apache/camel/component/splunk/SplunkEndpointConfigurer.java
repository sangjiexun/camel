/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.splunk;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SplunkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SplunkEndpoint target = (SplunkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "app": target.getConfiguration().setApp(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "count": target.getConfiguration().setCount(property(camelContext, int.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "earliesttime":
        case "earliestTime": target.getConfiguration().setEarliestTime(property(camelContext, java.lang.String.class, value)); return true;
        case "eventhost":
        case "eventHost": target.getConfiguration().setEventHost(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "index": target.getConfiguration().setIndex(property(camelContext, java.lang.String.class, value)); return true;
        case "initearliesttime":
        case "initEarliestTime": target.getConfiguration().setInitEarliestTime(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "latesttime":
        case "latestTime": target.getConfiguration().setLatestTime(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "owner": target.getConfiguration().setOwner(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, int.class, value)); return true;
        case "raw": target.getConfiguration().setRaw(property(camelContext, boolean.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "savedsearch":
        case "savedSearch": target.getConfiguration().setSavedSearch(property(camelContext, java.lang.String.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "scheme": target.getConfiguration().setScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "search": target.getConfiguration().setSearch(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "source": target.getConfiguration().setSource(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcetype":
        case "sourceType": target.getConfiguration().setSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": target.getConfiguration().setSslProtocol(property(camelContext, com.splunk.SSLSecurityProtocol.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "streaming": target.getConfiguration().setStreaming(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tcpreceiverport":
        case "tcpReceiverPort": target.getConfiguration().setTcpReceiverPort(property(camelContext, int.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "usesunhttpshandler":
        case "useSunHttpsHandler": target.getConfiguration().setUseSunHttpsHandler(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("app", java.lang.String.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("connectionTimeout", int.class);
        answer.put("count", int.class);
        answer.put("delay", long.class);
        answer.put("earliestTime", java.lang.String.class);
        answer.put("eventHost", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("greedy", boolean.class);
        answer.put("host", java.lang.String.class);
        answer.put("index", java.lang.String.class);
        answer.put("initEarliestTime", java.lang.String.class);
        answer.put("initialDelay", long.class);
        answer.put("latestTime", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("owner", java.lang.String.class);
        answer.put("password", java.lang.String.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("port", int.class);
        answer.put("raw", boolean.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("savedSearch", java.lang.String.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.String.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("scheme", java.lang.String.class);
        answer.put("search", java.lang.String.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("source", java.lang.String.class);
        answer.put("sourceType", java.lang.String.class);
        answer.put("sslProtocol", com.splunk.SSLSecurityProtocol.class);
        answer.put("startScheduler", boolean.class);
        answer.put("streaming", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("tcpReceiverPort", int.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("useSunHttpsHandler", boolean.class);
        answer.put("username", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SplunkEndpoint target = (SplunkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "app": return target.getConfiguration().getApp();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConfiguration().getConnectionTimeout();
        case "count": return target.getConfiguration().getCount();
        case "delay": return target.getDelay();
        case "earliesttime":
        case "earliestTime": return target.getConfiguration().getEarliestTime();
        case "eventhost":
        case "eventHost": return target.getConfiguration().getEventHost();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "greedy": return target.isGreedy();
        case "host": return target.getConfiguration().getHost();
        case "index": return target.getConfiguration().getIndex();
        case "initearliesttime":
        case "initEarliestTime": return target.getConfiguration().getInitEarliestTime();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "latesttime":
        case "latestTime": return target.getConfiguration().getLatestTime();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "owner": return target.getConfiguration().getOwner();
        case "password": return target.getConfiguration().getPassword();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "port": return target.getConfiguration().getPort();
        case "raw": return target.getConfiguration().isRaw();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "savedsearch":
        case "savedSearch": return target.getConfiguration().getSavedSearch();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "scheme": return target.getConfiguration().getScheme();
        case "search": return target.getConfiguration().getSearch();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "source": return target.getConfiguration().getSource();
        case "sourcetype":
        case "sourceType": return target.getConfiguration().getSourceType();
        case "sslprotocol":
        case "sslProtocol": return target.getConfiguration().getSslProtocol();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "streaming": return target.getConfiguration().isStreaming();
        case "synchronous": return target.isSynchronous();
        case "tcpreceiverport":
        case "tcpReceiverPort": return target.getConfiguration().getTcpReceiverPort();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "usesunhttpshandler":
        case "useSunHttpsHandler": return target.getConfiguration().isUseSunHttpsHandler();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }
}
