package utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {

	Config config = readFromConf();

	static Config readFromConf(){
		return ConfigFactory.systemProperties().hasPath("testProfile")
				? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
			    : ConfigFactory.load("application.conf");
	}

	String HELP_DESK_URL = readFromConf().getString("urls.helpDesk");
	String ADDTESS_BOOK_URL = readFromConf().getString("urls.addressBook");
	String USER_LOGIN = readFromConf().getString("usersParams.login");
	String USER_PASSWORD = readFromConf().getString("usersParams.password");
	String SUMMARY = readFromConf().getString("ticketData.summary");
	String QUEUE = readFromConf().getString("ticketData.queue");
	String DESCRIPTION = readFromConf().getString("ticketData.description");
	String PRIORITY = readFromConf().getString("ticketData.priority");
	String EMAIL = readFromConf().getString("ticketData.email");

}
