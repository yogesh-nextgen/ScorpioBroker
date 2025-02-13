package eu.neclab.ngsildbroker.commons.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @date 12-Jul-2018
 */

public class AppConstants {

	// entities URL for
	public final static String ENTITES_URL = "/ngsi-ld/v1/entities/";
	public final static int ENTITIES_URL_ID = 0;
	// csource URL
	public final static String CSOURCE_URL = "/ngsi-ld/v1/csourceRegistrations/";
	public final static int CSOURCE_URL_ID = 1;
	//history
	public final static String HISTORY_URL="/ngsi-ld/v1/temporal/entities/";
	public final static int HISTORY_URL_ID = 2;
	//subscriptions
	public final static String SUBSCRIPTIONS_URL="/ngsi-ld/v1/subscriptions/";
	public final static int SUBSCRIPTIONS_URL_ID = 3;
	public static final int BATCH_URL_ID = 4;
	public final static int INTERNAL_CALL_ID = 5;
	
	public final static String NGB_APPLICATION_JSON="application/json";
	public final static String NGB_APPLICATION_NQUADS="application/n-quads";
	public final static String NGB_APPLICATION_JSONLD="application/ld+json";
	public final static String NGB_APPLICATION_GENERIC ="application/*";
	public final static String NGB_GENERIC_GENERIC ="*/*";
	
	//allowed geometry types in queries params.
	public final static List<String> NGB_ALLOWED_GEOM_LIST=new ArrayList<String>(Arrays.asList("POINT","POLYGON"));
	
	
	public final static byte[] NULL_BYTES = "null".getBytes();
	public static final String CORE_CONTEXT_URL_SUFFIX = "ngsi-ld-core-context";
	
	//constants for swagger
	public final static String SWAGGER_WEBSITE_LINK = "https://github.com/ScorpioBroker/ScorpioBroker";
	public final static String SWAGGER_CONTACT_LINK = "https://github.com/ScorpioBroker/ScorpioBroker";
	public static final int OPERATION_CREATE_ENTITY = 0;
	public static final int OPERATION_UPDATE_ENTITY = 1;
	public static final int OPERATION_APPEND_ENTITY = 2;	
	public static final int OPERATION_DELETE_ATTRIBUTE_ENTITY = 3;
	public static final int OPERATION_CREATE_HISTORY_ENTITY = 4;
	public static final int OPERATION_UPDATE_HISTORY_ENTITY = 5;
	public static final int OPERATION_APPEND_HISTORY_ENTITY = 6;
	public static final int OPERATION_DELETE_ATTRIBUTE_HISTORY_ENTITY = 7;
	public static final int OPERATION_DELETE_ENTITY = 8;
	public static final String REQUEST_KV = "kv";
	public static final String REQUEST_WA = "withAttrs";
	public static final String REQUEST_WOA = "withoutAtts";
	public static final String REQUEST_T = "type";
	public static final String REQUEST_ID = "id";
	public static final String REQUEST_OV = "ov";	
	public static final String REQUEST_HD = "headers";
	public static final String REQUEST_CSOURCE = "CSource";
	//public static final String TENANT_HEADER = "ngsild-tenant";
	public static final String INTERNAL_NULL_KEY = ")$%^&";
	
	
	

}
