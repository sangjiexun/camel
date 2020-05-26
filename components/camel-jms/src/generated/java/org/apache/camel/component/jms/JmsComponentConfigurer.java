/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jms;

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
public class JmsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.jms.JmsConfiguration getOrCreateConfiguration(JmsComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.jms.JmsConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JmsComponent target = (JmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acceptmessageswhilestopping":
        case "acceptMessagesWhileStopping": getOrCreateConfiguration(target).setAcceptMessagesWhileStopping(property(camelContext, boolean.class, value)); return true;
        case "acknowledgementmodename":
        case "acknowledgementModeName": getOrCreateConfiguration(target).setAcknowledgementModeName(property(camelContext, java.lang.String.class, value)); return true;
        case "allowadditionalheaders":
        case "allowAdditionalHeaders": getOrCreateConfiguration(target).setAllowAdditionalHeaders(property(camelContext, java.lang.String.class, value)); return true;
        case "allowautowiredconnectionfactory":
        case "allowAutoWiredConnectionFactory": target.setAllowAutoWiredConnectionFactory(property(camelContext, boolean.class, value)); return true;
        case "allowautowireddestinationresolver":
        case "allowAutoWiredDestinationResolver": target.setAllowAutoWiredDestinationResolver(property(camelContext, boolean.class, value)); return true;
        case "allownullbody":
        case "allowNullBody": getOrCreateConfiguration(target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "allowreplymanagerquickstop":
        case "allowReplyManagerQuickStop": getOrCreateConfiguration(target).setAllowReplyManagerQuickStop(property(camelContext, boolean.class, value)); return true;
        case "allowserializedheaders":
        case "allowSerializedHeaders": getOrCreateConfiguration(target).setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "alwayscopymessage":
        case "alwaysCopyMessage": getOrCreateConfiguration(target).setAlwaysCopyMessage(property(camelContext, boolean.class, value)); return true;
        case "artemisstreamingenabled":
        case "artemisStreamingEnabled": getOrCreateConfiguration(target).setArtemisStreamingEnabled(property(camelContext, boolean.class, value)); return true;
        case "asyncconsumer":
        case "asyncConsumer": getOrCreateConfiguration(target).setAsyncConsumer(property(camelContext, boolean.class, value)); return true;
        case "asyncstartlistener":
        case "asyncStartListener": getOrCreateConfiguration(target).setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncstoplistener":
        case "asyncStopListener": getOrCreateConfiguration(target).setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "autoStartup": getOrCreateConfiguration(target).setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "cachelevel":
        case "cacheLevel": getOrCreateConfiguration(target).setCacheLevel(property(camelContext, int.class, value)); return true;
        case "cachelevelname":
        case "cacheLevelName": getOrCreateConfiguration(target).setCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": getOrCreateConfiguration(target).setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.jms.JmsConfiguration.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": getOrCreateConfiguration(target).setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "consumertype":
        case "consumerType": getOrCreateConfiguration(target).setConsumerType(property(camelContext, org.apache.camel.component.jms.ConsumerType.class, value)); return true;
        case "correlationproperty":
        case "correlationProperty": getOrCreateConfiguration(target).setCorrelationProperty(property(camelContext, java.lang.String.class, value)); return true;
        case "defaulttaskexecutortype":
        case "defaultTaskExecutorType": getOrCreateConfiguration(target).setDefaultTaskExecutorType(property(camelContext, org.apache.camel.component.jms.DefaultTaskExecutorType.class, value)); return true;
        case "deliverydelay":
        case "deliveryDelay": getOrCreateConfiguration(target).setDeliveryDelay(property(camelContext, long.class, value)); return true;
        case "deliverymode":
        case "deliveryMode": getOrCreateConfiguration(target).setDeliveryMode(property(camelContext, java.lang.Integer.class, value)); return true;
        case "deliverypersistent":
        case "deliveryPersistent": getOrCreateConfiguration(target).setDeliveryPersistent(property(camelContext, boolean.class, value)); return true;
        case "destinationresolver":
        case "destinationResolver": getOrCreateConfiguration(target).setDestinationResolver(property(camelContext, org.springframework.jms.support.destination.DestinationResolver.class, value)); return true;
        case "disablereplyto":
        case "disableReplyTo": getOrCreateConfiguration(target).setDisableReplyTo(property(camelContext, boolean.class, value)); return true;
        case "disabletimetolive":
        case "disableTimeToLive": getOrCreateConfiguration(target).setDisableTimeToLive(property(camelContext, boolean.class, value)); return true;
        case "durablesubscriptionname":
        case "durableSubscriptionName": getOrCreateConfiguration(target).setDurableSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "eagerloadingofproperties":
        case "eagerLoadingOfProperties": getOrCreateConfiguration(target).setEagerLoadingOfProperties(property(camelContext, boolean.class, value)); return true;
        case "eagerpoisonbody":
        case "eagerPoisonBody": getOrCreateConfiguration(target).setEagerPoisonBody(property(camelContext, java.lang.String.class, value)); return true;
        case "errorhandler":
        case "errorHandler": getOrCreateConfiguration(target).setErrorHandler(property(camelContext, org.springframework.util.ErrorHandler.class, value)); return true;
        case "errorhandlerlogstacktrace":
        case "errorHandlerLogStackTrace": getOrCreateConfiguration(target).setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "errorhandlerlogginglevel":
        case "errorHandlerLoggingLevel": getOrCreateConfiguration(target).setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "exceptionlistener":
        case "exceptionListener": getOrCreateConfiguration(target).setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "explicitqosenabled":
        case "explicitQosEnabled": getOrCreateConfiguration(target).setExplicitQosEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "exposelistenersession":
        case "exposeListenerSession": getOrCreateConfiguration(target).setExposeListenerSession(property(camelContext, boolean.class, value)); return true;
        case "forcesendoriginalmessage":
        case "forceSendOriginalMessage": getOrCreateConfiguration(target).setForceSendOriginalMessage(property(camelContext, boolean.class, value)); return true;
        case "formatdateheaderstoiso8601":
        case "formatDateHeadersToIso8601": getOrCreateConfiguration(target).setFormatDateHeadersToIso8601(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "idleconsumerlimit":
        case "idleConsumerLimit": getOrCreateConfiguration(target).setIdleConsumerLimit(property(camelContext, int.class, value)); return true;
        case "idletaskexecutionlimit":
        case "idleTaskExecutionLimit": getOrCreateConfiguration(target).setIdleTaskExecutionLimit(property(camelContext, int.class, value)); return true;
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": getOrCreateConfiguration(target).setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "includesentjmsmessageid":
        case "includeSentJMSMessageID": getOrCreateConfiguration(target).setIncludeSentJMSMessageID(property(camelContext, boolean.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": getOrCreateConfiguration(target).setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "jmsmessagetype":
        case "jmsMessageType": getOrCreateConfiguration(target).setJmsMessageType(property(camelContext, org.apache.camel.component.jms.JmsMessageType.class, value)); return true;
        case "lazycreatetransactionmanager":
        case "lazyCreateTransactionManager": getOrCreateConfiguration(target).setLazyCreateTransactionManager(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mapjmsmessage":
        case "mapJmsMessage": getOrCreateConfiguration(target).setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": getOrCreateConfiguration(target).setMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "maxmessagespertask":
        case "maxMessagesPerTask": getOrCreateConfiguration(target).setMaxMessagesPerTask(property(camelContext, int.class, value)); return true;
        case "messageconverter":
        case "messageConverter": getOrCreateConfiguration(target).setMessageConverter(property(camelContext, org.springframework.jms.support.converter.MessageConverter.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": getOrCreateConfiguration(target).setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.jms.MessageCreatedStrategy.class, value)); return true;
        case "messageidenabled":
        case "messageIdEnabled": getOrCreateConfiguration(target).setMessageIdEnabled(property(camelContext, boolean.class, value)); return true;
        case "messagelistenercontainerfactory":
        case "messageListenerContainerFactory": getOrCreateConfiguration(target).setMessageListenerContainerFactory(property(camelContext, org.apache.camel.component.jms.MessageListenerContainerFactory.class, value)); return true;
        case "messagetimestampenabled":
        case "messageTimestampEnabled": getOrCreateConfiguration(target).setMessageTimestampEnabled(property(camelContext, boolean.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "preservemessageqos":
        case "preserveMessageQos": getOrCreateConfiguration(target).setPreserveMessageQos(property(camelContext, boolean.class, value)); return true;
        case "priority": getOrCreateConfiguration(target).setPriority(property(camelContext, int.class, value)); return true;
        case "pubsubnolocal":
        case "pubSubNoLocal": getOrCreateConfiguration(target).setPubSubNoLocal(property(camelContext, boolean.class, value)); return true;
        case "queuebrowsestrategy":
        case "queueBrowseStrategy": target.setQueueBrowseStrategy(property(camelContext, org.apache.camel.component.jms.QueueBrowseStrategy.class, value)); return true;
        case "receivetimeout":
        case "receiveTimeout": getOrCreateConfiguration(target).setReceiveTimeout(property(camelContext, long.class, value)); return true;
        case "recoveryinterval":
        case "recoveryInterval": getOrCreateConfiguration(target).setRecoveryInterval(property(camelContext, long.class, value)); return true;
        case "replyto":
        case "replyTo": getOrCreateConfiguration(target).setReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "replytocachelevelname":
        case "replyToCacheLevelName": getOrCreateConfiguration(target).setReplyToCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "replytoconcurrentconsumers":
        case "replyToConcurrentConsumers": getOrCreateConfiguration(target).setReplyToConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytodeliverypersistent":
        case "replyToDeliveryPersistent": getOrCreateConfiguration(target).setReplyToDeliveryPersistent(property(camelContext, boolean.class, value)); return true;
        case "replytodestinationselectorname":
        case "replyToDestinationSelectorName": getOrCreateConfiguration(target).setReplyToDestinationSelectorName(property(camelContext, java.lang.String.class, value)); return true;
        case "replytomaxconcurrentconsumers":
        case "replyToMaxConcurrentConsumers": getOrCreateConfiguration(target).setReplyToMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytoontimeoutmaxconcurrentconsumers":
        case "replyToOnTimeoutMaxConcurrentConsumers": getOrCreateConfiguration(target).setReplyToOnTimeoutMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytooverride":
        case "replyToOverride": getOrCreateConfiguration(target).setReplyToOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "replytosamedestinationallowed":
        case "replyToSameDestinationAllowed": getOrCreateConfiguration(target).setReplyToSameDestinationAllowed(property(camelContext, boolean.class, value)); return true;
        case "replytotype":
        case "replyToType": getOrCreateConfiguration(target).setReplyToType(property(camelContext, org.apache.camel.component.jms.ReplyToType.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": getOrCreateConfiguration(target).setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "requesttimeoutcheckerinterval":
        case "requestTimeoutCheckerInterval": getOrCreateConfiguration(target).setRequestTimeoutCheckerInterval(property(camelContext, long.class, value)); return true;
        case "selector": getOrCreateConfiguration(target).setSelector(property(camelContext, java.lang.String.class, value)); return true;
        case "streammessagetypeenabled":
        case "streamMessageTypeEnabled": getOrCreateConfiguration(target).setStreamMessageTypeEnabled(property(camelContext, boolean.class, value)); return true;
        case "subscriptiondurable":
        case "subscriptionDurable": getOrCreateConfiguration(target).setSubscriptionDurable(property(camelContext, boolean.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": getOrCreateConfiguration(target).setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptionshared":
        case "subscriptionShared": getOrCreateConfiguration(target).setSubscriptionShared(property(camelContext, boolean.class, value)); return true;
        case "taskexecutor":
        case "taskExecutor": getOrCreateConfiguration(target).setTaskExecutor(property(camelContext, org.springframework.core.task.TaskExecutor.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": getOrCreateConfiguration(target).setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "timetolive":
        case "timeToLive": getOrCreateConfiguration(target).setTimeToLive(property(camelContext, long.class, value)); return true;
        case "transacted": getOrCreateConfiguration(target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transactionmanager":
        case "transactionManager": getOrCreateConfiguration(target).setTransactionManager(property(camelContext, org.springframework.transaction.PlatformTransactionManager.class, value)); return true;
        case "transactionname":
        case "transactionName": getOrCreateConfiguration(target).setTransactionName(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimeout":
        case "transactionTimeout": getOrCreateConfiguration(target).setTransactionTimeout(property(camelContext, int.class, value)); return true;
        case "transferexception":
        case "transferException": getOrCreateConfiguration(target).setTransferException(property(camelContext, boolean.class, value)); return true;
        case "transferexchange":
        case "transferExchange": getOrCreateConfiguration(target).setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "usemessageidascorrelationid":
        case "useMessageIDAsCorrelationID": getOrCreateConfiguration(target).setUseMessageIDAsCorrelationID(property(camelContext, boolean.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "waitforprovisioncorrelationtobeupdatedcounter":
        case "waitForProvisionCorrelationToBeUpdatedCounter": getOrCreateConfiguration(target).setWaitForProvisionCorrelationToBeUpdatedCounter(property(camelContext, int.class, value)); return true;
        case "waitforprovisioncorrelationtobeupdatedthreadsleepingtime":
        case "waitForProvisionCorrelationToBeUpdatedThreadSleepingTime": getOrCreateConfiguration(target).setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("acceptMessagesWhileStopping", boolean.class);
        answer.put("acknowledgementModeName", java.lang.String.class);
        answer.put("allowAdditionalHeaders", java.lang.String.class);
        answer.put("allowAutoWiredConnectionFactory", boolean.class);
        answer.put("allowAutoWiredDestinationResolver", boolean.class);
        answer.put("allowNullBody", boolean.class);
        answer.put("allowReplyManagerQuickStop", boolean.class);
        answer.put("allowSerializedHeaders", boolean.class);
        answer.put("alwaysCopyMessage", boolean.class);
        answer.put("artemisStreamingEnabled", boolean.class);
        answer.put("asyncConsumer", boolean.class);
        answer.put("asyncStartListener", boolean.class);
        answer.put("asyncStopListener", boolean.class);
        answer.put("autoStartup", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("cacheLevel", int.class);
        answer.put("cacheLevelName", java.lang.String.class);
        answer.put("clientId", java.lang.String.class);
        answer.put("concurrentConsumers", int.class);
        answer.put("configuration", org.apache.camel.component.jms.JmsConfiguration.class);
        answer.put("connectionFactory", javax.jms.ConnectionFactory.class);
        answer.put("consumerType", org.apache.camel.component.jms.ConsumerType.class);
        answer.put("correlationProperty", java.lang.String.class);
        answer.put("defaultTaskExecutorType", org.apache.camel.component.jms.DefaultTaskExecutorType.class);
        answer.put("deliveryDelay", long.class);
        answer.put("deliveryMode", java.lang.Integer.class);
        answer.put("deliveryPersistent", boolean.class);
        answer.put("destinationResolver", org.springframework.jms.support.destination.DestinationResolver.class);
        answer.put("disableReplyTo", boolean.class);
        answer.put("disableTimeToLive", boolean.class);
        answer.put("durableSubscriptionName", java.lang.String.class);
        answer.put("eagerLoadingOfProperties", boolean.class);
        answer.put("eagerPoisonBody", java.lang.String.class);
        answer.put("errorHandler", org.springframework.util.ErrorHandler.class);
        answer.put("errorHandlerLogStackTrace", boolean.class);
        answer.put("errorHandlerLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("exceptionListener", javax.jms.ExceptionListener.class);
        answer.put("explicitQosEnabled", java.lang.Boolean.class);
        answer.put("exposeListenerSession", boolean.class);
        answer.put("forceSendOriginalMessage", boolean.class);
        answer.put("formatDateHeadersToIso8601", boolean.class);
        answer.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        answer.put("idleConsumerLimit", int.class);
        answer.put("idleTaskExecutionLimit", int.class);
        answer.put("includeAllJMSXProperties", boolean.class);
        answer.put("includeSentJMSMessageID", boolean.class);
        answer.put("jmsKeyFormatStrategy", org.apache.camel.component.jms.JmsKeyFormatStrategy.class);
        answer.put("jmsMessageType", org.apache.camel.component.jms.JmsMessageType.class);
        answer.put("lazyCreateTransactionManager", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("mapJmsMessage", boolean.class);
        answer.put("maxConcurrentConsumers", int.class);
        answer.put("maxMessagesPerTask", int.class);
        answer.put("messageConverter", org.springframework.jms.support.converter.MessageConverter.class);
        answer.put("messageCreatedStrategy", org.apache.camel.component.jms.MessageCreatedStrategy.class);
        answer.put("messageIdEnabled", boolean.class);
        answer.put("messageListenerContainerFactory", org.apache.camel.component.jms.MessageListenerContainerFactory.class);
        answer.put("messageTimestampEnabled", boolean.class);
        answer.put("password", java.lang.String.class);
        answer.put("preserveMessageQos", boolean.class);
        answer.put("priority", int.class);
        answer.put("pubSubNoLocal", boolean.class);
        answer.put("queueBrowseStrategy", org.apache.camel.component.jms.QueueBrowseStrategy.class);
        answer.put("receiveTimeout", long.class);
        answer.put("recoveryInterval", long.class);
        answer.put("replyTo", java.lang.String.class);
        answer.put("replyToCacheLevelName", java.lang.String.class);
        answer.put("replyToConcurrentConsumers", int.class);
        answer.put("replyToDeliveryPersistent", boolean.class);
        answer.put("replyToDestinationSelectorName", java.lang.String.class);
        answer.put("replyToMaxConcurrentConsumers", int.class);
        answer.put("replyToOnTimeoutMaxConcurrentConsumers", int.class);
        answer.put("replyToOverride", java.lang.String.class);
        answer.put("replyToSameDestinationAllowed", boolean.class);
        answer.put("replyToType", org.apache.camel.component.jms.ReplyToType.class);
        answer.put("requestTimeout", long.class);
        answer.put("requestTimeoutCheckerInterval", long.class);
        answer.put("selector", java.lang.String.class);
        answer.put("streamMessageTypeEnabled", boolean.class);
        answer.put("subscriptionDurable", boolean.class);
        answer.put("subscriptionName", java.lang.String.class);
        answer.put("subscriptionShared", boolean.class);
        answer.put("taskExecutor", org.springframework.core.task.TaskExecutor.class);
        answer.put("testConnectionOnStartup", boolean.class);
        answer.put("timeToLive", long.class);
        answer.put("transacted", boolean.class);
        answer.put("transactionManager", org.springframework.transaction.PlatformTransactionManager.class);
        answer.put("transactionName", java.lang.String.class);
        answer.put("transactionTimeout", int.class);
        answer.put("transferException", boolean.class);
        answer.put("transferExchange", boolean.class);
        answer.put("useMessageIDAsCorrelationID", boolean.class);
        answer.put("username", java.lang.String.class);
        answer.put("waitForProvisionCorrelationToBeUpdatedCounter", int.class);
        answer.put("waitForProvisionCorrelationToBeUpdatedThreadSleepingTime", long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JmsComponent target = (JmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acceptmessageswhilestopping":
        case "acceptMessagesWhileStopping": return getOrCreateConfiguration(target).isAcceptMessagesWhileStopping();
        case "acknowledgementmodename":
        case "acknowledgementModeName": return getOrCreateConfiguration(target).getAcknowledgementModeName();
        case "allowadditionalheaders":
        case "allowAdditionalHeaders": return getOrCreateConfiguration(target).getAllowAdditionalHeaders();
        case "allowautowiredconnectionfactory":
        case "allowAutoWiredConnectionFactory": return target.isAllowAutoWiredConnectionFactory();
        case "allowautowireddestinationresolver":
        case "allowAutoWiredDestinationResolver": return target.isAllowAutoWiredDestinationResolver();
        case "allownullbody":
        case "allowNullBody": return getOrCreateConfiguration(target).isAllowNullBody();
        case "allowreplymanagerquickstop":
        case "allowReplyManagerQuickStop": return getOrCreateConfiguration(target).isAllowReplyManagerQuickStop();
        case "allowserializedheaders":
        case "allowSerializedHeaders": return getOrCreateConfiguration(target).isAllowSerializedHeaders();
        case "alwayscopymessage":
        case "alwaysCopyMessage": return getOrCreateConfiguration(target).isAlwaysCopyMessage();
        case "artemisstreamingenabled":
        case "artemisStreamingEnabled": return getOrCreateConfiguration(target).isArtemisStreamingEnabled();
        case "asyncconsumer":
        case "asyncConsumer": return getOrCreateConfiguration(target).isAsyncConsumer();
        case "asyncstartlistener":
        case "asyncStartListener": return getOrCreateConfiguration(target).isAsyncStartListener();
        case "asyncstoplistener":
        case "asyncStopListener": return getOrCreateConfiguration(target).isAsyncStopListener();
        case "autostartup":
        case "autoStartup": return getOrCreateConfiguration(target).isAutoStartup();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "cachelevel":
        case "cacheLevel": return getOrCreateConfiguration(target).getCacheLevel();
        case "cachelevelname":
        case "cacheLevelName": return getOrCreateConfiguration(target).getCacheLevelName();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "concurrentconsumers":
        case "concurrentConsumers": return getOrCreateConfiguration(target).getConcurrentConsumers();
        case "configuration": return target.getConfiguration();
        case "connectionfactory":
        case "connectionFactory": return getOrCreateConfiguration(target).getConnectionFactory();
        case "consumertype":
        case "consumerType": return getOrCreateConfiguration(target).getConsumerType();
        case "correlationproperty":
        case "correlationProperty": return getOrCreateConfiguration(target).getCorrelationProperty();
        case "defaulttaskexecutortype":
        case "defaultTaskExecutorType": return getOrCreateConfiguration(target).getDefaultTaskExecutorType();
        case "deliverydelay":
        case "deliveryDelay": return getOrCreateConfiguration(target).getDeliveryDelay();
        case "deliverymode":
        case "deliveryMode": return getOrCreateConfiguration(target).getDeliveryMode();
        case "deliverypersistent":
        case "deliveryPersistent": return getOrCreateConfiguration(target).isDeliveryPersistent();
        case "destinationresolver":
        case "destinationResolver": return getOrCreateConfiguration(target).getDestinationResolver();
        case "disablereplyto":
        case "disableReplyTo": return getOrCreateConfiguration(target).isDisableReplyTo();
        case "disabletimetolive":
        case "disableTimeToLive": return getOrCreateConfiguration(target).isDisableTimeToLive();
        case "durablesubscriptionname":
        case "durableSubscriptionName": return getOrCreateConfiguration(target).getDurableSubscriptionName();
        case "eagerloadingofproperties":
        case "eagerLoadingOfProperties": return getOrCreateConfiguration(target).isEagerLoadingOfProperties();
        case "eagerpoisonbody":
        case "eagerPoisonBody": return getOrCreateConfiguration(target).getEagerPoisonBody();
        case "errorhandler":
        case "errorHandler": return getOrCreateConfiguration(target).getErrorHandler();
        case "errorhandlerlogstacktrace":
        case "errorHandlerLogStackTrace": return getOrCreateConfiguration(target).isErrorHandlerLogStackTrace();
        case "errorhandlerlogginglevel":
        case "errorHandlerLoggingLevel": return getOrCreateConfiguration(target).getErrorHandlerLoggingLevel();
        case "exceptionlistener":
        case "exceptionListener": return getOrCreateConfiguration(target).getExceptionListener();
        case "explicitqosenabled":
        case "explicitQosEnabled": return getOrCreateConfiguration(target).getExplicitQosEnabled();
        case "exposelistenersession":
        case "exposeListenerSession": return getOrCreateConfiguration(target).isExposeListenerSession();
        case "forcesendoriginalmessage":
        case "forceSendOriginalMessage": return getOrCreateConfiguration(target).isForceSendOriginalMessage();
        case "formatdateheaderstoiso8601":
        case "formatDateHeadersToIso8601": return getOrCreateConfiguration(target).isFormatDateHeadersToIso8601();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "idleconsumerlimit":
        case "idleConsumerLimit": return getOrCreateConfiguration(target).getIdleConsumerLimit();
        case "idletaskexecutionlimit":
        case "idleTaskExecutionLimit": return getOrCreateConfiguration(target).getIdleTaskExecutionLimit();
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": return getOrCreateConfiguration(target).isIncludeAllJMSXProperties();
        case "includesentjmsmessageid":
        case "includeSentJMSMessageID": return getOrCreateConfiguration(target).isIncludeSentJMSMessageID();
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": return getOrCreateConfiguration(target).getJmsKeyFormatStrategy();
        case "jmsmessagetype":
        case "jmsMessageType": return getOrCreateConfiguration(target).getJmsMessageType();
        case "lazycreatetransactionmanager":
        case "lazyCreateTransactionManager": return getOrCreateConfiguration(target).isLazyCreateTransactionManager();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mapjmsmessage":
        case "mapJmsMessage": return getOrCreateConfiguration(target).isMapJmsMessage();
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return getOrCreateConfiguration(target).getMaxConcurrentConsumers();
        case "maxmessagespertask":
        case "maxMessagesPerTask": return getOrCreateConfiguration(target).getMaxMessagesPerTask();
        case "messageconverter":
        case "messageConverter": return getOrCreateConfiguration(target).getMessageConverter();
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": return getOrCreateConfiguration(target).getMessageCreatedStrategy();
        case "messageidenabled":
        case "messageIdEnabled": return getOrCreateConfiguration(target).isMessageIdEnabled();
        case "messagelistenercontainerfactory":
        case "messageListenerContainerFactory": return getOrCreateConfiguration(target).getMessageListenerContainerFactory();
        case "messagetimestampenabled":
        case "messageTimestampEnabled": return getOrCreateConfiguration(target).isMessageTimestampEnabled();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "preservemessageqos":
        case "preserveMessageQos": return getOrCreateConfiguration(target).isPreserveMessageQos();
        case "priority": return getOrCreateConfiguration(target).getPriority();
        case "pubsubnolocal":
        case "pubSubNoLocal": return getOrCreateConfiguration(target).isPubSubNoLocal();
        case "queuebrowsestrategy":
        case "queueBrowseStrategy": return target.getQueueBrowseStrategy();
        case "receivetimeout":
        case "receiveTimeout": return getOrCreateConfiguration(target).getReceiveTimeout();
        case "recoveryinterval":
        case "recoveryInterval": return getOrCreateConfiguration(target).getRecoveryInterval();
        case "replyto":
        case "replyTo": return getOrCreateConfiguration(target).getReplyTo();
        case "replytocachelevelname":
        case "replyToCacheLevelName": return getOrCreateConfiguration(target).getReplyToCacheLevelName();
        case "replytoconcurrentconsumers":
        case "replyToConcurrentConsumers": return getOrCreateConfiguration(target).getReplyToConcurrentConsumers();
        case "replytodeliverypersistent":
        case "replyToDeliveryPersistent": return getOrCreateConfiguration(target).isReplyToDeliveryPersistent();
        case "replytodestinationselectorname":
        case "replyToDestinationSelectorName": return getOrCreateConfiguration(target).getReplyToDestinationSelectorName();
        case "replytomaxconcurrentconsumers":
        case "replyToMaxConcurrentConsumers": return getOrCreateConfiguration(target).getReplyToMaxConcurrentConsumers();
        case "replytoontimeoutmaxconcurrentconsumers":
        case "replyToOnTimeoutMaxConcurrentConsumers": return getOrCreateConfiguration(target).getReplyToOnTimeoutMaxConcurrentConsumers();
        case "replytooverride":
        case "replyToOverride": return getOrCreateConfiguration(target).getReplyToOverride();
        case "replytosamedestinationallowed":
        case "replyToSameDestinationAllowed": return getOrCreateConfiguration(target).isReplyToSameDestinationAllowed();
        case "replytotype":
        case "replyToType": return getOrCreateConfiguration(target).getReplyToType();
        case "requesttimeout":
        case "requestTimeout": return getOrCreateConfiguration(target).getRequestTimeout();
        case "requesttimeoutcheckerinterval":
        case "requestTimeoutCheckerInterval": return getOrCreateConfiguration(target).getRequestTimeoutCheckerInterval();
        case "selector": return getOrCreateConfiguration(target).getSelector();
        case "streammessagetypeenabled":
        case "streamMessageTypeEnabled": return getOrCreateConfiguration(target).isStreamMessageTypeEnabled();
        case "subscriptiondurable":
        case "subscriptionDurable": return getOrCreateConfiguration(target).isSubscriptionDurable();
        case "subscriptionname":
        case "subscriptionName": return getOrCreateConfiguration(target).getSubscriptionName();
        case "subscriptionshared":
        case "subscriptionShared": return getOrCreateConfiguration(target).isSubscriptionShared();
        case "taskexecutor":
        case "taskExecutor": return getOrCreateConfiguration(target).getTaskExecutor();
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return getOrCreateConfiguration(target).isTestConnectionOnStartup();
        case "timetolive":
        case "timeToLive": return getOrCreateConfiguration(target).getTimeToLive();
        case "transacted": return getOrCreateConfiguration(target).isTransacted();
        case "transactionmanager":
        case "transactionManager": return getOrCreateConfiguration(target).getTransactionManager();
        case "transactionname":
        case "transactionName": return getOrCreateConfiguration(target).getTransactionName();
        case "transactiontimeout":
        case "transactionTimeout": return getOrCreateConfiguration(target).getTransactionTimeout();
        case "transferexception":
        case "transferException": return getOrCreateConfiguration(target).isTransferException();
        case "transferexchange":
        case "transferExchange": return getOrCreateConfiguration(target).isTransferExchange();
        case "usemessageidascorrelationid":
        case "useMessageIDAsCorrelationID": return getOrCreateConfiguration(target).isUseMessageIDAsCorrelationID();
        case "username": return getOrCreateConfiguration(target).getUsername();
        case "waitforprovisioncorrelationtobeupdatedcounter":
        case "waitForProvisionCorrelationToBeUpdatedCounter": return getOrCreateConfiguration(target).getWaitForProvisionCorrelationToBeUpdatedCounter();
        case "waitforprovisioncorrelationtobeupdatedthreadsleepingtime":
        case "waitForProvisionCorrelationToBeUpdatedThreadSleepingTime": return getOrCreateConfiguration(target).getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        default: return null;
        }
    }
}
