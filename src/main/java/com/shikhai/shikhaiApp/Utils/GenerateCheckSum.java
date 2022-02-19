package com.shikhai.shikhaiApp.Utils;
import org.apache.commons.codec.digest.DigestUtils;
public class GenerateCheckSum {

	public static String getCheckSumParameterForQuery(String apiCall,
            String queryString, String bbbSalt) {
       
		if (bbbSalt != null)
            return "&checksum=" + DigestUtils.sha1Hex(apiCall + queryString + bbbSalt);
        else
            return "";
    }

}
