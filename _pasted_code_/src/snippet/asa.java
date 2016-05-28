package snippet;


import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class asa {

	static String consumerKeyStr = "VLAXmfRNKGAAaSQYJY2UMfTLc";
	static String consumerSecretStr = "tBeD9eHHxnzVlRWaEYcUaEYn0a6mcp1clKRVoXRqxrv3ErKPYa";
	static String accessTokenStr = "2415754303-Hob7Xv1WeSliHkw36CFd2VUJb3JimiBmK7S2dBy";
	static String accessTokenSecretStr = "QSFiSydw5f9sDQHOIiGs7udI2nib6sS4WmCt2QeUwFzeC";
	static String [] names = {"rabs_in","wrivasp","bergamo_giorgia","Pam_A","YY3ai2ui24","richie_mccann","panduranganath","IntlChatter","thisiskirsty22","HimmiC","IRCSIA_srl"};

	public static void main(String[] args) {

		try {
			Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);
			for (int i=0 ; i<names.length;i++){
				System.out.println("hie garima");
			twitter.updateStatus("Hi, @"+names[i]+", We are hosting a #Free #Webnier on how to create 'Creating Food Review App in #Android', Visit http://goo.gl/55cgpF");
			}
			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
	}

}