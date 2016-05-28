package snippet;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class Snippet {
	static String consumerKeyStr = "VLAXmfRNKGAAaSQYJY2UMfTLc";
	static String consumerSecretStr = "tBeD9eHHxnzVlRWaEYcUaEYn0a6mcp1clKRVoXRqxrv3ErKPYa";
	static String accessTokenStr = "2415754303-Hob7Xv1WeSliHkw36CFd2VUJb3JimiBmK7S2dBy";
	static String accessTokenSecretStr = "QSFiSydw5f9sDQHOIiGs7udI2nib6sS4WmCt2QeUwFzeC";
	

	public static void main(String[] args) throws Exception {
		OAuthConsumer oAuthConsumer = new CommonsHttpOAuthConsumer(consumerKeyStr,
				consumerSecretStr);
		oAuthConsumer.setTokenWithSecret(accessTokenStr, accessTokenSecretStr);

		HttpPost httpPost = new HttpPost(
				"http://api.twitter.com/1.1/statuses/update.json?status=Hello%20Twitter%20World.");

		oAuthConsumer.sign(httpPost);

		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpPost);

		int statusCode = httpResponse.getStatusLine().getStatusCode();
		//System.out.println(statusCode + 'hjdfdfu'+ httpResponse.getStatusLine().getReasonPhrase());
		System.out.println(IOUtils.toString(httpResponse.getEntity().getContent()));

	}
}
