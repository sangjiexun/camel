/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mongodb;

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
public class MongoDbEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MongoDbEndpoint target = (MongoDbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "collection": target.setCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "collectionindex":
        case "collectionIndex": target.setCollectionIndex(property(camelContext, java.lang.String.class, value)); return true;
        case "consumertype":
        case "consumerType": target.setConsumerType(property(camelContext, java.lang.String.class, value)); return true;
        case "createcollection":
        case "createCollection": target.setCreateCollection(property(camelContext, boolean.class, value)); return true;
        case "cursorregenerationdelay":
        case "cursorRegenerationDelay": target.setCursorRegenerationDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "database": target.setDatabase(property(camelContext, java.lang.String.class, value)); return true;
        case "dynamicity": target.setDynamicity(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mongoconnection":
        case "mongoConnection": target.setMongoConnection(property(camelContext, com.mongodb.client.MongoClient.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, org.apache.camel.component.mongodb.MongoDbOperation.class, value)); return true;
        case "outputtype":
        case "outputType": target.setOutputType(property(camelContext, org.apache.camel.component.mongodb.MongoDbOutputType.class, value)); return true;
        case "persistentid":
        case "persistentId": target.setPersistentId(property(camelContext, java.lang.String.class, value)); return true;
        case "persistenttailtracking":
        case "persistentTailTracking": target.setPersistentTailTracking(property(camelContext, boolean.class, value)); return true;
        case "readpreference":
        case "readPreference": target.setReadPreference(property(camelContext, java.lang.String.class, value)); return true;
        case "streamfilter":
        case "streamFilter": target.setStreamFilter(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tailtrackcollection":
        case "tailTrackCollection": target.setTailTrackCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "tailtrackdb":
        case "tailTrackDb": target.setTailTrackDb(property(camelContext, java.lang.String.class, value)); return true;
        case "tailtrackfield":
        case "tailTrackField": target.setTailTrackField(property(camelContext, java.lang.String.class, value)); return true;
        case "tailtrackincreasingfield":
        case "tailTrackIncreasingField": target.setTailTrackIncreasingField(property(camelContext, java.lang.String.class, value)); return true;
        case "writeconcern":
        case "writeConcern": target.setWriteConcern(property(camelContext, java.lang.String.class, value)); return true;
        case "writeresultasheader":
        case "writeResultAsHeader": target.setWriteResultAsHeader(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("collection", java.lang.String.class);
        answer.put("collectionIndex", java.lang.String.class);
        answer.put("consumerType", java.lang.String.class);
        answer.put("createCollection", boolean.class);
        answer.put("cursorRegenerationDelay", long.class);
        answer.put("database", java.lang.String.class);
        answer.put("dynamicity", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("mongoConnection", com.mongodb.client.MongoClient.class);
        answer.put("operation", org.apache.camel.component.mongodb.MongoDbOperation.class);
        answer.put("outputType", org.apache.camel.component.mongodb.MongoDbOutputType.class);
        answer.put("persistentId", java.lang.String.class);
        answer.put("persistentTailTracking", boolean.class);
        answer.put("readPreference", java.lang.String.class);
        answer.put("streamFilter", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("tailTrackCollection", java.lang.String.class);
        answer.put("tailTrackDb", java.lang.String.class);
        answer.put("tailTrackField", java.lang.String.class);
        answer.put("tailTrackIncreasingField", java.lang.String.class);
        answer.put("writeConcern", java.lang.String.class);
        answer.put("writeResultAsHeader", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MongoDbEndpoint target = (MongoDbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "collection": return target.getCollection();
        case "collectionindex":
        case "collectionIndex": return target.getCollectionIndex();
        case "consumertype":
        case "consumerType": return target.getConsumerType();
        case "createcollection":
        case "createCollection": return target.isCreateCollection();
        case "cursorregenerationdelay":
        case "cursorRegenerationDelay": return target.getCursorRegenerationDelay();
        case "database": return target.getDatabase();
        case "dynamicity": return target.isDynamicity();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mongoconnection":
        case "mongoConnection": return target.getMongoConnection();
        case "operation": return target.getOperation();
        case "outputtype":
        case "outputType": return target.getOutputType();
        case "persistentid":
        case "persistentId": return target.getPersistentId();
        case "persistenttailtracking":
        case "persistentTailTracking": return target.isPersistentTailTracking();
        case "readpreference":
        case "readPreference": return target.getReadPreference();
        case "streamfilter":
        case "streamFilter": return target.getStreamFilter();
        case "synchronous": return target.isSynchronous();
        case "tailtrackcollection":
        case "tailTrackCollection": return target.getTailTrackCollection();
        case "tailtrackdb":
        case "tailTrackDb": return target.getTailTrackDb();
        case "tailtrackfield":
        case "tailTrackField": return target.getTailTrackField();
        case "tailtrackincreasingfield":
        case "tailTrackIncreasingField": return target.getTailTrackIncreasingField();
        case "writeconcern":
        case "writeConcern": return target.getWriteConcern();
        case "writeresultasheader":
        case "writeResultAsHeader": return target.isWriteResultAsHeader();
        default: return null;
        }
    }
}
